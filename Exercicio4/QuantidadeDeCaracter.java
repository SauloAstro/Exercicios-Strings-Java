/*
 
  Escreva um programa que calcule e escreva a quantidade de vezes que o caractere 'a'
  aparecer em uma frase fornecida pelo usuário. Nota importante : para a contagem, 
  caractere pode ser maiúsculo ou minusculo;
  
 */

import java.util.Scanner;

public class QuantidadeDeCaracter {
	
	public static void main (String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int contador = 0;
	String palavra = sc.nextLine();
	 	
		
		
	sc.close();
	
	
	for(int i = 0; i < palavra.length(); i++ ){
			
			char result = palavra.charAt(i);
			
			if(result == 'a' || result == 'A' )
			{
				contador++;
			} 
		}
		
		System.out.println(contador);
	
	
	
	

	
		
	}
}

