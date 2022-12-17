package org.example.service;

import org.example.data.Figure;
import org.example.data.Lengthable;
import org.example.data.Perimeterble;

import java.util.ArrayList;
import java.util.List;

public class FigureRepository implements Repository{
    private List<Figure> figureList;

    public FigureRepository() {
        this.figureList = new ArrayList<>();
    }

    @Override
    public void add(Figure figure) {
        this.figureList.add(figure);
    }

    public Double getAllPerimetrs(){
        Double perimeter = 0.0;
        for (Figure figure : this.figureList){
            if(figure instanceof Perimeterble) {
                perimeter += ((Perimeterble) figure).perimeter();
            }
        }
        return perimeter;
    }

    public Double getAllLength(){
        Double length = 0.0;
        for (Figure figure:this.figureList){
            if(figure instanceof Lengthable){
                length +=((Lengthable) figure).length();
            }
        }
        return length;
    }

    public Double getAllAreas(){
        Double area = 0.0;
        for (Figure figure: this.figureList){
            area += figure.countArea();
        }
        return area;
    }

    public List<Figure> getFigureList(){
        return figureList;
    }
}
