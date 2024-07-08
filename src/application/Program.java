package application;

import boardgame.Position;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Position pos = new Position(3, 5);
        System.out.println(pos);
    }
}