package org.fasttrackit.maps;

import java.sql.SQLOutput;
import java.util.*;

public class MapseExercise {
    public static void main(String[] args) {
        Map<String, Integer> nameToAge = new HashMap<>();
        nameToAge.put("John", 30);
        nameToAge.put("Mark",23);
        nameToAge.put("Angela",19);
        nameToAge.put("Martha",53);
        nameToAge.put("Parker",13);
        nameToAge.put("John", 40);

        System.out.println(nameToAge);
        System.out.println(nameToAge.keySet());

        if(!nameToAge.containsKey("Mark")){
            nameToAge.put("Mark", 33);
        }
        nameToAge.putIfAbsent("Mark", 33);
        System.out.println(nameToAge);

        System.out.println(nameToAge.get("Angela"));

        if(nameToAge.containsValue(40)){
            System.out.println("We have a 40 year old person");
        } else{
            System.out.println("No 40 year old person was found");
        }


        nameToAge.remove("Martha");
        System.out.println(nameToAge);

        Set<Map.Entry<String, Integer>> entries = nameToAge.entrySet();
        for(Map.Entry entry : entries){
            System.out.println(String.format("%s has %d years ", entry.getKey(), entry.getValue()));
        }

        Map<String , List<Integer>> grades = new HashMap<>();
        if(!grades.containsKey("Alex")){
            grades.put("Alex", new ArrayList<>());
        }

        grades.get("Alex").add(10);
        grades.get("Alex").add(7);

        System.out.println(grades);


    }



}
