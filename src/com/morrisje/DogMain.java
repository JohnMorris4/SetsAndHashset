package com.morrisje;

/**
 * Created by jmorris on 1/26/18
 */
public class DogMain {
    public static void main(String[] args) {
        Labradore rover = new Labradore("Rover");
        Dog rover2 = new Dog("Rover");

        System.out.println(rover2.equals(rover));
        System.out.println(rover.equals(rover2));
    }
}
