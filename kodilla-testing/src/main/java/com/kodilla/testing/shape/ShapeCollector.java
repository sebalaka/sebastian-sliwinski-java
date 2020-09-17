package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> shapeCollection = new ArrayList<>();

    public List<Shape> getShapeCollection() {
        return shapeCollection;
    }

    public void addFigure(Shape shape){

    }

    public boolean removeFigure(Shape shape){
        return false;
    }

    public Shape getFigure(int n){
        return null;
    }

//    public String showFigures(){
//        System.out.println("get name");
//    }
}
