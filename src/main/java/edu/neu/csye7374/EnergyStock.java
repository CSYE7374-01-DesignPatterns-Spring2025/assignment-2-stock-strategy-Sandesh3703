package edu.neu.csye7374;

public class EnergyStock extends Stock {
    public EnergyStock(double initialPrice) {
        super(initialPrice);
    }

    @Override
    public String getType() {
        return "Energy";
    }
}