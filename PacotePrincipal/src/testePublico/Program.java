package testePublico;
//Public
/*
 * Público -> pode ser utilizado em todo o projeto
 */
import modificadoresDeAcesso.Cliente;

public class Program {

	public static void main(String[] args) {
		Cliente cli = new Cliente("Gustavo Luiz Chiesa", "Rua Ivo Testoni - 164");
		
		System.out.println("Nome : " + cli.nome);
		System.out.println("Nome : " + cli.endereco);

	}

}
