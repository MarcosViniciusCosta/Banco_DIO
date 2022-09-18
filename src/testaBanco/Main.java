package testaBanco;

import banco.Banco;
import banco.cliente.Cliente;
import banco.contas.Conta;
import banco.contas.ContaCorrente;
import banco.contas.ContaPoupanca;

public class Main 
{
	public static void main(String[] args)
	{
		Cliente seuMadruga = new Cliente("Seu madruga");
		Cliente jaiminho = new Cliente("Jaiminho");
		Cliente quico = new Cliente("Quico");

		Conta contaSeuMadruga = new ContaCorrente("Ag514","68",seuMadruga);
		Conta contaJaiminho = new ContaCorrente("Ag514","69",jaiminho);
		Conta contaQuico = new ContaPoupanca("Ag514","70",quico);

		Banco banco = new Banco();
		
		banco.adicionarConta(contaSeuMadruga);
		banco.adicionarConta(contaJaiminho);
		banco.adicionarConta(contaQuico);
		
		contaSeuMadruga.depositar(800);
		contaJaiminho.depositar(150);
		contaQuico.depositar(100);
		
		
		contaQuico.sacar(50);
		contaJaiminho.transferir(contaSeuMadruga, 120.73);
		
		banco.mostrarEstadoTodasContas();
		


	}

}
