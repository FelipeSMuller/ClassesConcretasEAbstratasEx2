package br.com.poo.pacote;

import javax.swing.JOptionPane;

public class PraticandoAbstract2 {

	public static void main(String[] args) {

		// Instância do objeto do tipo carro.
		Carro carro1 = new Carro();

		// Variavel do tipo inteiro que recebe a entrada do usuário
		int opcao = 0;

		// Inicialização do loop

		do {

			// Inicialização da estrutura try catch
			try {

				// Converte o método JOptionPane, que originalmente retorna uma String, porém
				// com o Integer.parseInt retorna um número inteiro
				opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
						"ESCOLHA UMA OPÇAO \n1-Ligar o veiculo \n2-Desligar o veiculo"));

				// Trata o erro, caso o programa seja fechado ou o usuário insira dados não
				// numéricos

				// Inicio da estrutura switch case:
				switch (opcao) {

				// Caso a primeira opção seja escolhida, executa a linha de código
				case 1:

					// Acessando o atributo privado através dos métodos públicos
					carro1.setVelocidadeMaxima(Double
							.parseDouble(JOptionPane.showInputDialog(null, "Defina a velocidade máxima do veículo:")));

					// Imprime no prompt a velocidade fornecida
					carro1.verificarDados();

					// Inicia a contagem , de 1 em 1 segundo até atingir a velocidade máxima
					// específicada acima
					carro1.ligarVeiculo();

					break;

				case 2:

					//Imprime no console a contagem regressiva até chegar em 0 ( desligado ) 
					carro1.desligarVeiculo();

				}
			} catch (NumberFormatException | NullPointerException erro) {

				// Gera uma mensagem no prompt caso seja inserido um valor não numérico ou o
				// programa seja finalizado incorretamente!!

				JOptionPane.showMessageDialog(null,
						"Dados não numéricos foram inseridos ou o programa foi finalizado incorretamente!!", null,
						JOptionPane.ERROR_MESSAGE);

			}

			// Enquanto a opção escolhida pelo usuário for maior do que 0 continua o loop.
		} while (opcao > 0);
	}

}
