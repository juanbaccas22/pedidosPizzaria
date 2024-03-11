package codigo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import objetos.pizza;

public class principal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String tipo, sabor, tamanho;
		String aprov;
		List<String> geral = new ArrayList();
		double preco = 0;
		double valor;

		System.out.println("Ola seja bem vindo ao cardapio !!!");
		System.out.println("ESTE É UM PEQUENO PROJETO DE JUAN !!!");
		System.out.println();
		System.out.println("GOSTARIA DE PEDIR PIZZA OU ESFIRA ?");
		tipo = sc.next();

		if (tipo.equals("pizza")) {

			
			do {

				System.out.println("pedir pizza salgada ou doce ?");
				tipo = sc.nextLine();
				tipo = sc.nextLine();
				System.out.println("informe o sabor desejado :");
				sabor = sc.nextLine();
				System.out.println("informe o tamanho desejado :");
				tamanho = sc.nextLine();
				
				if(tamanho.equals("grande")) {
					valor = 59.90;
					preco = preco + valor;
				}
				else if(tamanho.equals("media")) {
					valor = 49.90;
					preco = preco + valor;
				}
				else if(tamanho.equals("pequena")) {
					valor = 39.90;
					preco = preco + valor;
				}

				geral.add("[" + tipo + "," + sabor + "," + tamanho + "]");
				


				System.out.println("deseja pedir outra ?");
				aprov = sc.next();
			} while (aprov.equals("sim"));

		}

		else {
			
			do {
				System.out.println("informe o sabor desejado :");
				sabor = sc.nextLine();
				sabor = sc.nextLine();
				// System.out.println("sabor = [" + sabor + "]");

				geral.add(sabor);
				preco = preco + 4.99;

				System.out.println("deseja pedir outra ?");
				aprov = sc.next();
			} while (aprov.equals("sim"));
			
		}
		System.out.println("pedido feito : " +geral);
		System.out.println("preço total : " + preco);
		System.out.println("obrigado por realizar o pedido em nossa pizzaria ");

		sc.close();
	}

}
