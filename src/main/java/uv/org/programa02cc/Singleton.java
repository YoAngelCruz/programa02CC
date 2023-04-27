package uv.org.programa02cc;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angel
 */
public class Singleton {

    private static Singleton singleton = null;

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    private Singleton() {
    }
    
    public  void imprimir(){
        Logger.getLogger(Singleton.class.getName()).log(Level.INFO, "hola mundo" );
    }

}
