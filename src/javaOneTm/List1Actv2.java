package javaOneTm;


////Desenvolva um programa para mostrar os primeiros n números múltiplos de m, sendo n e
////m valores que o usuário irá inserir via console.

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class List1Actv2 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de n");
        int n = sc.nextInt();

        System.out.println("Digite o valor de m");
        int m = sc.nextInt();

        int[] vect = new int[n];
        int posicao = 0;


        for (int i =0; posicao <= (n-1); i++) {

            if (i % m == 0) {

                vect[posicao] = i;
                posicao += 1;
            }

        }
        System.out.print(Arrays.toString(vect));



        sc.close();
    }
}
