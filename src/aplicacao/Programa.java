package aplicacao;

import java.io.File;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o caminho do arquivo: ");
		String sCaminho = sc.nextLine();
		
		File caminho = new File(sCaminho);
		
		System.out.println("Pega Arquivo   : " + caminho.getName()); // pega so arquivos
		System.out.println("Pega Diretorios: " + caminho.getParent()); // pega so pastas" Diretorios "
		System.out.println("Pega Tudo      : " + caminho.getPath()); // pega todo o Caminho "
		sc.close();
		
	}

}
