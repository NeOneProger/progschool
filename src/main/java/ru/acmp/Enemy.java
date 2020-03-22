package ru.acmp;

/**
 * Created by alpha on 15.03.2020.
 */
public class Enemy {
    private int x;
    private int y;
    protected int hp;
    //-----------------------------------------------------------------------------------------------
    public void draw(){
        System.out.println("Enemy(" + x + "," + y + "," + hp + ")");
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setHp(){
        this.hp = 100;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getHp(){
        return hp;
    }

}
