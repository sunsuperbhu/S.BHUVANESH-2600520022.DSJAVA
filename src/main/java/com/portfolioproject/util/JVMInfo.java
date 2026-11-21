package com.portfolioproject.util;

public class JVMInfo 
{
    public static void displayJVMInfo() 
    {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("\n========== JVM INFORMATION ==========");
        System.out.println("Java Version: "+ System.getProperty("java.version"));
        System.out.println("JVM Name: "+ System.getProperty("java.vm.name"));
        System.out.println("Available Processors: "+ runtime.availableProcessors());
        System.out.println("Maximum Memory: " + runtime.maxMemory() / (1024 * 1024) + " MB");
        System.out.println("Total Memory: "+runtime.totalMemory() / (1024 * 1024) + " MB");
        System.out.println("Free Memory: " + runtime.freeMemory() / (1024 * 1024) + " MB");
    }
}
/* hello today is a good day and also a funny day and also your fish fish fish fish fi*/