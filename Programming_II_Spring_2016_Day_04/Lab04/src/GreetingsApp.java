/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Calendar;

/**
 *
 * @author Ali Torabi
 */
public class GreetingsApp {
    // main method
    public static void main(String[] args){
        // declaration
        String name;    //String entered by user
        // declare instance on scanner and calendar
        Scanner input = new Scanner(System.in);
        // 
        Calendar cal = Calendar.getInstance();
        /* from the calendar instance you can extract 
            year, month, day, hour, ...
        */
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        // Initialization phase
        // read the name from console
        System.out.println("Please enter your name: ");
        name = input.nextLine();
        
        //processing phase
        // determine whether it is morning
        if(hour < 12) {
            System.out.print("Good Morning ");
        }
        if(hour >= 12){
            hour = hour - 12;
            if(hour < 6)
                System.out.print("Good afternoon ");
            if(hour >= 6)
                System.out.print("Good evening ");
        }
        // Termination phase
        System.out.println(name + ", welcome back");
            
        
    }
    
} //end class GreetingsApp
