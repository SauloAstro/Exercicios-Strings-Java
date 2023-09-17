/*
	Escreva um programa que calcule e escreva a quantidade de vezes que
	um caractere fornecedio pelo usuário aparece em uma frase, também 
	fornecida pelo mesmo. Nota Importante : para contagem , o caractere
	pode ser maiusculo ou minusculo;
 */


import java.util.Scanner;
public class NumerosDeCaracteres2 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a frase que deseja");
		String palavra = sc.nextLine();
		
		System.out.println("Digite a letra que você deseja saber a quantidade de caracteres");
		String letra = sc.nextLine();
		sc.close();
		
		
		
		int contador = 0;
	
		for(int i = 0; i < palavra.length(); i++)
		{
			
			char result = palavra.charAt(i);
			
			String resultado_convertido = String.valueOf(result); // Converti a variavel char result para string para poder usar o equalsIgnore case 
 			
			if(resultado_convertido.equalsIgnoreCase(letra)) 
			{
			  ++contador;	
			}
			
		} 

		
		
		System.out.println(contador);
	
		
	}
}

