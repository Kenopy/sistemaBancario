package sistema.bancario.model;
//imports
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Cliente {
	String cpf;
	String nome;
	
	//Nova lista contas
	private List<Conta> contas = new ArrayList<>();
	
	//Nova lista Telefones
	Set<String> telefones = new HashSet<>();
	
	//Contrutores
	public Cliente(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public Cliente(String cpf){
		this.cpf = cpf;
	}
	
	//Matodos auto
	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cpf, other.cpf);
	}
	
	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", contas=" + contas + ", telefones=" + telefones + "]";
	}
	
	//metodos func.
	public void adicionarConta(Conta c)
	{
		if(!contas.contains(c))
			contas.add(c);
		else
			System.out.println("Conta j� cadastrada!");
	}
	
	public boolean containsConta(Conta c)
	{
		if(contas.contains(c))
			return true;
		else
			return false;
	}
	
	public Conta localizarConta(String numeroConta) {
		Conta temp = new Conta(numeroConta);
		if(contas.contains(temp))
		{
			int index = contas.indexOf(temp);
			temp = contas.get(index);
			return temp;
		}
		else
			return null;
	}
	
	public void removerConta(Conta c)
	{
		if(contas.contains(c))
			contas.remove(c);
		else
			System.out.println("Conta n�o cadastrada!");
	}
	
	public void cadastrarCliente(String nome, String cpf) {
		
	}
}
