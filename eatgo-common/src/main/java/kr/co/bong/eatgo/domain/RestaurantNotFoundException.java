package kr.co.bong.eatgo.domain;

public class RestaurantNotFoundException extends RuntimeException {


    public RestaurantNotFoundException(long id) {

        super("Could not find Restaurant "+id);

    }
}
