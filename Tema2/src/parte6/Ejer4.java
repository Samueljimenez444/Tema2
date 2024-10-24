package parte6;

public class Ejer4 {

	public static void main(String[] args) {
		//Creamos la variable entera suma donde iremos sumando los distintos numeros impares
		int suma=0;
		//Creamos un bucle for donde inicializamos la variable i en 1, el bucle se producira mientras i<=20 e iremos sumando a i una unidad por cada vez que se porduzca el bucle
for(int i=1;i<=20;i++) {
	//Si el numero/2 tiene un resto distinto a 0 sumaremos el valor de i a suma y lo iremos almacenando para calcular el valor total de i
	if(i%2!=0) {
		suma+=i;
	}
}
//Print del resultado
	System.out.println("La suma de los 10 primeros numeros enteros es " +suma);
	}

}
