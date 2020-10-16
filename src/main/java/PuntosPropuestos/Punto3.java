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
public class Punto3 {
    
    public static void main (String[] args) throws java.lang.Exception
	{
            int cantidad_elementos = 0;
            Scanner teclado = new Scanner(System.in);
            System.out.println ("Bienvenido, vamos a construir un arreglo de números y encontrar el mayor de ellos.");
	    System.out.print("Ingrese la cantidad de elementos (tamaño del arreglo): ");
            cantidad_elementos=teclado.nextInt();            
            int[] vector = new int[cantidad_elementos];
            for(int i=0;i<vector.length;i++){
			vector[i] = new Random().nextInt(cantidad_elementos);
            }            
            int numeromayor;
            numeromayor = vector[0];
            for(int i=0; i<vector.length; i++){
                if(vector[i]>numeromayor){ // 
                    numeromayor = vector[i];
                }
            }
            System.out.println ("Entre los "+ cantidad_elementos + " elementos, el mayor encontrado es: " + numeromayor);
	}
    
}
