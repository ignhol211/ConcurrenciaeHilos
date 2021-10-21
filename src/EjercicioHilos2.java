import java.util.ArrayList;

public class EjercicioHilos2 {

    static ArrayList<Hilo2> listaDeHilos = new ArrayList();

    public static void main(String [] args){

        for (int i=0;i<100;i++){
            Hilo2 h = new Hilo2 (i);
            h.start();
        }

        System.out.println(escribirFinalistas());
        //System.out.println(escribirSubCampeones());

    }

    public static String escribirFinalistas(){
        int MaxVecesDormido=0;
        String result="Hilos campeones\n";

        for( Hilo2 hilo : listaDeHilos){
            if(hilo.num>MaxVecesDormido)
                MaxVecesDormido=hilo.num;
        }

        for( Hilo2 hilo : listaDeHilos){
            if(hilo.num==MaxVecesDormido)
                result+="El hilo "+hilo.num+" se ha ejecutado "+hilo.vecesQueDuerme;
        }

        return result;
    }

    public static String escribirSubCampeones(){
        String result="Hilos subcampeones\n";
        return result;
    }
}
