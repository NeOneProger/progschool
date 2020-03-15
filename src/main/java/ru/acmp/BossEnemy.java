package ru.acmp;

/**
 * Created by alpha on 15.03.2020.
 */
public class BossEnemy extends Enemy {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void draw() {
        System.out.printf("%s(%d,%d,%d)\n", name, getX(), getY(), getHp());
    }

    public void setHp() {
        this.hp = 1000;
    }
}

