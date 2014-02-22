class numPrimo{

	public static void main(String args[]){
		System.out.println ("Este programita les muestra los numeros primos desde 1 hasta el valor que ingresaron.");
		int i=0, j=0, div=0;
		int numero=0;
		numero= Integer.parseInt(args[0].toString());
 		for (i=1;i<numero;i++){ 
			div=0; 
 		for (j=1;j<numero;j++){ 
		 	if (i%j==0)
 			div++;
 				      }
 			if (div ==2)
		System.out.println (i + " es un numero primo" );
	 		              }
				              }

	   }