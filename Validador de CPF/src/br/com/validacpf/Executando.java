package br.com.validacpf;

import java.util.Scanner;
import br.com.validacpf.ValidaCPFF;

public class Executando {

	public static void main(String[] args) {
		Scanner tecl = new Scanner(System.in);

		String CPF;

		System.out.printf("Informe um CPF: ");
		CPF = tecl.next();

		while (CPF.length() != 11) {
			System.out.printf("\nO CPF precisa ter 11 dígitos!\n\n");
			System.out.printf("Informe novamente um CPF: ");
			CPF = tecl.next();
		}

		System.out.printf("\n\nResultado: ");
		System.out.printf("%s", ValidaCPFF.printCPF(CPF));
		if (ValidaCPFF.ehCPF(CPF) == true)
			System.out.printf(" - O CPF digitado é válido!\n");

		else
			System.out.printf(" - O CPF digitado é inválido!\n");

		tecl.close();
	}
}
