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
public class Rectangle {
    private double width;
    private double length;
    
    public Rectangle(){
        this.width = 0;
        this.length = 0;
    }
    public Rectangle(double w, double l){
        setDimension(w, l);
    }
    
    public void setDimension(double w, double l){
        this.width = w;
        this.length = l;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double w) {
        this.width = w;
    }

    public void setLength(double l) {
        this.length = l;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }

    public double area() {
        return this.length * this.width;
    }
    public double perimeter() {
        return 2 * (this.length + this.width);
    }
}
