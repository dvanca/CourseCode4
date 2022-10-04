package org.fasttrackit.enums;

import java.util.Scanner;

public class EnumExercise {
    public static void main(String[] args) {
        CardinalPoints north = CardinalPoints.NORTH;
        CardinalPoints north2 = CardinalPoints.NORTH;

        System.out.println(north.getSymbol());

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        CardinalPoints fromKeyboard = CardinalPoints.valueOf(s);
        System.out.println(String.format("your cardinal point has symbol %s", fromKeyboard.getSymbol()));

        switch (fromKeyboard){
            case NORTH -> System.out.println("go up");
            case EAST -> System.out.println("go right");
            case WEST -> System.out.println("go left");
            case SOUTH -> System.out.println("go down");
        }
    }
}
