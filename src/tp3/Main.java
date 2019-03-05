package tp3;

import java.lang.reflect.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;


public class Main  {
    public static void main(String[] args) throws ClassNotFoundException, MalformedURLException {
        URL classUrl = new URL("file:///Users/pauline/Desktop/programmation_avancée/projet_test/out/production/projet_test/");
        URL[] classUrls = {classUrl};
        URLClassLoader urlCL = new URLClassLoader(classUrls);
        Class cl = urlCL.loadClass("tp.Test");

    }
}
