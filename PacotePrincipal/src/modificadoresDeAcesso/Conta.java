package modificadoresDeAcesso;

/*
 * Aplicar os métodos Getters and Setters
 * 
 * Getter
 * - É um método publico que serve para consultar dados
 * - A nomenclatura desses métodos é getNome_do_atributo()
 */
public class Conta {

    private int numero;
	private float saldo;
	private float limite;
	private Cliente cliente;

	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		this.setNumero(numero);
		this.saldo = saldo;
		this.limite = limite;
		this.setCliente(cliente);
	}

	public void sacar(float valor) {
		if (valor <= this.saldo) {
			this.saldo = this.saldo - valor;
			System.out.println("Saque Realizado com Sucesso");
		} else if (valor <= (this.saldo + this.limite)) {
			//calculando o val ret excedente do saque;
			//100 - 200 = -100;
			float val_ret = this.saldo - valor;
			if(val_ret < 0) {
				this.saldo = 0;
			}
			//val_ret = this.limite - val_ret
			val_ret = this.limite + val_ret;
			this.limite = val_ret;		} else {
			System.out.println("Saldo Insuficiente");
		}
	}

	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}

	public float getSaldo() {
		return this.saldo + this.limite;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
