package banco;

import java.util.ArrayList;
import java.util.List;

import banco.contas.Conta;

public class Banco 
{

	private List<Conta> listaContas;
	
	public Banco()
	{
		this.listaContas = new ArrayList<Conta>();
	}
	
	public void adicionarConta(Conta conta)
	{
		boolean contaValida = (conta != null);
		if(contaValida)
		{
			this.listaContas.add(conta);
		}
		
	}
	
	public void mostrarEstadoTodasContas()
	{
		for(int cont=0;cont<listaContas.size();cont++)
		{
			System.out.println(listaContas.get(cont).mostrarExtrato()+"\n");
			
			
		}
	}
	
	
}
