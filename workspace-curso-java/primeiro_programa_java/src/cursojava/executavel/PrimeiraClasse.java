package cursojava.executavel;

/*Char representa 1 caracter, 1 letra*/

public class PrimeiraClasse {

	/* Main é um método auto executavel em Java */
	public static void main(String[] args) {

		char pessoaFisica = 'C';
		char pessoaJuridica = 'J';

		char sexoMasculino = 'M';
		char sexoFeminino = 'F';

		/*
		 * Pode ser usado para busca em banco de dados; ocupa pouca memoria
		 */

		if (sexoFeminino == 'F') {
			System.out.println("Feminino");
		} else {
			System.out.println("Masculino");
		}

	}

}
