/*
 * Este programa é para voce sair da matrix
 */
package br.com.MatrixTeste;

import java.util.Scanner;
/**
 * @author camila
 */
public class MatrixTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    boolean continuar = true;
    char opcao = 67;
    Scanner entrada = new Scanner(System.in);
    
    while (continuar) {
   System.out.println("Você está na matrix!");
   System.out.print("Digite o caractere especial para sair da matrix: ");
   opcao = entrada.nextLine().charAt(0);
   break;
    }//fim do while
    
    if (opcao=='c'){
    continuar = false;
    System.out.println("Parabéns! Você conseguiu sair da matrix");
    }//fim do if
    
    else{
    System.out.println("Você não está autorizado(a) a sair da matrix. "
            + "Estude Java!");
    }//fim do else
    
       }//fim do main
   }//fim da classe