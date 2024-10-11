package model;

public class RegularDonatur extends Donatur {
    public RegularDonatur(String name, String email) {
        super(name, email);
    }

    public String getDonaturType() {
        return "Regular Donatur";
    }
}
