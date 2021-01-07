package com.mycompany.tests.Java;

public class Enemy {

   private int health;

    public void talk(){

        System.out.println("I am your enemy");
        System.out.println("You better run");

    }

    public void getHealth(){

        System.out.println(health);
    }

    public  void setHealth(int x){
        health=x;

    }
}
