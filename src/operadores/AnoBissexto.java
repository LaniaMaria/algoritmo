package operadores;

public class AnoBissexto {
	
	public static boolean isBissexto(int ano) {
		
		if(ano % 400 == 0 ||(ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("Ano é Bissexto!");
			return true;
		}else {
			System.out.println("Não é Bissexto!");
			return false;
		}
		
	}

}
