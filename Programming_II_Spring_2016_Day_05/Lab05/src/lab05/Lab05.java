/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

import java.util.Scanner;
/**
 *
 * @author student
 */
public class Lab05 {

    final static int RIGHT_NUMBER = (int) (Math.random() * 100); //the right number

    public static boolean compareNumbers(int num) {
        // TODO code application logic here
        boolean result = false;
//        int inputNum; //entered number by user
//        int counter = 1; //save the number of tries
//        for(int i = 1; i <6; i++) {
            if(num == RIGHT_NUMBER){
                result = true;
                System.out.print("Congratulation, you entered the right number");
            } else if(num > RIGHT_NUMBER){
                result = false;
                System.out.print("Enter a number less than " + num + ":");
            } else if(num < RIGHT_NUMBER){
                result = false;
                System.out.print("Enter a number greater than " + num + ":");
            }
//            counter++;
//        }
        return result;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Guess a number between 1 and 20 and type it. you can try five times:");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        while (!compareNumbers(inputNumber)) {
            inputNumber = scanner.nextInt();
        }
    }
    
}
