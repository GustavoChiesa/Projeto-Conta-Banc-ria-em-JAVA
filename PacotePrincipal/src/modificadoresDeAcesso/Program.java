package modificadoresDeAcesso;
//Encapsulamento 
//Cápsula
//Fechar algo privar algo
public class Program {

	public static void main(String[] args) {
		Cliente joao = new Cliente("João Hotequil", "Rua Pedro Bonifácio Sabel - 165");
		Cliente zabel = new Cliente("Mateus Zabel", "Rua Pedro Simon - 1855");
		
		Conta conta_joao = new Conta(1, 100f, 200f, joao);
		Conta conta_zabel = new Conta(2, 300f, 500f, zabel);
		
		System.out.println("Saldo do João (Antes do Saque): " + conta_joao.getSaldo());
		System.out.println("Saldo do Zabel : " + conta_zabel.getSaldo());
		
		conta_joao.sacar(100);
		System.out.println("Saldo do João (Depois do Saque): " + conta_joao.getSaldo());
		
	}

}
