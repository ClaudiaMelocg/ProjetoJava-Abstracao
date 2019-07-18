package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Circulo;
import entidades.Forma;
import entidades.Retangulo;
import entidades.enums.Cor;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o numero de formas: ");
		int numero = teclado.nextInt();
		
		List<Forma> list = new ArrayList<>();
		
		
		for(int i = 1; i <= numero; i++) {
			System.out.println("Forma # " + i );
			System.out.print("Retangulo ou Circulo ( r / c ) : ");
			char ch = teclado.next().charAt(0);
			System.out.println("Cor (PRETO / AZUL / VERMELHO ): ");
			Cor cor = Cor.valueOf(teclado.next());
			
			if(ch == 'r') {
				System.out.println("Largura: ");
				double largura = teclado.nextDouble();
				System.out.println("Altura: ");
				double altura = teclado.nextDouble();
				Forma forma = new Retangulo(cor, largura, altura);
				list.add(forma);
			}
			else {
				System.out.println("Raio: ");
				double raio = teclado.nextDouble();
				Forma forma = new Circulo(cor, raio);
				list.add(forma);
				
			}
		}
		
		
		System.out.println();
		System.out.println("Forma das Areas: ");
		
		for(Forma forma : list ) {
			System.out.println(String.format("%.2f", forma.area()));
		}
		
		
		
		teclado.close();

	}

}
