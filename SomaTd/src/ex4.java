import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		int soma = 0;
		int a = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero positivo para ser somado ou negativo para sair:");
			a = entrada.nextInt();
			
			if(a >= 0) {
				soma += a;
			}
			
		} while (a >= 0);
		
		System.out.printf("A soma é: %d", soma);
	}
}