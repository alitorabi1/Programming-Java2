/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ali Torabi
 */
public class SquareApp {
    // main method
    public static void main(String[] args){
        System.out.printf("Square of integer number 7 is: %d%n", square(7));
        System.out.printf("Square of double number 7.5235 is: %f%n", square(7.5));
        System.out.printf("Square of float number 7.5235f is: %f%n", square(7.5f));
    }// end main method

    public static int square(int intValue) { // square method with integer parameter
        System.out.printf("%nCalled square with integer argument, %d%n", intValue);
        return intValue * intValue;
    }
    public static double square(double doubleValue) { // square method with double parameter
        System.out.printf("%nCalled square with double argument, %f%n", doubleValue);
        return doubleValue * doubleValue;
    }
    public static float square(float floatValue) { // square method with double parameter
        System.out.printf("%nCalled square with float argument, %f%n", floatValue);
        return floatValue * floatValue;
    }
}// end class SquareApp
