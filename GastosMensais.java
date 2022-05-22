/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * Lucas de Medeiros Soares - 121110295
 */

import java.util.Scanner;


public class GastosMensais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] meses = sc.nextLine().split(" ");
        String[] gastos = sc.nextLine().split(" ");
        String entrada = sc.nextLine();

        for (int i = 0; i < meses.length; i++) {
            if (entrada.equals(meses[i])) {
                System.out.println(gastos[i]);
                break;
            }
        }
    }
}