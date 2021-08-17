
public class Main {

	public static void main(String[] args) {
		Conta p1 = new Conta();
		p1.setNumeroDaConta(00001);
		p1.setNomeDono("Marcos");
		p1.abrirConta("CC");
		
		Conta p2 = new Conta();
		p2.setNumeroDaConta(00002);
		p2.setNomeDono("Julia");
		p2.abrirConta("CP");
		
		p1.depositar(100);
		p2.depositar(500);
		p2.sacar(100);
		
		p2.sacar(550);
		p2.fecharConta();
		
		p1.estadoAtual();
		p2.estadoAtual();
	}

}
