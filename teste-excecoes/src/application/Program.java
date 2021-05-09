package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Account;


public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); //os numeros serão separados por pontos
		
		Scanner read = new Scanner(System.in);
		
		Account acc = new Account();
		
		System.out.println("-----Informe os dados da conta ---------------");
		System.out.println("Numero: ");
		acc.setNumber(read.nextInt());
		
		System.out.println("Titular: ");
		read.nextLine();
		acc.setHolder(read.nextLine());
		
		System.out.println("Saldo Inicial: ");
		acc.setBalance(read.nextDouble());
		
		System.out.println("Limite de saque: ");
		acc.setWithdrawLimit(read.nextDouble());
		
		
		System.out.println("Informe o valor de saque: ");
		acc.withdraw(read.nextDouble());
		
		System.out.printf("Saldo atual: R$ %.2f%n", acc.getBalance());
	}

}                       
