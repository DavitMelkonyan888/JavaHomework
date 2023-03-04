package enums;

import enums.playing_cards.Card;
import enums.shapes.ShapeType;

public class Main {
    
    public static void main (String[] args) {
//        for (Planets i: Planets.values()){
//            System.out.println(i.getName() + " " + i.getYearLength() + " " + i.getDistanceFromSun());
//        }
//        for (Week i: Week.values()){
//            System.out.println(i + " " + i.getNumber());
//        }
//        Shape my = Shape.TRIANGLE;
//        my.setA(3);
//        my.setB(4);
//        my.setC(5);
//        System.out.println(my.getArea());
//        Shape myy = Shape.TRIANGLE;
//        System.out.println(myy.getArea());
//        System.out.println(Unit.NEWTON.getName() + " = " + Unit.NEWTON.getBaseUnit());
//        System.out.println(Unit.JOULE.getName() + " = " + Unit.JOULE.getBaseUnit());
//        System.out.println(Unit.WATT.getName() + " = " + Unit.WATT.getBaseUnit());
//        for(ShapeType i : ShapeType.values()){
//            System.out.println(i + " " + i.getArea() + " " + i.getPerimeter());
//        }
        Card my = Card.H7;
        System.out.println(my);
        System.out.println(my.getSuit() + "  " + my.getRank());
    }
    
}
