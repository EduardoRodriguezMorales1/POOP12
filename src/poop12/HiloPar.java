/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author eduar
 */
public class HiloPar implements Runnable{

    @Override
    public synchronized void run() {
        for (int i = 0; i < 500; i++) {
            if(i%2==0){
                System.out.println(i);
                notifyAll();
            }
        }
    }
    
}
