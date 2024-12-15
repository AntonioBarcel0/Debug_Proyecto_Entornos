package fizzbuzz;

public class FizzBuzz {
//	Creamos el método principal para ejecutar el programa
	public static void main(String []args) {
     // Se crea un bucle para iterar del 1 al 100
		for(int i = 1; i <= 100; i++) {
			// Si el número es divisible por 3 y por 5 se imprime "FizzBuzz!!"
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz!!");
			// Si el número es divisible solo por 3 se imprime "Fizz!!"
			}else if  (i % 3 == 0) {
				System.out.println("Fizz!!");
				// Si el número es divisible solo por 5 se imprime "Buzz!!"
			}else if (i % 5 == 0) {
				System.out.println("Buzz!!");
				// Si el número no es divisible por 3 ni por 5, imprime el número tal cual
			}else {
				System.out.println(i);
			}
		}
	}
}
		
	
