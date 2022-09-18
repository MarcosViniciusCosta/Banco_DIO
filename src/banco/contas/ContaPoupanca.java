package banco.contas;

import banco.cliente.Cliente;

public class ContaPoupanca extends Conta 
{

	
	public ContaPoupanca(String agencia, String numero, Cliente cliente) 
	{
		super(agencia, numero, cliente);
	}

	public String simularInvestimento()
	{
		return "3 meses: " + String.format("%.2f", 1.03*getSaldo())+"\n"+
				"6 meses: " + String.format("%.2f",1.06*getSaldo())+"\n"+
				"9 meses: " + String.format("%.2f", 1.09*getSaldo())+"\n";
				
	}
}
