package aula;

public class nome {
	public static void main (String[] args) {
		String primeiroNome = "Carlos";
		String segundoNome = "Victor";
		
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		System.out.println(nomeCompleto);
	}
	
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return "Resultado do metodo: " + primeiroNome.concat(" ").concat(segundoNome);
	}
}
