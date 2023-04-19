//import java.lang.reflect.Method;
import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Item Class
        Item item = new Item("Name of the Item", "description of the item", 10);
        System.out.println(item);

        //Gold Class
        Gold goldBar = new Gold("City Gold", 50);
        System.out.println(goldBar);

        //Weapon Class
        Weapon magicSword = new Weapon("Magic_Sword", "Sharp cutter", 5, 7);
        System.out.println(magicSword);
        //Sword Class
        Sword sword = new Sword();
        System.out.println(sword);

        //Pillow Class
        Pillow pillow = new Pillow();
        System.out.println(pillow);

        //Mace Class
        Mace bigMace = new Mace();
        System.out.println(bigMace);

        //Arrow Class
        Arrow sharpArrow = new Arrow();
        System.out.println(sharpArrow);

        //Enemy Class
        Enemy enemy = new Enemy("Cell", 10, 20);
        System.out.println(enemy);

        //GreenOgre Class
        Ogre greenOgre = new Ogre();
        System.out.println(greenOgre);

        //RedOgre Class
        Ogre redOgre = new Ogre();
        System.out.println(redOgre);

        //SlowZombie Class
        Zombie slowZombie = new Zombie();
        System.out.println(slowZombie);

        //SlowZombie Class
        Zombie fastZombie = new Zombie();
        System.out.println(fastZombie);

        //Dog Class
        Dog spotDog = new Dog();
        System.out.println(spotDog);

        //GiantSpider Class
        GiantSpider giantSpider = new GiantSpider();
        System.out.println(giantSpider);

        //Cat Class
        RidwanCat ridwanCat = new RidwanCat();
        System.out.println(ridwanCat);


        Method method = Method.MoveWest;
        Enemy kwargs = null;

        // Create an instance of the Action class
        Action action = new Action( method,"Enemy Attacker", 'x', kwargs);

        // Print out the hotkey and name of the action
        System.out.println("Hotkey: " + action.getHotkey());
        System.out.println("Name: " + action.getName());

        //Method
        Method methodd = Method.MoveWest;

        if (methodd == Method.Flee) {
            System.out.println("Fleeing act");
        } else if (methodd == Method.ViewInventory) {
            System.out.println("Viewing inventory");
        } else if (method == Method.MoveEast) {
            System.out.println("Moving east");
        } else if (methodd == Method.MoveWest) {
            System.out.println("Moving west");
        } else if (methodd == Method.MoveSouth) {
            System.out.println("Moving south");
        } else if (methodd == Method.MoveNorth) {
            System.out.println("Moving north");
        } else if (methodd == Method.Swift) {
            System.out.println("Moving Swiftly!");
        }else {
            System.out.println("Unexpected Input");
        }
        //MoveNorth
        MoveNorth moveNorthAction = new MoveNorth();

        System.out.println("Action Name: " + moveNorthAction.getName());
        System.out.println("Hotkey: " + moveNorthAction.getHotkey());
        System.out.println("Keyword Arguments: " + moveNorthAction.getkwargs());

        //MoveEast
        MoveEast moveEastAction = new MoveEast();

        System.out.println("Action Name: " + moveEastAction.getName());
        System.out.println("Hotkey: " + moveEastAction.getHotkey());
        System.out.println("Keyword Arguments: " + moveEastAction.getkwargs());

        //Viewlnventory
        ViewInventory viewInventoryAction = new ViewInventory();

        System.out.println("Action Name: " + viewInventoryAction.getName());
        System.out.println("Hotkey: " + viewInventoryAction.getHotkey());
        System.out.println("Keyword Arguments: " + viewInventoryAction.getkwargs());

        Flee fleeAction = new Flee();

        System.out.println("Action Name: " + fleeAction.getName());
        System.out.println("Hotkey: " + fleeAction.getHotkey());
        System.out.println("Keyword Arguments: " + fleeAction.getkwargs());

        //MoveSouth
        MoveSouth MoveSouthAction = new MoveSouth();

        System.out.println("Action Name: " + MoveSouthAction.getName());
        System.out.println("Hotkey: " + MoveSouthAction.getHotkey());
        System.out.println("Keyword Arguments: " + MoveSouthAction.getkwargs());

        //MoveWest
        MoveWest MoveWestAction = new MoveWest();

        System.out.println("Action Name: " + MoveWestAction.getName());
        System.out.println("Hotkey: " + MoveWestAction.getHotkey());
        System.out.println("Keyword Arguments: " + MoveWestAction.getkwargs());

        //swift
        Swift swift = new Swift();
        System.out.println("Action Name: " + swift.getName());
        System.out.println("Hotkey: " + swift.getHotkey());
        System.out.println("Keyword Arguments: " + swift.getkwargs());

    }
}





