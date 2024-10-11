package model;

public class RegularDonasi extends Donasi {
    public RegularDonasi(String donorName, double amount) {
        super(donorName, amount);
    }

    @Override
    public String getDonasiType() {
        return "Regular Donasi";
    }
}
