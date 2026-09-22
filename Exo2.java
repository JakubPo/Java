/*
 * TP0 EXO 2
 * INGE-1-APP-BDML1
 * 22/09/2026
 * Jakub Potaczala
 */


package com.mycompany.exo2;

import java.util.Scanner;

/**
 *
 * @author Potaczala
 */
public class Exo2 {

    public static void main(String[] args) {
        // Déclaration des variables
        int nb;     // nombre d'entiers à additionner
        int result; // resultat
        int ind;    // indice
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entrer le nombre :");
        nb = sc.nextInt(); 
        
        result = 0;
        ind = 1;
        
        // Addition des nb premiers entiers
        while (ind <= nb) {
            result = result + ind;
            ind++;
        }
        
        System.out.println();
        System.out.println("La somme des " + nb + " entiers est : " + result);
    }
}
