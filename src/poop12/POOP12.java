/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop12;

/**
 *
 * @author Eduardo Mariana Adolfo
 */
public class POOP12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        HiloT hilo1 = new HiloT("Primer hilo");
        hilo1.start();
        new HiloT("Segundo Hilo").start();
        new Thread(new HiloR(), "Tercer hilo").start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion "+i+" del main");           
        }       
        System.out.println("Termina el Main");
        */
        /*
        new Thread(new HiloCeros(),"Hilos de ceros").start();
        new Thread(new HiloUnos(),"Hilos de unos").start();
        new Thread(new HiloSaltoDeLinea(), "Hilo Salto De Linea").start();
        */
        /*
        new Cuenta("Acceso 1").start();
        new Cuenta("Acceso 2").start();
        new Cuenta("Deposito 1").start();
        new Cuenta("Deposito 2").start();
        System.out.println("Termina el hilo principal ");
        */
        /*
        Hilo que imprima los pares y otro hilo los impares del 0 al 500
        */
        new Thread(new HiloImpar(),"Hilo de impares").start();
        new Thread(new HiloPar(),"Hilo de Pares").start();
        
    }
    
}
