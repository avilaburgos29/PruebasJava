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
public class Punto1 {
    
    int numeroA, numeroB, numeroC;
   
    Scanner entrada = new Scanner(System.in);
   
    public void ingresarnumeros() {
        System.out.println("Bienvenid@, Vamos a organizar 3 numeros");
        System.out.print("Ingrese numero 1: ");
        numeroA = entrada.nextInt();
        System.out.print("Ingrese numero 2: ");
        numeroB = entrada.nextInt();
        System.out.print("Ingrese numero 3: ");
        numeroC = entrada.nextInt();     
    }
   
    public void ordenar() {
        if(numeroA>numeroB) {
            if(numeroA>numeroC) {
                if(numeroB>numeroC) {
                    System.out.println("Orden descendente: " + numeroA + " " + numeroB + " " + numeroC);                 
                }else {
                    System.out.println("Orden descendente: " + numeroB + " " + numeroC + " " + numeroA);
                }
            }else {
                System.out.println("Orden descendente: " + numeroC + " " + numeroA + " " + numeroB);
            }
        }else {
            if(numeroB>numeroC) {
                if(numeroA>numeroC) {
                    System.out.println("Orden descendente: " + numeroB + " " + numeroA + " " + numeroC);
                }else {
                    System.out.println("Orden descendente: " + numeroB + " " + numeroC + " " + numeroA);
                }              
            }else {
                System.out.println("Orden descendente: " + numeroC + " " + numeroB + " " + numeroA);
            }
        }
    }
 
    public static void main(String[] args) {
        Punto1 fc = new Punto1();
        fc.ingresarnumeros();
        fc.ordenar();
    }
}
