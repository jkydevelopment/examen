/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodologiaagil;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class MetodologiaAgil {

    Scanner teclado = new Scanner (System.in);
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        startCalculadora();
    }
    
    void startCalculadora(){
        while(true){
            System.out.println("¿Qué operación quieres realizar?");
            System.out.println("1: Sumar");
            System.out.println("2: Restar");
            System.out.println("3: Multiplicar");
            String cadena;
            cadena = teclado.nextLine();
            
            switch (cadena){
                case "1": 
                    System.out.println("El resultado de la suma es: " + suma());
                    break;
                case "2": 
                    System.out.println("El resultado de la resta es: " + resta());
                    break;
                case "3": 
                    System.out.println("El resultado de la suma es: " + multiplica());
                    break;
            }
            
        }
    }
    
    int suma(){
        int a; 
        int b;
        System.out.println("Introduce el valor del primer sumando:");
        a = teclado.nextInt();
        System.out.println("Introduce el valor del segundo sumando:");
        b = teclado.nextInt();        
        return a+b;
    }
    
    int multiplica(){
        int a; 
        int b;
        System.out.println("Introduce el valor del primer elemento:");
        a = teclado.nextInt();
        System.out.println("Introduce el valor del segundo elemento:");
        b = teclado.nextInt();        
        return a*b;
    }
    
    int resta(){
        int a; 
        int b;
        System.out.println("Introduce el valor del minuendo:");
        a = teclado.nextInt();
        System.out.println("Introduce el valor del sustraendo:");
        b = teclado.nextInt(); 
        if (checkResta(a, b)){
            System.out.println("Valores incorrectos. El minuendo debe ser mayor que el sustraendo");
            resta();
        }
        return a-b;
    }
    
    boolean checkResta(int a, int b){
        return (a>b);
    }
    
    void testing(){
        //testing del proyecto...
    void numerosRomanos(){
        //Inserción de los números romanos...
    }
    
}
