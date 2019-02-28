package tp2;

import java.lang.reflect.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException{

        String name ="java.awt.Point";
        //InfoParIntrospection.analyseClasse(name);

        System.out.println(new GenericToString().toString(new Point(12,24)));

        Polygon pol = new Polygon(new int[]{10, 20, 30}, new int[]{20,30, 40}, 3);
        pol.getBounds();

        System.out.println(new GenericToString().toString(pol));
    }
}
