package org.example.data;

public class Triangle extends Polygon{

    public Triangle(Double side1,Double side2,Double side3) {
        super(new Double[]{side1,side2,side3});
    }

    @Override
    public Double countArea() {
        return Math.sqrt(super.perimeter()*(super.perimeter()-super.sides[0])*
                (super.perimeter()-super.sides[1])*(super.perimeter()-super.sides[2]));
    }

    public Double getSide1(){
        return super.sides[0];
    }
    public Double getSide2(){
         return super.sides[1];
    }
    public Double getSide3(){
        return super.sides[2];
    }
}
