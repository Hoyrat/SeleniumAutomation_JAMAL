package com.mycompany.tests.Java;

public class Main {

    public static void main(String[] args) {



        Vampire vampire=new Vampire();
        WereWolf wereWolf=new WereWolf();



        vampire.talk();
         wereWolf.talk();


        Enemy enemy=vampire;
        enemy.talk();

        System.out.println("=================================");

        Enemy[] enemies={vampire,wereWolf};

        enemies[0].talk();
        enemies[1].talk();

        vampire.setHealth(25);
        vampire.getHealth();



    }

}
