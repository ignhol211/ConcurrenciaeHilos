import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class EjercicioHilos1 {
    public static void main(String [] args){

        for (int i=0;i<100;i++){
            Hilo h = new Hilo("");
            Random r= new Random();
            long tiempoDormido=(long)r.nextInt(3000);

            Hilo.hiloADormir(h,tiempoDormido);

            //Hilo.hilosOrdenados(tiempoDormido);

            }
        }
}