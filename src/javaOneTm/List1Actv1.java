package javaOneTm;

import java.util.Arrays;
import java.util.Scanner;

// Desenvolva um programa para mostrar os primeiros n números pares, sendo n um valor
//que o usuário irá inserir pelo console.

public class List1Actv1 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int n = getInputUser("Digite o valor de n");
        int[] vect = getVect(n);
        System.out.print(Arrays.toString(vect));

        sc.close();
    }

    private static int[] getVect(int n) {
        int[] vect = new int[n];
        int posicao = 0;

        for (int i = 0; posicao <= (n -1); i++) {

            if (i % 2 == 0) {
                vect[posicao] = i;
                posicao += 1;
            }

        }
        return vect;
    }

    public static int getInputUser(String menssagem){
        System.out.println(menssagem);
        int n = sc.nextInt();
        return n;
    }

}
