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
public class HiloCaja extends Thread{
String clientes;
int productos;
int caja;
String mensaje="";
    public HiloCaja(int caja,String clientes,int prodcutos) {
    this.clientes=clientes;
    this.productos=prodcutos;
        this.caja=caja;
    }
    
    
    public void run(){
        int i;
            
            for(i=0;i<productos;i++){
                
                  mensaje="La caja "+caja+" esta atendiendo al cliente "+clientes+" con el producto "+(i+1);
                  System.out.println(mensaje);
                
                try {
                    sleep(3000);
                    
                } catch (InterruptedException ex) {

                }
            }
    }
}
