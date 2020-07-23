package kr.co.bong.eatgo.domain;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTests {

    @Test
    public void creation() {
        Restaurant restaurant = new Restaurant("Curry House", "");
        assertThat(restaurant.getName(), is("Curry House"));
    }

    @Test
    public void information(){
        Restaurant restaurant = new Restaurant("Curry House", "Seoul");

        assertThat(restaurant.getInformation(),is("Curry House in Seoul"));
    }

}