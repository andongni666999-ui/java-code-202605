package com.org.structure.flyweight;

public class ChessUnit {

    private Long id;

    private String text;

    private Color color;

    public ChessUnit(Long id, String text, Color color) {
        this.id = id;
        this.text = text;
        this.color = color;
    }

    public enum Color {
        RED,
        BLACK
    }

}
