import java.util.Scanner;
class Adivinar{
	public static void main(String args[]){
		double x = Math.floor(Math.random()*(100)+1);
		System.out.println(x);
		double num=0;		

			while((num!=x)){
			
				Scanner numero = new Scanner(System.in);
				System.out.println("Ingrese numero que cree correcto");
				num=numero.nextDouble();
				if (num>x){
					System.out.println("el numero ingresado es mayor, intenta de nuevo");}
				else if(num<x){
					System.out.println("el numero ingresado es menor intente de nuevo");}	
				   }
			if(num==x){
			System.out.println("correcto, ha ganado");
				  }
			
			
			








						}


		}