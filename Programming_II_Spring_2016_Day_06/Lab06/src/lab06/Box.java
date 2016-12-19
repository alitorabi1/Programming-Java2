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
public class Box extends Rectangle {

    private double height;
    public Box() {
        super();
        this.height = 0;
    }

    public Box(double w, double l, double h) {
        super(w, l);
        this.height = h;
    }

    public void setDimension(double w, double l, double h){
        super.setWidth(w);
        super.setLength(l);
        this.height = h;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area() {
        return super.getLength() * super.getWidth() * this.height;
    }

    public double volume() {
        return 2 * ((super.getLength() * super.getWidth()) + (super.getLength() * this.height) + (super.getWidth()* this.height));
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + super.getWidth() + ", length=" + super.getLength() + "Box{" + "height=" + height + '}'; 
    }
}
