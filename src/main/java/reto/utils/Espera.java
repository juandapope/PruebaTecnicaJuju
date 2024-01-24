package reto.utils;

public class Espera {

    public void espera ( int segundos){
        try {
            Thread.sleep(segundos*1000);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
    }

}
