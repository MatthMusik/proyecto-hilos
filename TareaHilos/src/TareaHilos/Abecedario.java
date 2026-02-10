package TareaHilos;

public class Abecedario implements Runnable {

    public char letraIngresada;

    public Abecedario (char letra){
        this.letraIngresada = Character.toUpperCase(letra);        
    }

    @Override
    public void run(){

        for (char c = 'A'; c <= letraIngresada; c++){
            System.out.println("\t\t\tLetras anteriores: " + c);

            try {
                Thread.sleep(600);                
            } catch (InterruptedException e) {
                System.out.println("Secuencia interrumpida");
            }
        } 
        System.out.println("\t\t\tTrabajo del hilo (Abecedario) terminado");               
    }   
    

}
