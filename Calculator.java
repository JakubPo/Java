/*
 * TP0 EXO 3
 * INGE-1-APP-BDML1
 * 22/09/2026
 * Jakub Potaczala
 */

package com.mycompany.calculator;

import java.util.Scanner;

/**
 *
 * @author Potaczala
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operateur;
        int operande1;
        int operande2;
        float resultat = 0;
        
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
        operateur = sc.nextInt();
        
        // Test de l'opérateur avant de demander les opérandes
        if (operateur < 1 || operateur > 5) {
            System.out.println("Erreur : l'opérateur n'est pas valide.");
            System.exit(0);
        }
        
        System.out.println("Please enter the first number:");
        operande1 = sc.nextInt();
        
        System.out.println("Please enter the second number:");
        operande2 = sc.nextInt();
        
        switch (operateur) {
            case 1 -> resultat = operande1 + operande2;
            case 2 -> resultat = operande1 - operande2;
            case 3 -> resultat = operande1 * operande2;
            case 4 -> {
                // Protection contre la division par zéro
                if (operande2 == 0) {
                    System.out.println("Erreur : division par zéro.");
                    System.exit(0);
                }
                resultat = operande1 / operande2;
            }
            case 5 -> {
                if (operande2 == 0) {
                    System.out.println("Erreur : modulo par zéro.");
                    System.exit(0);
                }
                resultat = operande1 % operande2;
            }
        }
        
        System.out.println("The result is: " + resultat);

    }
}
