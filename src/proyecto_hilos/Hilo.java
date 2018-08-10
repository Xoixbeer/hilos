/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_hilos;

import java.util.ArrayList;

/**
 *
 * @author Taty
 */
public class Hilo extends Thread{
    ArrayList clientes = new ArrayList();
    ArrayList productos= new ArrayList();
    
    String mensaje="";

    public Hilo() {
    
    clientes.add("Cristhian");
    clientes.add("Gabriela");
    clientes.add("Lizeth");
    clientes.add("Maria");
    clientes.add("Juana");
    productos.add(1);
    productos.add(2);
    productos.add(4);
    productos.add(3);
    productos.add(2);
    }
    
    
    public void run(){
        HiloCaja hilo1,hilo2,hilo3;
     hilo1= new HiloCaja(1, clientes.get(0).toString(), Integer.parseInt(productos.get(0).toString()));
     hilo2= new HiloCaja(2, clientes.get(1).toString(), Integer.parseInt(productos.get(1).toString()));
     hilo3= new HiloCaja(3, clientes.get(2).toString(), Integer.parseInt(productos.get(2).toString()));


        int i=3;
        while(i<clientes.size()){
            
            if(!hilo1.isAlive() && !hilo2.isAlive() && !hilo3.isAlive()){
                hilo1.start();
                hilo2.start();
                hilo3.start();
                
            }else{
                if(!hilo1.isAlive()){
                    hilo1 = new HiloCaja(1,clientes.get(i).toString() , Integer.parseInt(productos.get(i).toString()));
                    hilo1.start();
                    i++;
                }else{
                  if(!hilo2.isAlive()){
                    hilo2 = new HiloCaja(2,clientes.get(i).toString() , Integer.parseInt(productos.get(i).toString()));
                    hilo2.start();
                    i++;
                  }else{
                      if(!hilo3.isAlive()){
                    hilo3 = new HiloCaja(3,clientes.get(i).toString() , Integer.parseInt(productos.get(i).toString()));
                    hilo3.start();
                    i++;
                      }
                  }  
                }
            }
        }
        
    }
}
