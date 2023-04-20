package uv.org.programa02cc;

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
        System.out.println("holamundo");
    }

}
