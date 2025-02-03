package edu.neu.csye7374;

public abstract class Stock {
    protected double price;
    protected PricingStrategy strategy;

    public Stock(double initialPrice) {
        this.price = initialPrice;
    }

    public void setStrategy(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public void updatePrice() {
        if (strategy != null) {
            price = strategy.calculateNewPrice(this);
        }
    }

    public double getPrice() {
        return price;
    }

    public abstract String getType();
}