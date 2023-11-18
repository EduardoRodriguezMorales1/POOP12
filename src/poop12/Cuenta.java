/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author eduar
 */
public class Cuenta extends Thread{
    
    private static long saldo = 0;
    
    public Cuenta( String nombre){
        super(nombre);
    }
    
    @Override
    public void run(){
        if(getName().equals("Deposito 1") || getName().equals("Deposito 2")){
            this.depositarDinero(100);
        } else{
            this.extraerDinero(50);
        }
    }
    
    public synchronized void depositarDinero(int cantidad){
        System.out.println("Antes de depositar el saldo actual es"+saldo);
        saldo += cantidad;
        System.out.println("Se depositaron "+cantidad+" pesos");
                notifyAll();
    }
    public synchronized void extraerDinero(int cantidad){
        try{
            if(saldo<=0){
                System.out.println(getName()+" Espera depOsito"+"\nSaldo restante"+saldo);
                sleep(5000);
            }
        } catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Antes de retirar el saldo actual es"+saldo);
        saldo -= cantidad;
        System.out.println(getName()+" Extrajo "+cantidad+" Pesos. \nSaldo restante"+saldo);
        notifyAll();
    }
    
    
    
    
}
