/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw_7;

/**
 *
 * @author AboodHassKov
 */
public class HW_7 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
         
        MyThread t1 = new MyThread(1);
        t1.setPriority(Thread.MAX_PRIORITY);

        Thread t2 = new Thread(new MyRunnable(1));
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();

	}
    
}
