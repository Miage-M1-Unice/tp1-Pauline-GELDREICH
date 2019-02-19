package tp1;
import java.io.File;


public class Main {

    public static void main(String[] args) {
        File f = new File(".");
        Exercice1a exo1 = new Exercice1a(f);
        System.out.println("-------------------------------------------------");
        exo1.listeRepertoire();
        System.out.println("\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Voici le parcours en profondeur : \n");
        exo1.parcoursProfondeur(".");
        System.out.println("-------------------------------------------------");
    }
}
