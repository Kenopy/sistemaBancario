package sistema.bancario.model;
//imports
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Conta {
	
	//Var e Array
	String numeroConta;
	float saldo;
	Date dataAbertura;
	boolean status;
	ArrayList<Conta> contas = new ArrayList<Conta>();
	
	//Contrutores
	public Conta(){
		
	}
		
	public Conta(String numeroConta){
		this.numeroConta = numeroConta;
		this.saldo = 0f;
		this.status = true;
		this.dataAbertura = new Date();
	}
	
	//Metodos Auto
	@Override
	public int hashCode() {
		return Objects.hash(numeroConta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return Objects.equals(numeroConta, other.numeroConta);
	}

	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", saldo=" + saldo + ", dataAbertura=" + dataAbertura + ", status="
				+ status + "]";
	}
}
