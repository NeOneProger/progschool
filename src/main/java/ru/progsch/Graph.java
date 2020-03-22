package ru.progsch;

import java.util.Random;

/**
 * Created by alpha on 22.03.2020.
 */
public class Graph {
    private boolean[][] matrix;
    private int size;

    public Graph(int size) {
        this.size = size;
        matrix = new boolean[size][size];
    }

    public void setLink(int a, int b, boolean c){
        this.matrix[a][b] = c;
    }

    //------------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
//        int[][] graph = new int[4][4];

        Graph graph = new Graph(4);

        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                graph.setLink(i, j, random.nextBoolean());
                graph.get(i, j);
                graph.edgesCount();
            }
        }
    }
}
