package Application;

import java.util.Scanner;

import pilhagem.Pilha_dinanmica;

public class Main {

	public static void main(String[] args) {
		
		//172 / 2 % 0 = 86 / 2 % 0 = 43 / 2 % 1 = 21 % 2 % 1 = 10 / 2 % 0 = 5 / 2 % 1 = 2 / 2 % 0 = 1 / 2 % 1 
				//int numero = 172;
				Scanner sc = new Scanner(System.in);
				System.out.println("Digite o n�mero para ser transformado em bin�rio: ");
				int numero = sc.nextInt();
				
				Pilha_dinanmica p = new Pilha_dinanmica();
				
				int resto;
				
				//empilharar resto
				while(numero != 0) {
					resto = numero % 2;
					p.push(resto);
					numero = numero / 2;
				}
				// exibi��o do resto
				
				while(!p.isEmpty()) {
					resto = p.pop();
					System.out.print(resto+" ");
				}			
	}

}


