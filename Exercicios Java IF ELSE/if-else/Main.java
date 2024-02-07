/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N < 0) {
            System.out.println("o Numero é negativo!");
        } else if (N == 0) {
            System.out.println("o Numero é igual a 0!");
        } else {
            System.out.println("o Numero é Positivo!");

        }
      sc.close();
    }
}
