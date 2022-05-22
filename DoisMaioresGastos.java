/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * Lucas de Medeiros Soares - 121110295
 */

import java.util.Scanner;

public class DoisMaioresGastos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] gastos = input.nextLine().split(" ");
        int maior1 = Integer.MIN_VALUE;
        int maior2 = Integer.MIN_VALUE;

        // deve dar pra fazer isso melhor mas eu vo fazer 2 for mesmo até mais!!
        // arrumei sou mt inteligent!
        for (String j : gastos) {
            int gasto = Integer.parseInt(j);

            if (gasto > maior1) {
                maior2 = maior1;
                maior1 = gasto;
            } else if (gasto > maior2) {
                maior2 = gasto;
            }
        }
        int soma = maior1 + maior2;
        System.out.println(soma);
    }
}
