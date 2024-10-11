package model;

public class VIPDonatur extends Donatur {
    private final double discount;

    public VIPDonatur(String name, String email) {
        super(name, email);
        this.discount = 0.10; // 10% discount for VIP Donatur
    }

    public double getDiscount() {
        return discount;
    }

    public String getDonaturType() {
        return "VIP Donatur";
    }
}
