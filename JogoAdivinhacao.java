/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * Lucas de Medeiros Soares - 121110295
 */

import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        while (true) {
            int tentativa = sc.nextInt();

            if (tentativa == numero) {
                System.out.println("ACERTOU");
                break;
            } else if (tentativa > numero) {
                System.out.println("MAIOR");
            } else {
                System.out.println("MENOR");
            }
        }
    }
}
