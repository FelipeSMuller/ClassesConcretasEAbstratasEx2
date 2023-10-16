package br.com.poo.pacote;

import javax.swing.JOptionPane;

import br.com.poo.metodos.TratarDados;

//A classe carro herda todos os atributos e métodos da classe veiculo
public class Carro extends Veiculo {

	@Override
	public void ligarVeiculo() {

		// Inicializa a variavel com o valor definido com os métodos encapsulados ,
		// enquanto o valor fornecido for maior do que 100 liga o veiculo e continua
		// aumentando
		for (int velocidadeAtual = 0; velocidadeAtual <= this.velocidadeMaxima; velocidadeAtual++) {

			try {

				// Delay utilizando thread sleep, conta de 1 em 1 segundos
				Thread.sleep(50);

			} catch (InterruptedException e) {

				// Gera uma mensagem de erro no prompt se o delay for interrompido
				JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado , tente novamente", null,
						JOptionPane.ERROR_MESSAGE);

				e.printStackTrace();
			}

			// Imprime no console os valores do carro
			System.out.print("Acelerando:  " + velocidadeAtual + "KM/h" + " ");

		}

		// imprime no prompt uma mensagem informando que o valor máximo foi atingido
		JOptionPane.showMessageDialog(null, "O veículo atingiu a velocidade máxima!!");
	}

	@Override
	public void desligarVeiculo() {

		// Enquanto a velocidade do veiculo estiver acima de 0 , decrementa
		for (Double velocidadeAtual = this.velocidadeMaxima; velocidadeAtual > 0; velocidadeAtual--) {

			// Se o veiculo ja estiver desligado ( inicializado em 0), gera uma mensagem no
			// prompt
			if (velocidadeAtual <= 0) {

				JOptionPane.showMessageDialog(null,
						"O veículo ja está desligado, não é possível prosseguir com a operação", null,
						JOptionPane.WARNING_MESSAGE);

				break;
			}

			try {

				// Delay utilizando thread sleep, conta de 1 em 1 segundos
				Thread.sleep(50);

			} catch (InterruptedException e) {

				// Gera uma mensagem de erro no prompt se o delay for interrompido
				JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado , tente novamente", null,
						JOptionPane.ERROR_MESSAGE);

				e.printStackTrace();
			}

			// Imprime no console os valores do carro
			System.out.print("Desacelerando:  " + velocidadeAtual + "KM/h" + " ");

		}

		// imprime no prompt uma mensagem informando que o valor máximo foi atingido
		JOptionPane.showMessageDialog(null, "O veículo atingiu a velocidade 0 KM/h, portanto o veiculo foi desligado");

	}

	@Override
	public void verificarDados() {

		// Imprime no prompt os dados do carro
		JOptionPane.showMessageDialog(null,
				"VEICULO" + "\nVelocidade máxima: " + TratarDados.formatarVelocidade(getVelocidadeMaxima()));

	}

}
