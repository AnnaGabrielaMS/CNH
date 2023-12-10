import java.util.Scanner;

public class cnh {
	
	public static void habilitacao(int idade) {
		if (idade >= 18) {
			System.out.println("=".repeat(74));
			System.out.printf("Você tem %d anos e está apto a tirar a sua CNH!%n", idade);
			System.out.println("=".repeat(74));
		}
		else {
			System.out.println("=".repeat(74));
			System.out.printf("Você só tem %d anos e não está apto a tirar a sua CNH! Ainda faltam %d anos.%n", idade, 18 - idade);
			System.out.println("=".repeat(74));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=".repeat(33) + " DETRAN " + "=".repeat(33));
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		habilitacao(idade);
		System.out.println("FIM DO PROGRAMA!");
		
		sc.close();
		
	
	}

}
