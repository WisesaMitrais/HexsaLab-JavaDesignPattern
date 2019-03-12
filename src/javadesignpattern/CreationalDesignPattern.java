package javadesignpattern.creational;

public class CreationalDesignPattern {
    
    // Singleton Design Pattern.
    public int getNumberFromSingletonClass(){
        Singleton singleton = Singleton.getInstance();
        return singleton.getRandomNumber();
    }
    
}
