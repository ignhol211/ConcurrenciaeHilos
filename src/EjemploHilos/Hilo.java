package EjemploHilos;

import java.util.Random;

public class Hilo extends Thread{

    public String nombre;

    public Hilo(String nombre){
        this.nombre=nombre;
    }

    @Override
    public void run(){
        Random r= new Random();
        long tiempoDormido;
        tiempoDormido=r.nextInt(3)*1000;
        try{
            Thread.sleep(tiempoDormido);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

