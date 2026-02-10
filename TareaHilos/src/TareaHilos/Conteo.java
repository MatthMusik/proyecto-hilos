package TareaHilos;

public class Conteo extends Thread{

    public int primerNumero;

    public Conteo(int numero){
        this.primerNumero = numero;
    }
    
    @Override
    public void run () {

        for (int i = primerNumero; i >=0;i--){
            System.out.println("Conteo regresivo:  " + i);            

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("El conteo fue interrumpido");
            }
        }  
        
        System.out.println("Trabajo del hilo (Conteo) terminado");
    }
}
