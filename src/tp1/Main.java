package tp1;
import java.io.File;


public class Main {

    public static void main(String[] args) {

        File f = new File(".");
        Exercice1 exo1 = new Exercice1(f);
        exo1.listeRepertoire();
        exo1.parcoursProfondeur(".");

    }
}
