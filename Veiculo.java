package br.com.poo.pacote;

//Importando o pacote que contém diversos métodos para tratamento de erros
import br.com.poo.metodos.*;

//Classe abstrata, que servirá como um molde para suas subclasses, não pode ser instanciada, gera um erro de compilação caso isso seja feito
public abstract class Veiculo {

	// Método encapsulado, acessado apenas pelos getters e setters
	protected Double velocidadeMaxima;

	public Double getVelocidadeMaxima() {

		return velocidadeMaxima;
	}

	// Métodos públicos para acessar os atributos encapsulados
	public void setVelocidadeMaxima(Double velocidadeMaxima) {

		// Método que verifica se o valor é valido
		TratarDados.tratarDecimais(velocidadeMaxima);

		this.velocidadeMaxima = velocidadeMaxima;
	}

	// Método abstrato , conténdo alguns comportamentos do veiculo, como ligar, desligar e verificar a velocidade fornecida

	public abstract void ligarVeiculo();

	public abstract void desligarVeiculo();

	public abstract void verificarDados();

}
