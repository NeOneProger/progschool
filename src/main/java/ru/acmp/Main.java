package ru.acmp;

/**
 * Created by alpha on 15.03.2020.
 */
public class Main {
    public static void main(String[] args) {
        Enemy[] enemies = new Enemy[10];



        for(int i = 0; i < enemies.length; ++i){
            enemies[i] = new Enemy();
            enemies[i].setX(i + 7);
        }

        for (Enemy e : enemies) {
            e.draw();
        }
    }
}
