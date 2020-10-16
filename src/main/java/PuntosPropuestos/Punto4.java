/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuntosPropuestos;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;


/**
 *
 * @author M
 */
public class Punto4 {
    
    public static void main (String[] args) throws java.lang.Exception
	{
            //Declaración de objeto entrada de la clase Scanner :)
            Scanner teclado = new Scanner(System.in);
            int i = 0;
            int resultado = 0;
            int a;
            int b;
            System.out.println ("Bienvenido, nueva calculadora PLUS3000");
            System.out.println ("Vamos a multiplicar dos números.");
	    System.out.print("Ingrese el primer número: ");
	    a=teclado.nextInt();
	    System.out.print("ingrese el segundo número: ");
	    b=teclado.nextInt();
	    if (b<0){
                while (i> b) {
                i--;
                resultado -= a;
                }  
            }else{
                while (i< b) {
                i++;
                resultado += a;
                }  
            }
                     
            System.out.println ("Es resultado es: " + resultado);
	}
    
}
