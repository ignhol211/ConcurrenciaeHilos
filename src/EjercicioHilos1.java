import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class EjercicioHilos1 {

    static ArrayList<Hilo> listaHilos = new ArrayList();

    public static void main(String [] args){

        for (int i=0;i<100;i++){
            Hilo h = new Hilo(i);
            h.start();
            listaHilos.add(h);
            }

        mostrarListado(listaHilos);

        }

    private static void mostrarListado(ArrayList<Hilo> listaHilos){
        for(Hilo hilo : listaHilos)
            System.out.println("El nombre "+hilo.numero+" ha finalizado en el milisegundo "+hilo.tiempoFinalizacion);}
}