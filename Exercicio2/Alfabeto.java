/*
	Declarar uma variável do tipo String com seu valor inicial 
	igual a branco ("") e a seguir atribuir as letras maiúsculas 
	alfabeto (ABCDE...Z), uma-a-uma, as primeiras vinte e seis posições 
	da variável String. Imprimir o resultado.
 */


public class Alfabeto {
	
	public static void main (String[] args) {
		
		String alfabeto = "";
		
		for(char letra = 'A'; letra <= 'Z'; letra++){
			
			alfabeto = alfabeto + letra;
			
			
			}
	
			System.out.println(alfabeto);
	
		
		
		
	}
}

