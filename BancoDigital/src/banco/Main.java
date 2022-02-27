package banco;

public class Main {

	public static void main(String[] args) {
		Cliente pessoa = new Cliente();
		pessoa.setNome("pessoa");
		
		Conta cc = new ContaCorrente(pessoa);
		Conta poupanca = new ContaPoupanca(pessoa);

		cc.depositar(1000);
		cc.transferir(200, poupanca);
		
		cc.imprimirInfosComuns();
		poupanca.imprimirInfosComuns();

	}

}
