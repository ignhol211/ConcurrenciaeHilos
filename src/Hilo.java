import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Hilo extends Thread{

    public String nombre;

    public Hilo(String nombre){
        this.nombre=nombre;
    }

    public static void hiloADormir(Hilo h,Long tiempoDormido) {
        try {
            h.start();
            //h.run();
            h.join();
            //System.out.println("Soy el hilo "+h.getName()+" y me he dormido por milisegundos");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static HashMap hilosOrdenados(Hilo h,Long tiempoDormido){
        HashMap<Hilo,Long> HM = new HashMap<Hilo,Long>();
        HM.put(h,tiempoDormido);
        return HM;
    }

    public void run() {
        long tiempo=System.currentTimeMillis();
        System.out.println(tiempo);
    }
}

