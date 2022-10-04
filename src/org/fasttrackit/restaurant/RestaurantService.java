package org.fasttrackit.restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestaurantService {

    private final List<Restaurant> restaurants;

    public RestaurantService(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    List<Restaurant> getRestaurantsFromCity(String city){
        List<Restaurant> result = new ArrayList<>();
        for(Restaurant restaurant : restaurants){
            if(city==null || restaurant.city().equals(city)){
                result.add(restaurant);
            }
        }
        return result;
    }

    List<Restaurant> getRestaurantsOfType(RestaurantType type){
        List<Restaurant> result = new ArrayList<>();
        for(Restaurant restaurant : restaurants){
            if(type==null || restaurant.type()==type){
                result.add(restaurant);
            }
        }
        return result;
    }

    Map<Restaurant, RestaurantType> mapRestaurantType(){
        Map<Restaurant, RestaurantType> result = new HashMap<>();
        for(Restaurant restaurant : restaurants){
            result.put(restaurant, restaurant.type());
        }
        return result;
    }

    Map<RestaurantType, List<Restaurant>> mapToType(){
        Map<RestaurantType, List<Restaurant>> result = new HashMap<>();
        for(Restaurant restaurant : restaurants){
            RestaurantType type = restaurant.type();
            if(!result.containsKey(type)){
                result.put(type, new ArrayList<>());
            }
            result.get(type).add(restaurant);
        }
        return result;

    }

}
