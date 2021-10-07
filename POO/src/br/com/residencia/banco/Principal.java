package br.com.residencia.banco;

public class Principal {

	public static void main(String[] args) {

		
		Conta usuario = new Conta();
		
		usuario.nome="Jorge";
		usuario.agencia="221";
		usuario.numero=55789;
		usuario.saldo=1000;
		
		usuario.depositar(20000);
		usuario.sacar(10000);
		
		Conta destinatario = new Conta();
		 
		destinatario.nome="vasco";
		destinatario.agencia="221";
		destinatario.numero=557788;
		destinatario.saldo=200;
		
		
		usuario.transferir(100, destinatario);
		
		System.out.printf("R$ %.2f\n",usuario.saldo);
		System.out.printf("R$ %.2f",destinatario.saldo);
	}

}
