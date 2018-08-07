package aplicacao;

import java.io.File;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva com o nome da pasta: ");
		String sCaminho = sc.nextLine();
		
		File caminho = new File(sCaminho);
		File [] pastas = caminho.listFiles(File::isDirectory);
		System.out.println("Pastas: ");
		for (File pasta : pastas) {
			System.out.println(pasta);
		}
		
		File [] arquivos = caminho.listFiles(File::isFile);
		System.out.println("Arquivos: ");
		for (File arquivo : arquivos) {
			System.out.println(arquivo);
		}
		
		boolean bSucesso = new File(sCaminho + "\\PastaCriada").mkdir();
		System.out.println("Criado com sucesso:" + bSucesso);

		sc.close();
		
	}

}
