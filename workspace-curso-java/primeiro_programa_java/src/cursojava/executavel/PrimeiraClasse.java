package cursojava.executavel;

/*Char representa 1 caracter, 1 letra*/

public class PrimeiraClasse {

	/* Main é um método auto executavel em Java */
	public static void main(String[] args) {

		/* Concatenação = unir ou juntar dados */

		String nome = "Dan";
		String cpf = "123.456.789-10";
		String telefone = "12 3456-7890";
		String endereco = "Marília - SP";
		
		String saida = "Meu nome é " + nome + ", o CPF é " + cpf 
				+ ", meu telefone é " + telefone + " e moro em " 
				+ endereco;

		System.out.println("Meu nome é " + nome + ", o CPF é " + cpf 
				+ ", meu telefone é " + telefone + " e moro em " 
				+ endereco); //pode ser feita assim
		
		System.out.println(saida); //ou assim (apagando o sys acima)
		
		

	}

}
