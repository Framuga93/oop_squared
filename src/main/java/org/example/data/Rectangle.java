package org.example.data;

public class Rectangle extends Polygon{
    public Rectangle(Double side1,Double side2) {
        super(new Double[]{side1,side2});
    }

    @Override
    public Double perimeter() {
        return super.perimeter() * 2;
    }

    @Override
    public Double countArea() {
        return super.sides[0]* super.sides[1];
    }

    public Double getFirstSide() {
        return super.sides[0];
    }


    public Double getSecondSide() {
        return super.sides[1];
    }


}
