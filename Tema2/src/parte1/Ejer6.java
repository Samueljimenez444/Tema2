package parte1;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		// Creamos la varible numa que servira como el termino a de nuestra ecuacion
		float numa;
		// Creamos la varible numa que servira como el termino b de nuestra ecuacion
		float numb;
		// Creamos la varible numa que servira como el termino c de nuestra ecuacion
		float numc;
		// Creamos el comparador que servira para decidir si la ecuacion tiene una
		// solucion dentro de R o no
		float comparador;

		// Creamos la variable resultxx que servira para calcular el resultado de la
		// ecuacion con signo +
		float resultxx;
		// Creamos la variable resultxx que servira para calcular el resultado de la
		// ecuacion con signo -
		float resultxx2;
		// Creacion Scanner
		Scanner lectura = new Scanner(System.in);
		/* Definimos el valor de las variables en base al input del usuario */
		numa = lectura.nextInt();
		numb = lectura.nextInt();
		numc = lectura.nextInt();
		//
		float resultx=-numb/numc;
		// Aqui se realizara la operacion matematica que se encuentra dentro de la raiz
		// cuadrada
		comparador = (float) (((Math.sqrt((numb) * (numb)) + (-4 * numa * numc))) / (2 * numa));
		/*
		 * Aqui se realizan los calculos para conocer los dos resultados de la ecuacion
		 * de 2º grado
		 */
		resultxx = (float) (-numb + (Math.sqrt((numb) * (numb)) + (-4 * numa * numc))) / (2 * numa);
		resultxx2 = (float) (-numb - (Math.sqrt((numb) * (numb)) + (-4 * numa * numc))) / (2 * numa);
		/*
		 * Creamos condicional donde si el resultado dentro de la raiz es negativo
		 * (imposible dentro de las matematicas basadas en los reales "R" el resultado
		 * sera anulado y no sera calculable dentro en "R", si el resultado de dentro no
		 * es negativo se realizaran los calculos y se printeara el resultado
		 */
		if(numa==0)
		System.out.println(resultx);
		if (comparador < -1)
			System.out.println("El resultado no existe entre los numeros reales");
		else
			System.out.println("El resultado es " + resultxx2 + " y " + resultxx);
		// Cierre Scanner
		lectura.close();
	}

}
