package org.fasttrackit.enums;

public enum CardinalPoints {
    NORTH("N"),
    SOUTH("S"),
    EAST("E"),
    WEST("W");

    private final String symbol;

    CardinalPoints(String symbol){
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
