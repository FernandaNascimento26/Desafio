package com.company;

public class Encrypt {

        public static void main(String[] args) {
            String str = "Olá mundo";

            //Retirando espaços em branco
            String result = str.replaceAll("\\s+","");
            System.out.println(result);

            //Contando o número de caracteres sem espaços em branco
            long totalCharacters = str.chars().filter(ch -> ch != ' ').count();
            System.out.println("total: " + totalCharacters);


            //Raiz da quantidade de caracteres
            double raiz = Math.sqrt(totalCharacters);

            //Arredondando a raiz
            raiz =  Math.ceil(raiz);
            System.out.println(raiz);



        }
}
