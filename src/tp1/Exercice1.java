package tp1;
import java.io.File;


public class Exercice1 {

    private File f;

    public Exercice1(File f) {
        this.f = f;
    }

    //Pour la 1a) 1. :

    public void listeRepertoire(){

        String[] liste = f.list();

        System.out.println("Methode listeRepertoire : \n");
        for(String path:liste) {
            System.out.println(path);
        }
    }

    //Pour la 1a) 2. :

    public void parcoursProfondeur(String str){

        File f = new File(str);
        File[] liste = f.listFiles();

        System.out.println("Voici le parcours en profondeur : \n");

        for(File path:liste) {
            if (path.isFile()){
                System.out.println(path);
            }
            else {
                parcoursProfondeur(path.toString());
            }
        }
    }
}
