
public class Main {

	public static void main(String[] args) {
		Cliente client1 = new Cliente();
		client1.setNome("client1");
		
		Conta cc = new ContaCorrente(client1);
		Conta poupanca = new ContaPoupanca(client1);

		cc.depositar(300);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
