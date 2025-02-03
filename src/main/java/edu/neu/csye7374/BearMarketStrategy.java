package edu.neu.csye7374;

public class BearMarketStrategy implements PricingStrategy {
    @Override
    public double calculateNewPrice(Stock stock) {
        if (stock.getType().equals("Tech")) {
            return stock.getPrice() * 0.90; // Decrease by 10% for Tech stocks
        } else if (stock.getType().equals("Energy")) {
            return stock.getPrice() * 0.95; // Decrease by 5% for Energy stocks
        }
        return stock.getPrice(); // Default: no change
    }
}