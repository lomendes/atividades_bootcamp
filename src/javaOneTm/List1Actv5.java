package javaOneTm;
// Desenvolver um programa para exibição por console os n primeiros números naturais que
//têm pelo menos m dígitos de d, sendo n, m e d valores que o utilizador vai informar pelo
//console.
//Por exemplo: se o usuário inserir n = 5, m = 2 e d = 3, o programa deve exibir os primeiros 5
//números naturais que tenham pelo menos 2 dígitos terminados em 3 no console. Neste
//caso, a saída será: 33, 133 , 233, 303, 313.
//Dependendo de como você decidir abordar a solução para este exercício, pode ser
//necessário usar recursos que ainda não estudamos. Faz parte do desafio encontrar
//soluções na Internet e utilizá-las.

import java.util.Arrays;
import java.util.Scanner;

import static javaOneTm.List1Actv1.getInputUser;

public class List1Actv5 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int n = getInputUser("Digite o valor de n");
        int m = getInputUser("Digite o valor de m");
        int d = getInputUser("Digite o valor de d");

        int[] vector = naturalNumbers(n, m, d);
        System.out.print(Arrays.toString(vector));

        sc.close();
    }

    public static int[] naturalNumbers(int n, int m, int d) {
        int[] vector = new int[n];
        int positions = 0, control = 0;

        for (int i=0; positions <= (n-1); i++){
            int x = i;
            while (control <= m) {
                x = x%10;
                if (x == d){
                    control += 1;
                }
                else{
                   x += 1;
                }
                vector[positions] = i;
            }
            positions += 1;
        }
        return vector;
    }
}

