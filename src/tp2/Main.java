package tp2;

import java.lang.reflect.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException{

        String name ="java.awt.Point";
        InfoParIntrospection.analyseClasse(name);

    }
}
