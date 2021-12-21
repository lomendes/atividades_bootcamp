package javaOneTm;

//Desenvolva um programa para informar se um um número n é primo ou não, sendo n um
//valor que o usuário irá inserir pelo console.

import java.util.Scanner;

public class List1Actv3 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int n = getInputUser("Digite o valor de n");
        ehPrimo(n);
    }

    private static void ehPrimo(int n) {
        int cont = n;
        int control = 0;
        for (int i =1; i <= cont; i++) {
            if (n % i == 0){
                control += 1;
            }
            else{
                continue;
            }
        }

        if (control == 2){
            System.out.println("O número é primo");
        }
        else{
            System.out.println("O número não é primo");
        }
    }

    public static int getInputUser(String menssagem){
        System.out.println(menssagem);
        int n = sc.nextInt();
        return n;
    }
}
