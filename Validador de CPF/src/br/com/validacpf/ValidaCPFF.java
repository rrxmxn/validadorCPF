package br.com.validacpf;

public class ValidaCPFF {

	public static boolean ehCPF(String CPF) {
		if (CPF.length() != 11)
			return (false);

		char nume10, nume11;
		int test, i, r, num, calc;

		// Cálculo do primeiro verificador
		test = 0;
		calc = 10;
		for (i = 0; i < 9; i++) {
			// Converte em um número
			num = (int) (CPF.charAt(i) - 48);
			test = test + (num * calc);
			calc = calc - 1;
		}

		r = 11 - (test % 11);
		if ((r == 10) || (r == 11))
			nume10 = '0';
		else
			nume10 = (char) (r + 48); // Converte em caractere num

		// Cálculo do segundo verificador
		test = 0;
		calc = 11;
		for (i = 0; i < 10; i++) {
			num = (int) (CPF.charAt(i) - 48);
			test = test + (num * calc);
			calc = calc - 1;
		}

		r = 11 - (test % 11);
		if ((r == 10) || (r == 11))
			nume11 = '0';
		else
			nume11 = (char) (r + 48);

		// Verifica se o que foi calculado bate com o informado
		if ((nume10 == CPF.charAt(9)) && (nume11 == CPF.charAt(10)))
			return (true);
		else
			return (false);
	}

	public static String printCPF(String CPF) {
		return (CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." + CPF.substring(6, 9) + "-"
				+ CPF.substring(9, 11));
	}
}