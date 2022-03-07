package com.company;

import java.util.Scanner;

public class Desafio2 {

	public static int calcDiff(int n[], int x) {
		int qtd = 0;
		

		for(int i = 0; i < n.length; i++) {

			for(int j = 0; j < n.length; j++) {

				if(n[i] - n[j] == x) {
					qtd++;
				}	
			}
		}
		
		return qtd;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Recebendo valores de entrada
		System.out.println("Informe o vetor: ");
		String vetString = scanner.nextLine();
		
		System.out.println("Informe o numero inteiro para comparação: ");
		int x = scanner.nextInt();
		
		scanner.close();
		

		vetString = vetString.substring(vetString.indexOf("[") + 1, vetString.indexOf("]"));
		

		int tamVet = 0;
		char separator = ',';
		for(int c = 0; c < vetString.length(); c++) {
			if(vetString.charAt(c) == separator) {
				tamVet++;
			}	
		}
		

		int vet[] = new int[tamVet + 1];
		int vetCount = 0;
		

		for(int c = 0; c < vetString.length(); c++) {
			if(vetString.charAt(c) != separator) {
				vet[vetCount] = Integer.parseInt(String.valueOf(vetString.charAt(c)));
				vetCount++;
			}	
		}
		

		int out = calcDiff(vet, x);

		System.out.println(out);
	}

}
