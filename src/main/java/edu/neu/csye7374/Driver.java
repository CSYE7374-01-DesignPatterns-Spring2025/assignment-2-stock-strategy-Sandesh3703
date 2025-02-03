package edu.neu.csye7374;

/**
 * 
 * @author Yesha
 * 
 */

public class Driver {
	public static void main(String[] args) {
		System.out.println("============Main Execution Start===================\n\n");

        // Create stock instances
        Stock techStock = new TechStock(100.0);
        Stock energyStock = new EnergyStock(100.0);

        // Create strategy instances
        PricingStrategy bullStrategy = new BullMarketStrategy();
        PricingStrategy bearStrategy = new BearMarketStrategy();

        // Use Bull Market Strategy
        techStock.setStrategy(bullStrategy);
        energyStock.setStrategy(bullStrategy);

        techStock.updatePrice();
        energyStock.updatePrice();

        System.out.println("Tech Stock Price (Bull Market): " + techStock.getPrice());
        System.out.println("Energy Stock Price (Bull Market): " + energyStock.getPrice());

        // Switch to Bear Market Strategy
        techStock.setStrategy(bearStrategy);
        energyStock.setStrategy(bearStrategy);

        techStock.updatePrice();
        energyStock.updatePrice();

        System.out.println("Tech Stock Price (Bear Market): " + techStock.getPrice());
        System.out.println("Energy Stock Price (Bear Market): " + energyStock.getPrice());

		System.out.println("\n\n============Main Execution End===================");
	}

}
