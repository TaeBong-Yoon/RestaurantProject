package kr.co.bong.eatgo.domain;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTests {

    @Test
    public void creation() {
        Restaurant restaurant = Restaurant.builder()
                .id(1004L)
                .name("Curry House")
                .address("Seoul")
                .build();

        assertThat(restaurant.getId(), is(1004L));
        assertThat(restaurant.getName(), is("Curry House"));
        assertThat(restaurant.getAddress(), is("Seoul"));
    }

    @Test
    public void information(){
        Restaurant restaurant = Restaurant.builder()
                .id(1004L)
                .name("Curry House")
                .address("Seoul")
                .build();
        assertThat(restaurant.getInformation(),is("Curry House in Seoul"));
    }

}