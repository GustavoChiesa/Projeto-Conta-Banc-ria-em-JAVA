import java.util.Scanner;

import modificadoresDeAcesso.Cliente;
import modificadoresDeAcesso.Conta;
/*
 * Gerando as executaveis jar
 * 
 * JAR - Java Archive
 * Archive - Arquivo Compatado Java
 * 
 * zip/rar 
 */
public class Principal {

	static Cliente cliente = new Cliente("Gustavo Luiz Chiesa", "Rua Ivo Testoni 164");
	static Conta conta = new Conta(1, 200, 300, cliente);
	static Scanner sc = new Scanner(System.in);

	public static void depositar() {
		System.out.println("------- depósito ------");
		System.out.println("Informe um valor para depósito");
		float valor = sc.nextFloat();
		if (valor > 0) {
			conta.depositar(valor);
			System.out.println("Depósito efetuado com sucesso");
		} else {
			System.out.println("O valor precisa ser maior que zero");
		}
	}

	public static void sacar() {
		System.out.println("------- sacar ------");
		System.out.println("Informe um valor para saque");
		float valor = sc.nextFloat();
		if (valor > 0) {
			conta.sacar(valor);
		} else {
			System.out.println("O Valor precisa ser positivo");
		}
	}

	public static void consultar() {
		System.out.println("Seu saldo é " + conta.getSaldo());
	}

	public static void main(String[] args) {
		int opcao = 0;
		System.out.println("Bem Vindo ao Banco Feito em Programa JAVA");

		do {
			System.out.println("Selecione uma opção Abaixo");
			System.out.println("1 - Depositar");
			System.out.println("2 - Sacar");
			System.out.println("3- Consultar Saldo");
			System.out.println("0 - Sair");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				depositar();
				break;
			case 2:
				sacar();
				break;
			case 3:
				consultar();
				break;
			case 0:
				break;

			default:
				System.out.println("Opção Inválida");
				break;
			}
		} while (opcao > 0);
		sc.close();

	}
}
