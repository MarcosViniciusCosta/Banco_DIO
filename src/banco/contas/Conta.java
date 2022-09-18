package banco.contas;

import banco.cliente.Cliente;

public abstract class Conta 
{
	private double saldo;
	private String agencia;
	private String numero;
	private Cliente cliente;
	
	public Conta(String agencia, String numero, Cliente cliente)
	{
		this.agencia = agencia;
		this.cliente = cliente;
		this.numero = numero;
		this.saldo = 0;
	}
	
	
	public final double sacar(double valor)
	{
		boolean valorValido = (valor<= saldo && valor > 0);
		
		if(valorValido)
		{
			this.saldo-= valor;
		}
		return this.saldo;
	}
	
	public final double depositar(double valor)
	{
		boolean valorValido = (valor>0);
		
		if(valorValido)
		{
			this.saldo+= valor;
		}
		return this.saldo;
	}
	
	public final double transferir(Conta contaAlvo, double valor)
	{
		boolean contaValida = (contaAlvo != null);
		boolean valorValido = (valor<= saldo && valor > 0);
		
		if(valorValido && contaValida)
		{
			sacar(valor);
			contaAlvo.depositar(valor);
		}
		return this.saldo;
	}
	
	public final String getAgencia()
	{
		return this.agencia;
	}
	
	public final String getNumero()
	{
		return this.numero;
	}
	
	public final Cliente getCliente()
	{
		return this.cliente;
	}
	
	public final double getSaldo()
	{
		return this.saldo;
	}
	
	public String mostrarExtrato()
	{ 
		return "{Agencia: " + agencia+"\n"
				+"Numero: " + numero + "\n"
				+"Saldo: " + String.format("%.2f", saldo) + "\n"
				+"Dono: " + cliente.getNome() + "}";
	}
	
}
