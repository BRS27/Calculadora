package projetoCalculadora;

import java.util.Scanner;

public class aplicacao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		
		System.out.println("Calculadora simples");
		System.out.println(" ----------------- ");
		
		while (true) {
		
		System.out.println("Escolha uma operação");
		System.out.println(" 1 - Adição (+)");
		System.out.println(" 2 - subtração (-)");
		System.out.println(" 3 - multiplicação (x)");
		System.out.println(" 4 - divisão (/)");
		
		System.out.println(" Digite o numero da operação");
		if (scanner.hasNextInt()) {
			opcao = scanner.nextInt();
			
			if (opcao >= 1 && opcao <= 4) {
				break;
			}
		} else {
			
			scanner.next();
		}
			System.out.println(" Erro: Digite um número válido ( 1, 2, 3 ou 4)");
			
		}
		
		
		System.out.println(" Digite o primeiro numero");
		
		double num1 = scanner.nextDouble();
		
		System.out.println(" Digite o segundo número");
		
		double num2 = scanner.nextDouble ();
		
		double resultado = 0;
		
		
		switch (opcao) {
		
		case 1:
			resultado = num1 + num2;
			System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);
			break;
			
		case 2:
			resultado = num1 - num2;
			System.out.println("Resultado: " + num1 + " - " + num2 + " = " + resultado);
			break;
			
		case 3:
			resultado = num1 * num2;
			System.out.println(" Resultado: " + num1 + " x " + num2 + " = " + resultado);
			break;
		
		case 4:
			
			if (num2 != 0 ) {
			resultado = num1 / num2;
			System.out.println(" Resultado:" + num1 + " / " + num2 + " = " + resultado);
			}
			else { 
				System.out.println(" Não é possivel dividir por zero");
			}
			
			break;
			
		default:
			System.out.println(" Opção invalida! por favor escolha uma opção de 1 a 4 ");
		}
		
		scanner.close();
	}
	
	}

		

		

	
			