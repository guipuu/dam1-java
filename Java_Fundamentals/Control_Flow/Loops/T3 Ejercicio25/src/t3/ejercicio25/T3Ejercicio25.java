/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.ejercicio25;

import java.util.Scanner;

/**
 *
 * @author unai.rechis
 */
public class T3Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        String secreta;
        int intentos = 0;
        boolean acertada = false;
        int longitud;
        String pista = "";

        System.out.println("J1, DIME LA PALABRA SECRETA");
        secreta = sc.nextLine();
        longitud = secreta.length();

        for (int i = 0; i < longitud; i++) {
            pista = pista + '*';
        }

        System.out.println("J2, ADIVINA LA PALABRA");
        while (!acertada) {
            System.out.println("ADIVINA:");
            String intento;
            intento = sc.nextLine();
            intentos++;
            if (intento.length() != longitud) {
                System.out.println("La palabra tiene que tener " + longitud + " caracteres");
                continue;
            }

            for (int i = 0; i < longitud; i++) {
                char letraIntento = intento.charAt(i);
                char letraSecreta = secreta.charAt(i);

                if (letraIntento == letraSecreta) {
                    pista = pista.substring(0, i) + letraSecreta + pista.substring(i+1);
                }

            }
            System.out.println("Pista: " + pista);
            
            if (intento.equals(secreta)) {
                System.out.println("Acertaste");
                System.out.println("Numero de intentos: "+intentos);
                acertada=true;
            }
        }
    }

}
