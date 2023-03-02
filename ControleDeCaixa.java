package curso_progamacao;

import java.util.Scanner;

public class ControleDeCaixa {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double c, n;
		
		System.out.println("QUAL O CÓDIGO DO PRODUTO?");
		c= entrada.nextDouble();
		System.out.println("QUANTOS VAI LEVAR AI?");
		n= entrada.nextInt();
		if(c==1) {
			System.out.println("VALOR A SER PAGO: " + 4.00*n);
		}
		else if(c==2){
			System.out.println("VALOR A SER PAGO: " + 4.50*n);
		}	
		else if(c==3) {
			System.out.println("VALOR A SER PAGO: " + 5.00*n);
		}
		else if(c==4) {
			System.out.println("VALOR A SER PAGO: " + 2.00*n);
		}
		else if(c==5) {
			System.out.println("VALOR A SER PAGO: " + 1.50*n);
		}
		
		entrada.close();	

		
	}
}
