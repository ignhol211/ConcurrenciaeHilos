package EjemploHilos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class EjercicioHilos1 {
    public static void main(String [] args){

        for(int i=0;i<100;i++){
            Hilo h = new Hilo ("Hilo"+i);
            long tiempo=System.currentTimeMillis();
            h.start();
            try {
                h.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Soy el " + h.getName() + " y he dormido "+(System.currentTimeMillis()-tiempo)+" milisegundos");
        }
    }
}
