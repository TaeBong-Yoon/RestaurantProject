package kr.co.bong.eatgo.domain;

public class Restaurant {
    private final String name;
    //private final String address;

    public Restaurant(String name, String address) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getInformation() {
        return name + " in "+ address;
    }
}
