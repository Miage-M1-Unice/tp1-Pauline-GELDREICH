package tp2;

import java.awt.*;
import java.lang.reflect.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;


public class GenericToString {

    public String toString(Object object) {
       Class cl = object.getClass();
        String nomClasse = cl.getName();
        String res = "";

        Field[] fields = cl.getFields();
        for (int i = 0; i < fields.length; i++) {
            res += fields[i].getName() ;
            if (i < fields.length - 1) {
                res += "; ";
            }
        }
        return nomClasse +"[" + res + "]";
    }

}




