package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Bed bed = new Bed("Classic",4,100,1,2);
        Lamp lamp = new Lamp(true,5, LampType.LAVA);
        Wardrobe wardrobe = new Wardrobe(200,180,150);
        Carpet carpet = new Carpet(PaintColor.WHITE,300,200);
        Ceiling ceiling = new Ceiling(300,PaintColor.GREEN);

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Bedroom bedroom = new Bedroom("Selenge's Bedroom :)",wall1,wall2,wall3,wall4,ceiling,bed,lamp,wardrobe,carpet);



    }
}