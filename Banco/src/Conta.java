
public class Conta {
	public int numeroDaConta;
	protected String tipo;
	private String nomeDono;
	private float saldo;
	private boolean status;
	
	//Teste 20
	//Teste 30
	//Teste 40

	
	public void estadoAtual() {
		System.out.println("===========================");
		System.out.println("Conta: " + this.getNumeroDaConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getNomeDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.isStatus());
		System.out.println("===========================");
	}
	
	public void abrirConta(String tipoDaConta) {
		this.setTipo(tipoDaConta);
		this.setStatus(true);
		if (tipoDaConta == "CC") {
			this.setSaldo(50);
		} else if(tipoDaConta == "CP") {
				this.setSaldo(150);
			}
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Retire todo o dinheiro da conta!");
		} else if (this.getSaldo() < 0) {
					System.out.println("Conta em débito!");
			} else {
					this.setStatus(false);
					System.out.println("Conta fechada com sucesso!");
				}
	}
	
	public void depositar(float valor) {
		if (this.isStatus()) {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Depósito realizado com sucesso!");
		}
		else
			System.out.println("Impossível depositar em uma conta fechada.");
	}
	
	public void sacar(float valor) {
		if (this.isStatus()) {
			if (this.getSaldo() > valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque realizado na conta de " + this.getNomeDono());
			}
			else
				System.out.println("Saldo Insuficiente para saque!");
		}
		else
			System.out.println("Impossível sacar de uma conta fechada.");
	}
	
	public void mensalidade() {
		int valor = 0;
		if(this.getTipo() == "CC") {
			valor = 12;
		}
		else
			if(this.getTipo() == "CP") {
				valor = 20;
			}
		if(this.isStatus()) {
			if(this.getSaldo() > valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Mensalidade paga com sucesso por " + this.getNomeDono());
			}
		}
		else
			System.out.println("Impossível pagar de uma conta fechada.");
	}
	
	//Construtor
	public Conta() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	//double saldo, boolean status
	
	//Número da Conta
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	
	//Tipo
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//Nome do Dono
	public String getNomeDono() {
		return nomeDono;
	}
	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}
	
	//Saldo
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	//Status
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
