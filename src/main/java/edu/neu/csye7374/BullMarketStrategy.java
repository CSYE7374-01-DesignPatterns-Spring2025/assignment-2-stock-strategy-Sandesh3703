package edu.neu.csye7374;

public class BullMarketStrategy implements PricingStrategy {
    @Override
    public double calculateNewPrice(Stock stock) {
        if (stock.getType().equals("Tech")) {
            return stock.getPrice() * 1.10; // Increase by 10% for Tech stocks
        } else if (stock.getType().equals("Energy")) {
            return stock.getPrice() * 1.05; // Increase by 5% for Energy stocks
        }
        return stock.getPrice(); // Default: no change
    }
}