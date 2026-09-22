/*
 * TP0 EXO 1
 * INGE-1-APP-BDML1
 * 22/09/2026
 * Jakub Potaczala
 */

package com.mycompany.exo1;

import java.util.Scanner;

/**
 *
 * @author Potaczala
 */
public class Exo1 {

    public static void main(String[] args) {
        System.out.println("Bonjour");
        System.out.println("Au revoir");
        
        String prenom;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prenom ?");
        prenom = sc.nextLine();
        System.out.println("Enchante, " + prenom + " !");
    }
}
