import java.util.Random;

public class Hilo extends Thread{

    public final int numero;

    public long tiempoFinalizacion;

    public Hilo(int numero){
        this.numero=numero;
    }

    @Override
    public void run(){
        long comienzo=System.currentTimeMillis();
        Random r = new Random();
        try {
            Thread.sleep(r.nextInt(3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tiempoFinalizacion=System.currentTimeMillis();
        long tiempodormido = tiempoFinalizacion - comienzo;
        System.out.println("Soy el hilo nº"+numero+" y he dormido "+tiempodormido);
    }
}
