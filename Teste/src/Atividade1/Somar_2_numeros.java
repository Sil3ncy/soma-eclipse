package Atividade1;

import java.util.Scanner;

public class Somar_2_numeros {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		System.out.println("insira o primeiro numero");
		x = sc.nextInt();
		
		System.out.println("insira o segundo numero");
		sc = new Scanner(System.in);
		y = sc.nextInt();
		
		System.out.println("a soma dos numeros e:" + (x+y));
	}

}
