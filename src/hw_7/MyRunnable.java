/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw_7;
//
//import javafx.application.Application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.StackPane;
//import javafx.stage.Stage;

/**
 *
 * @author AboodHassKov
 */
public class MyRunnable implements Runnable {
    

    File f1 = new File("C:\\Users\\AboodHassKov\\Documents\\NetBeansProjects\\HW_7\\file-1.txt");
    private int sleep;
    @Override
    public void run() {
	       
		try {
                    
                    Scanner sc = new Scanner(f1);
                    while (sc.hasNextLine()){
                    	    System.out.println(sc.nextLine());
                            Thread.sleep(sleep);   
                    }
                    
                    } catch (FileNotFoundException e) {
                            e.printStackTrace();
                    } catch (InterruptedException ex) {
              Logger.getLogger(MyRunnable.class.getName()).log(Level.SEVERE, null, ex);
          }
                }
    public  MyRunnable(int sleep) {
		super();
		this.sleep = sleep;
	}
    

}

