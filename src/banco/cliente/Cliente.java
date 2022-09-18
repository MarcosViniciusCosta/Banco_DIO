package banco.cliente;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nome;
	private List<String> listaEndereco;
	private List<String> listaTelefone;
	
	public Cliente(String nome)
	{
		this.nome = nome;
		this.listaEndereco = new ArrayList<String>();
		this.listaTelefone = new ArrayList<String>();
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public void adicionarEndereco(String endereco)
	{
		this.listaEndereco.add(endereco);
	}
	
	public void adicionarTelefone(String telefone)
	{
		this.listaTelefone.add(telefone);
	}
	
	public List<String> getListaEndereco()
	{
		return this.listaEndereco;
	}
	
	public List<String> getListaTelefone()
	{
		return this.listaEndereco;
	}
	
}
