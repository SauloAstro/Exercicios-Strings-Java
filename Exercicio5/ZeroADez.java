/*
	Declarar uma variável do tipo string com seu valor inicial 
	igual a branco ("") e a seguir atribuir os caracteres númericos
	(0123456789), um-a-um, as primeiras dez posições da variável String 
	 imprimir o resultado.
 */


public class ZeroADez {
	
	public static void main (String[] args) {
		String numeros = "";
		
		for(char n1 = '0'; n1 <= '9'; n1++ )
		{
		  
		  numeros = n1 + numeros;	
		  System.out.print(n1);
		}
		
	}
}

