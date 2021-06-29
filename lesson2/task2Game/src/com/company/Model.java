package com.company;
import java.util.Random;


public class Model {
    public int randNumber;

    public int generateRandom(){
        Random rand = new Random();
        randNumber = rand.nextInt(100);
        return randNumber;
    }
}
