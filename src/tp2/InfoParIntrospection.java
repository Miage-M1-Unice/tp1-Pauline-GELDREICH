package tp2;

import java.lang.reflect.*;
import java.io.*;
import java.security.cert.Extension;

public class InfoParIntrospection {

    public static void analyseClasse(String nomClasse) throws ClassNotFoundException {
        // Récupération d'un objet de type Class correspondant au nom passé en paramètres
        Class cl = getClasse(nomClasse);


        afficheEnTeteClasse(cl);

        System.out.println();
        afficheAttributs(cl);
        afficheConstructeurs(cl);



    }

    /** Retourne la classe dont le nom est passé en paramètre */
    public static Class getClasse(String nomClasse) throws ClassNotFoundException {

        return Class.forName(nomClasse);
    }

    /** Cette méthode affiche par ex "public class Toto extends Tata implements Titi, Tutu {" */
    public static void afficheEnTeteClasse(Class cl) {
        //  Affichage du modifier et du nom de la classe
        int i = cl.getModifiers();
        String mod = Modifier.toString(i);
        System.out.print(mod + " " +cl + " ");

        // Récupération de la superclasse si elle existe (null si cl est le type Object)

        Class supercl = cl.getSuperclass();

        // On ecrit le "extends " que si la superclasse est non nulle et
        // différente de Object

        if (supercl != null && supercl != Object.class) {
            System.out.print("extends " + supercl.getName() + " ");
        }

        // Affichage des interfaces que la classe implemente

        Class[] interfa = cl.getInterfaces();
        System.out.print("implements ");
        for (Class inter : interfa) {
            Class interf = inter ;
            String s = interf.toString() ;
            String[] parts = s.split(" ");
            System.out.print(parts[1]);

        }
        System.out.println(" {");
    }

        public static void afficheAttributs(Class cl) {
            Field[] fields = cl.getFields();
            System.out.println("// Champs");
            for(Field f :fields){
                int i = f.getModifiers();
                String mod = Modifier.toString(i);
                Class type = f.getType();
                String name = f.getName();

                System.out.println(mod + " " + type + " " +  name + ";");

            }
        }

    public static void afficheConstructeurs(Class cl) {
        Constructor[] constructors = cl.getConstructors();
        System.out.println(" ");
        System.out.println("//Constructeurs");
        for (Constructor c: constructors){
            String n = c.getName() ;
            String m = Modifier.toString(c.getModifiers());
            System.out.print(m + " " + n );

            Class[] p = c.getParameterTypes();
            System.out.print("(");
            for (int i = 0 ; i < p.length; i++) {

                System.out.print(p[i] );
                if (i < p.length -1 ) {
                    System.out.print(", ");
                }
            }
            System.out.println(");");
        }

    }



}



