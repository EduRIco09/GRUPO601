/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.v1trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author usuario1
 */
public class V1TRIFIV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
        // TODO code application logic here
         //EL TRHOWS EXCEPTION se necesita para esto para el casteo
        //Pedimos datos (librerias con Buffer)
        //ojo se puede usar AND , OR
       
       BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
       int numero;
       float mult3;
       float mult5;
   
       
       
       
       System.out.println("Ingresa el número");
       numero = Integer.parseInt(bufEntrada.readLine()); //Esta leyendo una cadena de caracteres
      
       mult3=numero%3; //El módulo 
       mult5=numero%5;
       
       if(mult3==0){
           System.out.println("TRI");
       }
       
       if(mult5==0){
           System.out.println("FIV");
       }
       
       if(mult3==0 && mult5==0){
           System.out.println("TRIFIV");
       }
    }
    
    }
    
    
    
