/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author student
 */
public class BoxTest1 {

    public static void main(String[] args) {
        // create to instances of Person
        Box boxObj1 = new Box();
        Box boxObj2 = new Box(5, 8, 12);
        System.out.println("The Box (boxObj1) is: " + boxObj1);
        System.out.println("The Box area is: " + boxObj2.area());
        System.out.println("The Box perimeter is: " + boxObj2.perimeter());
        
        // set the name to Ali Torabi
        boxObj1.setDimension(3, 7, 14);
        System.out.println("The new Rectangle area is: " + boxObj1.area());
        System.out.println("The new perimeter area is: " + boxObj1.volume());
    }
}
