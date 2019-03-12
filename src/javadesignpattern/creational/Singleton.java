package javadesignpattern.creational;

import java.util.Random;

/*
Singleton is neccesary when we want to make the instance of the class 
exaclty one. So the instance class will have same data for all objects.
    
Implementation Level: Easy.
*/
public class Singleton {
    
    // Experiment data.
    private final int number;
    
    // Set private and static instance.
    private static Singleton singleton = null;
    
    // Set private constructor.
    private Singleton(int N){
        this.number = randomNumber(N);
    }
    
    // Get private instance.
    public static Singleton getInstance(){
        if(singleton ==  null) singleton = new Singleton(50);
        return singleton;
    }
    
    // Experiment method for get random number result;
    public int getRandomNumber(){
        return this.number;
    }
    
    // Experiment method for generate random number.
    private int randomNumber(int N){
        Random random = new Random();
        int n = random.nextInt(N);
        n += 1;
        return n;
    }
    
}
