package com.klu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.portfolioproject.model.Holding;
import com.portfolioproject.model.Stock;
import com.portfolioproject.concurrent.PriceUpdateTask;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/** 
 * Unit test for simple Amp.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void readsCalculatedHoldingValueFromPortfolioJson() throws Exception {
        String json = """
                {
                  "holdingId": "holding-1",
                  "asset": {
                    "type": "stock",
                    "assetId": "stock-1",
                    "assetName": "Example Corp",
                    "purchasePrice": 10.0,
                    "currentPrice": 12.5
                  },
                  "quantity": 4,
                  "currentValue": 50.0
                }
                """;

        Holding holding = new ObjectMapper().readValue(json, Holding.class);

        assertEquals(50.0, holding.getCurrentValue(), 0.0);
    }

    @Test
    public void concurrentPriceUpdatesAreNotLost() throws Exception {
        Stock stock = new Stock("stock-1", "Example Corp", 10.0, 100.0);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        try {
            Future<Double> firstUpdate = executor.submit(new PriceUpdateTask(stock));
            Future<Double> secondUpdate = executor.submit(new PriceUpdateTask(stock));

            firstUpdate.get();
            secondUpdate.get();

            assertEquals(120.0, stock.getCurrentPrice(), 0.0);
        } finally {
            executor.shutdown();
        }
    }
}