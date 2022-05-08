package sistema.bancario.model;
//imports
import java.util.Scanner;
import java.util.ArrayList;

public class Programa {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}
	
	public static void menu() {
		System.out.println("=============================================");
		System.out.println("|                  Bem vindo                |");
		System.out.println("=============================================");
		System.out.println(" ------------------------------------------- ");
		System.out.println(" |           Selecione uma Operação        | ");
		System.out.println(" ------------------------------------------- ");
		System.out.println(" |   1 - Cadastrar Cliente                 | ");
		System.out.println(" |   2 - Listar Cliente                    | ");
		System.out.println(" |   3 - Consultar Cliente por CPF         | ");
		System.out.println(" |   4 - Remover Cliente                   | ");
		System.out.println(" |   5 - Criar Conta e Associar ao Cliente | ");
		System.out.println(" |   6 - Listar Contas de Cliente          | ");
		System.out.println(" |   7 - Remover Conta                     | ");
		System.out.println(" |   8 - Realizar Depósito                 | ");
		System.out.println(" |   9 - Realizar Saque                    | ");
		System.out.println(" |  10 - Consultar Saldo                   | ");
		System.out.println("=============================================");
		
		//variavel referente a opção escolhida
		int operacao = teclado.nextInt();
		
		switch(operacao) {
		case 1:
			cadastrarCliente();
			break;
		case 2:
			listarCliente();
			break;
		case 3:
			consultarCliente();
			break;
		case 4:
		removerCliente();
			break;
		case 5:
			cirarContaAssociarCliente();
			break;
		case 6:
			listarConta();
			break;
		case 7:
			removerConta();
			break;
		case 8:
			realizarDeposito();
			break;
		case 9:
			realizarSaque();
			break;
		case 10:
			ConsultarSaldo();
			System.exit(0);
		default:
			System.out.println("Opção inválida!");
	
		}//Fim do Switch
		
	}//Fim do menu
	
	public static void cadastrarCliente() {
		
	}

}
