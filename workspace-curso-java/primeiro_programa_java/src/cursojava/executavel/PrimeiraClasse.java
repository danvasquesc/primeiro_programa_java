package cursojava.executavel;

public class PrimeiraClasse {

	/* Variável Global é acessivel a todos e seu valor compartilhado */
	static int maiorIdadeGlobal = 30;

	/* Main é um método auto executavel em Java */
	public static void main(String[] args) {

		/*
		 * Variável local porque pertence somente a esse método e o valor fica dentro do
		 * metodo que pertence
		 */
		int maiorIdade = 18;
		System.out.println("Valor da variavel local = " + maiorIdade);

		/* necessita colocar o metodo criado dentro do metodo executavel */
		metodo2();

	}

	public static void metodo2() {

		/* Variavel local do metodo */
		int mediaAno = 50;

		/* Aqui vai imprimir a variavel global */
		System.out.println("Valor da variavel Global = " + maiorIdadeGlobal);

	}

}
