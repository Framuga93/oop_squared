package org.example.controller;


import org.example.data.*;
import org.example.service.FigureRepository;

import java.util.List;

public class UserController {

    private final FigureRepository repository = new FigureRepository();

    public List<Figure> getAllFigure(){
        return repository.getFigureList();
    }

    public void createCircle(Double radius){
        if (radius <= 0)
            throw new IllegalStateException("Incorrect data");
        this.repository.add(new Circle(radius));
    }

    public void createTriangle(Double side1, Double side2, Double side3){
        if (side1 <= 0 || side2 <= 0 || side3 <= 0)
            throw new IllegalStateException("All sides must be > 0");
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1)
            throw new IllegalStateException("Lengths sum of two sides must be bigger than third side ");
        this.repository.add(new Triangle(side1, side2, side3));
    }

    public void createRectangle(Double side1, Double side2){
        if (side1 <= 0 || side2 <= 0)
            throw new IllegalArgumentException("All sides must be > 0");
        this.repository.add(new Rectangle(side1, side2));
    }

    public void createSquare(Double side){
        if (side <= 0)
            throw new IllegalArgumentException("Side must be > 0");
        this.repository.add(new Squared(side));
    }

    public Double getAllPerimeters(){
        return this.repository.getAllPerimetrs();
    }

    public Double getAllLength(){
        return this.repository.getAllLength();
    }

    public Double getAllArea(){
        return this.repository.getAllAreas();
    }
}
