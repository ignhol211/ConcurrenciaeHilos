import java.util.ArrayList;

public class EjercicioHilos2 {

    static ArrayList<Hilo2> listaDeHilos = new ArrayList <>();

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            Hilo2 h = new Hilo2(i);
            h.start();
            listaDeHilos.add(h);
        }

        System.out.println(escribirFinalistas());
        System.out.println(escribirSubCampeones());

    }

    public static String escribirFinalistas() {
        return imprimir("Hilos finalistas:\n",buscarMasEjecutado());
    }

    public static String escribirSubCampeones() {
        int masEjecutado=buscarMasEjecutado();
        int segundoMasEjectuado=0;

        byte cont=0;
        boolean encontrado=false;
        do{
            cont++;
            for (Hilo2 hilo: listaDeHilos) {
                if(hilo.vecesQueDuerme==masEjecutado-cont) {
                    segundoMasEjectuado = hilo.vecesQueDuerme;
                    encontrado=true;
                }
            }
        }while(!encontrado);

        return imprimir("Hilos subcampeones:\n",segundoMasEjectuado);
    }

    public static int buscarMasEjecutado(){
        int masEjecutado=0;

        for (Hilo2 hilo: listaDeHilos) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(hilo.vecesQueDuerme>=masEjecutado)
                masEjecutado = hilo.vecesQueDuerme;
        }

        return masEjecutado;
    }

    public static String imprimir(String cabecera,int limiteImpresion){
        String result=cabecera;

        for (Hilo2 hilo: listaDeHilos) {
            if(hilo.vecesQueDuerme==limiteImpresion)
                result=result.concat("El hilo "+hilo.num+" se ha ejecutado "+hilo.vecesQueDuerme+" veces\n");
        }

        return result;
    }
}
