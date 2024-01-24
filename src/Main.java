package src;

import java.util.Random;


public class Main {

    public static void main(String[] args) {
        System.out.println("hello");
        numratQiftDheTek();
        Numrat();
    }


    public static void numratQiftDheTek() {
        Random random = new Random();
        int x = random.nextInt(100);
        if (x % 2 == 0) {
            System.out.println("Numri eshte qift :" + x);
        } else {
            System.out.println("Numri eshte tek ! ");
        }
    }

    public static void Numrat() {
        Random random = new Random();
        int x = random.nextInt(100);
        if (x % 5 == 0) {
            System.out.println("Numri esht qift");
        } else {
            System.out.println("Numri esht tek");
        }
    }

}
