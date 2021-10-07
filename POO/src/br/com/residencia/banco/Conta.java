package br.com.residencia.banco;

public class Conta {
	String nome;
	int numero;
	double saldo;
	String agencia;

	public void sacar(double valor) {
		if (this.saldo > valor) {
			this.saldo = this.saldo - valor;
		} else {
			System.out.println("Saldo insuficiente!");
		}

	}

	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void transferir(double valor, Conta destinatario) {
		
		if(this.saldo>valor) {
			
			this.saldo=this.saldo-valor;
			destinatario.depositar(valor);
		}else {
			
			System.out.println("Saldo insuficiente!");
		}
			
		}
	}

