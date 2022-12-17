package org.example.data;

public class Circle extends Figure implements Lengthable{
    private Double radius;

    public Circle(Double radius){
        this.radius = radius;
    }
    @Override
    public Double countArea() {
        return Math.PI * this.radius*this.radius;
    }

    @Override
    public Double length() {
        return 2*Math.PI * this.radius;
    }

    public Double getRadius() {
        return radius;
    }
}
