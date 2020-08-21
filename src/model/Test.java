package model;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws Exception {

        Graph g = new Graph();
        g.initialize();
        g.printGraph();
        g.ermittle();
        g.PrintDistanceMatrix();
        g.exzentrizitaet();
        g.radiusUndDurchmesser();
        g.zentrum();
        System.out.print("\n-------------Zusammenhaengend-------------\n");
        System.out.print(g.isZusammenhaengend());
        System.out.print("\n----------komponentenanzahl--------------\n");
        System.out.print(g.komponentenanzahl());
        System.out.print("\n----------Komponenten--------------\n");
        System.out.print(g.komponenteAusgeben());






    }
}
