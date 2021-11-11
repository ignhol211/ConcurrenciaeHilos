package EjemploLock;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    static ReentrantLock lock = new ReentrantLock();
    public static void main (String [] args){

        for (int i = 0; i < 15; i++){
            Hilo h = new Hilo ();
            h.start();
        }

    }

    public static void atenderAlHilo(Hilo hilo){
        System.out.println("Ha llegado el "+hilo.id);

        lock.lock();

        lock.unlock();

    }

}
