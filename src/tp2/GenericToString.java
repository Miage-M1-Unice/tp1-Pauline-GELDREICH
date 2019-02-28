package tp2;

import java.awt.*;
import java.lang.reflect.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;


public class GenericToString {



    public String toString(Object object,int profondeur) throws IllegalAccessException {
       Class cl = object.getClass();
        String nomClasse = cl.getName();
        String res = "";

        ArrayList<Field> fields = fieldsEnProfondeur(cl);

        for (int i = 0; i < fields.size(); i++) {

            if (profondeur <= 0 ) return "" ;

            fields.get(i).setAccessible(true);


            if(fields.get(i).getType().isPrimitive()){

                res += fields.get(i).getName();
                res += "= " + fields.get(i).get(object) ;

            }else if(fields.get(i).getType().isArray()){

                res += fields.get(i).getName();
                res += "={";

                for (int j = 0; j < Array.getLength(fields.get(i).get(object)); j++) {
                    res += Array.get(fields.get(i).get(object), j);

                    if(j != Array.getLength(fields.get(i).get(object))-1)
                        res += ",";
                }
                res += "} ";
            }else{
                res += toString(fields.get(i).get(object), profondeur - 1)+"\n";
            }
            if (i < fields.size() - 1) {
                res += "; ";
            }
        }
        return nomClasse +"[" + res + "]";
    }

    public ArrayList<Field> fieldsEnProfondeur(Class cl) {
        ArrayList<Field> fields = new ArrayList<>(Arrays.asList(cl.getFields()));
        for (Field field : cl.getDeclaredFields()) {
            if(!fields.contains(field))
                fields.add(field);
        }
        return fields;
    }

}





