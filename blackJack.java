import java.util.Scanner;
class blackJack{
	public static void main(String args[]){
		System.out.println("Bienvenido al Casino CMD");
		String let;
		double q=0;
		double x = Math.floor(Math.random()*(13)+1);
		double y = Math.floor(Math.random()*(13)+1);
		double z = Math.floor(Math.random()*(13)+1);
		System.out.println("[x]" + "[x]");
		System.out.println("Desea otra carta? (Y/N)");
		Scanner res = new Scanner(System.in);
		let=res.nextLine();
		if(let.equalsIgnoreCase("y")){
		q=x+y+z;
		System.out.println("[x]" + "[x]" + "[x]");
		System.out.println(z);}
		else if(let.equalsIgnoreCase("n")){
		q=x+y;
		System.out.println("[x]" + "[x]");
		System.out.println(q);
		}
		if (q!=21){
		System.out.println("Usted ha perdido");}
		else if (q==21){
		System.out.println("Usted ha ganado");}	



						}
		}

