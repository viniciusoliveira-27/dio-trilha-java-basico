package contaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner v = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Por favor, digite o numero da Conta");
		int numeroConta = v.nextInt();
		
		System.out.println("Agora digite a sua Agencia");
		String agencia = v.next();
		
		System.out.println("Por favor, digite agora seu Nome completo!");
		v.nextLine();
		String nome = v.nextLine();
		
		System.out.println("Por fim o saldo em conta");
		double saldo = v.nextDouble();
		
		System.out.println("Ola " + nome+", obrigado por criar uma conta em nosso banco, sua agencia:  "+agencia+", conta: "+ numeroConta+" e seu saldo de "+saldo+" ja esta disponivel para saque");
	
		
		v.close();
	}

}
