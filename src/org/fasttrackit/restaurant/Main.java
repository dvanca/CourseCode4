package org.fasttrackit.restaurant;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RestaurantService restaurantService = new RestaurantService(List.of(
                new Restaurant("KFC", "Oradea", RestaurantType.FUSION, 3),
                new Restaurant("Mesopotamia", "Cluj Napoca", RestaurantType.FUSION, 5),
                new Restaurant("Marty", "Oradea", RestaurantType.GREEK, 2),
                new Restaurant("La Gigel", "Oradea", RestaurantType.ROMANIAN, 3)
        ));

        System.out.println(restaurantService.getRestaurantsFromCity("Oradea"));
    }
}
