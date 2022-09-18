package banco.contas;

import banco.cliente.Cliente;

public class ContaCorrente extends Conta 
{

	
	public ContaCorrente(String agencia, String numero, Cliente cliente) 
	{
		super(agencia, numero, cliente);
	}

	public String simularInvestimento()
	{
		return "3 meses: " + String.format("%.2f", 1.09*getSaldo())+"\n"+
				"6 meses: " + String.format("%.2f",1.18*getSaldo())+"\n"+
				"9 meses: " + String.format("%.2f", 1.27*getSaldo())+"\n";
				
	}
}
