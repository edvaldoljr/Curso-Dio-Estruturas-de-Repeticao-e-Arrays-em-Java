package aulas.exercicios.arrays;

import java.util.Random;

/**
 * Gere e imprima uma matriz M 4X4 com valores aleatórios entre 0 - 9.
 */
public class ArrayMultidimensional {

    public static void main(String[] args) {

        Random random = new Random();

        int[][]  matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : matriz) {
            for (int elementoDaColuna : linha) {
                System.out.print(elementoDaColuna + " ");
            }
            System.out.println();
        }
    }
}
