package model;

public class LargeDonasi extends Donasi {
    public LargeDonasi(String donorName, double amount) {
        super(donorName, amount);
    }

    @Override
    public String getDonasiType() {
        return "Large Donasi";
    }
}
