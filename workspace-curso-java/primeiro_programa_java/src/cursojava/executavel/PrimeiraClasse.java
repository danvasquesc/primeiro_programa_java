package cursojava.executavel;

/*Operacoes lógicas com IF e ELSE*/

public class PrimeiraClasse {

	/* Main é um método auto executavel em Java */
	public static void main(String[] args) {

		int mediaAluno = 70;
		String nome = "Dan";

		/*
		 * equals() significa igual, ou seja, só será verdadeira a condição se a média
		 * for 70 e o nome for Dan - && para aprovar condição se ambos forem verdadeiros
		 */
		if (mediaAluno >= 70 && nome.equals("Dan")) {
			System.out.println("Aprovado!");
		} else if (mediaAluno < 70) {
			System.out.println("Reprovado!");
		} else {
			System.out.println("Aluno não encontrado");
		}

	}

}
