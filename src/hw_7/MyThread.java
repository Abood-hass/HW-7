/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AboodHassKov
 */
public class MyThread extends Thread {
   private int sleep;
   @Override
   public void run() {
	       
		try {
                File f2 = new File("C:\\Users\\AboodHassKov\\Documents\\NetBeansProjects\\HW_7\\file-2.txt");
    
                    Scanner sc = new Scanner(f2);
                    while (sc.hasNextLine()){
                    	    System.out.println(sc.nextLine());
                            Thread.sleep(sleep);   
                    }
                    } catch (FileNotFoundException e) {
                            e.printStackTrace();
                } catch (InterruptedException ex) {
           Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
       }
   }	
	public MyThread(int sleep) {
		super();
		this.sleep = sleep;
   }
}

