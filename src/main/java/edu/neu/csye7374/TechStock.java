package edu.neu.csye7374;

public class TechStock extends Stock {
    public TechStock(double initialPrice) {
        super(initialPrice);
    }

    @Override
    public String getType() {
        return "Tech";
    }
}