package model;

public abstract class Donasi {
    private final String donorName;
    private double amount; // Changed to non-final to allow modification

    public Donasi(String donorName, double amount) {
        this.donorName = donorName;
        this.amount = amount;
    }

    public String getDonorName() {
        return donorName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) { // New setter method
        this.amount = amount;
    }

    public abstract String getDonasiType(); // Abstract method
}
