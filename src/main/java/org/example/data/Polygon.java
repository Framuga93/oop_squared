package org.example.data;

public abstract class Polygon extends Figure implements Perimeterble {
    protected Double[] sides;

    protected Polygon(Double[] sides) {
        this.sides = sides;
    }

    @Override
    public Double perimeter() {
        Double perimeter = 0.0;
        for (Double side : this.sides) {
            perimeter += side;
        }
        return perimeter;
    }
}
