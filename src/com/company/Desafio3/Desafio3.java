package com.company.Desafio3;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.ceil;
import static java.lang.Math.sqrt;


public class Desafio3 {

    public static Object main(String[] args) {

        Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner
        String str;

        System.out.printf("Informe uma palavra: ");
        str = ler.nextLine(); // 3. entrada de dados (lendo um valor inteiro)


        // Concatena todas as palavars que foram passadas como argumentos em uma única string
        final String finalString = String.join("", str).replace(" ", "");

        // Tira a raiz quadrada do tamanho da string final, arredondando para cima,
        // caso a raiz não seja exata
        final int gridSize = (int) ceil(sqrt(finalString.length()));

        // Cria uma grid com strings vazias
        final String[][] grid = new String[gridSize][gridSize];
        for (final String[] row : grid) {
            Arrays.fill(row, "");
        }

        // Monta a grid a partir da string
        fillGrid(grid, gridSize, finalString);

        // Obtemos a resposta com a grid criada e depois printa ela no terminal
        final String response = getResponse(grid, gridSize);

        System.out.println(response);
        return response;
    }

    /**
     * Monta a resposta com a grid que criamos
     */
    private static String getResponse(final String[][] grid, final int gridSize) {
        final String[][] transposedGrid = transposeGrid(grid, gridSize);

        final StringBuilder builder = new StringBuilder();

        for (final String[] row : transposedGrid) {
            final String joinedRow = String.join("", row);
            builder.append(joinedRow).append(" ");
        }

        // Remove o último espaço adicionado, que é extra
        builder.deleteCharAt(builder.length() - 1);

        return builder.toString();
    }

    /**
     * Obtem a grid tranposta da que é enviada. Lembrando que transpor nada mais nada menos é
     * trocar os valores das linhas e colunas.
     */
    private static String[][] transposeGrid(final String[][] grid, final int gridSize) {
        final String[][] transposedGrid = new String[gridSize][gridSize];

        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                transposedGrid[i][j] = grid[j][i];
            }
        }

        return transposedGrid;
    }


    /**
     * Método responsável por preencher a grid com os elementos vindos da string
     */
    private static void fillGrid(final String[][] grid, final int gridSize, final String finalString) {
        int totalCharWritten = 0;
        final int stringSize = finalString.length();

        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                grid[i][j] = String.valueOf(finalString.charAt(totalCharWritten));
                totalCharWritten++;

                if (totalCharWritten == stringSize) {
                    // Foram escritos todos os caracteres na grid
                    return;
                }
            }
        }

    }
}

