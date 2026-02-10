package TareaHilos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Datos");        
        System.out.println("Ingrese un numero para conteo: ");
        while (!sc.hasNextInt()) {
            System.out.println("Error, el caracter que ingreso no es valido");
            System.out.println("Intenta de nuevo: ");
            sc.next();                      
        }
        int primerNumero = sc.nextInt();

        System.out.println("Ingrese letra para conteo");
        String entrada = sc.next();

        while (!Character.isLetter(entrada.charAt(0))) {
            System.out.println("Error, el caracter que ingreso no es valido");
            System.out.println("Intenta de nuevo: ");
            entrada = sc.next();            
                
     }
     char letraIngresada = entrada.charAt(0);        
     Conteo regresivo = new Conteo(primerNumero); 
     Thread regresivo2 = new Thread(new Abecedario(letraIngresada));

     sc.close();
     
     System.out.println("CONTEO\t\t\tABECEDARIO");
     System.out.println("------------------------------------------");
       
        regresivo.start();
        regresivo2.start();

        
 }
}