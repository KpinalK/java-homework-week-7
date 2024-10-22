package javaprograms;
/**
 * Write a class with the name Wall. The class needs two fields (instance variables) with name width
 * and height of type double.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg
 * constructor). The second constructor has parameters width and height of type double and it needs to
 * initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the
 * height parameter is less than 0 it needs to set the height field value to 0.
 * Write the following methods (instance methods):
 * Method named getWidth without any parameters, it needs to return the value of width field.
 * Method named getHeight without any parameters, it needs to return the value of height field.
 * Method named setWidth with one parameter of type double, it needs to set the value of the width
 * field. If the parameter is less than 0 it needs to set the width field value to 0.
 * Method named setHeight with one parameter of type double, it needs to set the value of the
 * height field. If the parameter is less than 0 it needs to set the height field value to 0.
 * Method named getArea without any parameters, it needs to return the area of the wall.
 */

public class Wall_15 {
    // instance variable
    double width;
    double height;

    // no-arg constructor
    public Wall_15(){
        this.width = 0;
        this.height = 0;
    }

    //constructor with parameter
    public Wall_15(double width, double height){
        setWidth(width);
        setHeight(height);
    }

    public static void main(String[] args) {
        Wall_15 wall = new Wall_15(5,4);
        System.out.println("area=" + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width=" + wall.getWidth());
        System.out.println("height=" + wall.getHeight());
        System.out.println("area=" + wall.getArea());

    }

    //method to get the width
    public double getWidth(){
        return width;
    }

    //method to get the height
    public double getHeight(){
        return height;
    }

    // method to set width
    public double setWidth(double width) {
        if (width < 0) {
            return this.width = 0;
        } else {
            return this.width = width;
        }
    }

    // method to set width
    public double setHeight(double height) {
        if (height < 0) {
            return this.height = 0;
        } else {
            return this.height = height;
        }
    }

    // method to get area of wall
    public double getArea(){
        return width * height;
    }






}

