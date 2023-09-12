/*
	Declarar uma variavel do tipo String com seu valor inicial igual a branco 
	("") e a seguir a atribuir as letras minusculas do alfabeto (abcde..z),
	uma-a-uma, as primeiras vinte e seis posições da variável String. imprimir o resultado
 */


public class AlfabetoMinusculo {
	
	public static void main (String[] args) {
		
		String alfabeto_minusculo = "";
		
		for(char letra = 'a'; letra <= 'z'; letra++)
		{
		
			alfabeto_minusculo = alfabeto_minusculo + letra;			
		 	
		}
		
		System.out.println(alfabeto_minusculo);
		
	}
}

