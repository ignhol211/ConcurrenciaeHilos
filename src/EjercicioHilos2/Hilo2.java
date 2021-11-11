package EjercicioHilos2;

import java.util.Random;

public class Hilo2 extends Thread {

    public int num;
    public int vecesQueDuerme=0;

    public Hilo2(int n){
        this.num=n;
    }

    @Override
    public void run(){
        Random r = new Random();
        try {
            Thread.sleep(1000);
            vecesQueDuerme++;
            byte aleatorio=(byte)r.nextInt(2);
            while(aleatorio!=0){
                Thread.sleep(aleatorio);
                vecesQueDuerme++;
                aleatorio=(byte)r.nextInt(2);}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Soy el hilo "+num+" y he dormido "+vecesQueDuerme+" veces");
    }
}