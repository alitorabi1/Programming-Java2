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
public class RectangleTest {

    public static void main(String[] args) {
        // create to instances of Person
        Rectangle rectObj1 = new Rectangle();
        Rectangle rectObj2 = new Rectangle(5, 8);
        System.out.println("The Rectangle (rectObj1) is: " + rectObj1);
        System.out.println("The Rectangle area is: " + rectObj2.area());
        System.out.println("The Rectangle perimeter is: " + rectObj2.perimeter());
        
        // set the name to Ali Torabi
        rectObj1.setDimension(3, 7);
        System.out.println("The new Rectangle area is: " + rectObj1.area());
        System.out.println("The new perimeter area is: " + rectObj1.perimeter());
    }
    
}
