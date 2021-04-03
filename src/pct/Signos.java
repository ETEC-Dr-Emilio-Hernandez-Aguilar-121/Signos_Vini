/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author vastv
 */
public class Signos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
            //Declaração de variáveis
            int dia, mes;

            //Criação e instância do objeto de entrada
            Scanner entrada = new Scanner(System.in);

            //Apresentação
            System.out.println("\n\t\t\t -- Signos --\n");

            //Entradas
            System.out.print("Informe o dia do seu nascimento : ");
            dia = entrada.nextInt();

            System.out.print("Informe o mês do seu nascimento: ");
            mes = entrada.nextInt();

            //Processamento
            if((mes == 1) && ((dia >= 20) && (dia <= 31)) || (mes ==2) && ((dia >= 1) && (dia <= 18)))
        {
            System.out.println("\nSeu Signo é Aquário");
        } else if((mes == 2) && ((dia >=19) && (dia <=28)) || (mes ==3) && ((dia >= 1) && (dia <= 20)))
        {
            System.out.println("\nSeu Signo é Peixes\n"); 
        }else if((mes ==3) && ((dia >= 21) && (dia <=31)) || (mes == 4) && ((dia >= 1) && (dia <=19)))
        {
            System.out.println("\nSeu Signo é Áries");
        }else if((mes == 4) && ((dia >= 20) && (dia <= 30)) || (mes == 5) && ((dia >= 1) && (dia <= 20)))
        {
            System.out.println("\nSeu Signo é Touro");
        }else if((mes == 5) && ((dia >=21) && (dia <= 31)) || (mes == 6) && ((dia >= 1) && (dia <= 21)))
        {
            System.out.println("\nSeu Signo é Gêmeos");
        }else if((mes == 6) && ((dia >= 22) && (dia <= 30)) || (mes == 7) && ((dia >= 1) && (dia <= 22)))
        {
            System.out.println("\nSeu Signo é Câncer");
        }else if((mes == 7) && ((dia >= 23) && (dia <= 31)) || (mes == 8) && ((dia >= 1) && (dia <= 22)))
        {
            System.out.println("\nSeu Signo é Leão");
        }else if((mes == 8) && ((dia >= 23) && (dia <= 31)) || (mes == 9) && ((dia >= 1) && (dia <= 22)))
        {
            System.out.println("\nSeu Signo é Virgem");
        }else if((mes == 9) && ((dia >= 23) && (dia <= 30)) || (mes == 10) && ((dia >= 1) && (dia <= 22)))
        {
            System.out.println("\nSeu Signo é Libra");
        }else if((mes == 10) && ((dia >= 23) && (dia <=31)) || (mes == 11) && ((dia >= 1) && (dia <= 21)))
        {
            System.out.println("\nSeu Signo é Escorpião");
        }else if((mes == 11) && ((dia >= 22) && (dia <= 30)) || (mes == 12) && ((dia >= 1) && (dia <= 21)))
        {
            System.out.println("\nSeu Signo é Sagitário");
        }else if((mes == 12) && ((dia >= 22) && (dia <=31)) || (mes == 1) && ((dia >= 1) && (dia <= 19)))
        {
            System.out.println("\nSeu Signo é Capricórnio");
        }
        
        //inválido
        else
        {
            System.out.println("\nDigite um valor válido");
        }
    }
}
