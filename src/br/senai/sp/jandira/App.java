package br.senai.sp.jandira;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        //Exemplo Array
        Scanner teclado = new Scanner(System.in);

        String [] carros = {"x1", "fusca", "ferrari", "uno", "Prisma"};



        System.out.println("================================");
        System.out.println("---------- Bem Vindo -----------");
        System.out.println("================================");


        for (int i = 0; i<carros.length; i++){
            System.out.println("Carro " + (i+1) + " : " + carros[i]);
        }

        System.out.println("Escolha seu carro: ");
        String opcaoUsuario = teclado.nextLine();

        boolean validaCar = false;

        for (int i = 0; i < carros.length; i++){

            if (opcaoUsuario.equalsIgnoreCase(carros[i])){
                System.out.println("Esse veículo está disponível.");
                validaCar = true;
            }

        }

        if (!validaCar){
            System.out.println("Infelizmente esse veículo está indisponível.");
        }


        for (int i = 10; i > 0; i--){

        }

//        Exemplo Loop doWhile

        boolean testeDo = false;

        do{
            System.out.println("Java é top!");
        }while (testeDo);

//        Exemplo while

        boolean testeWhile = true;

        while (testeWhile){
            System.out.println("Java é top!");
            testeWhile = false;
        }

//        Exemplo for
        for (int i = 0; i < 10; i++){
            System.out.println("Java é top!");
        }



    }
}
