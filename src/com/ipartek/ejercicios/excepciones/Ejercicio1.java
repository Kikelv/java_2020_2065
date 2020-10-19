package com.ipartek.ejercicios.excepciones;

import java.util.Scanner;

/**
 * Implemente un programa que lea un n�mero �a� y otro n�mero �b� y luego
 * calcule �a/b�. <br>
 * Pruebe a introducir b=0 y ver que hace el programa con la divisi�n por cero.
 * <br>
 * Pruebe a introducir b=�Carlos� para ver c�mo se comporta el programa.<br>
 * A�ada excepciones para recoger estas excepciones y avisar del problema al
 * usuario
 *
 * @author ur00
 * @version 1.0
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;

		try {

			System.out.println("Dime el 1� numero entero:");
			a = Integer.parseInt(sc.nextLine());

			System.out.println("Dime el 2� numero entero:");
			b = Integer.parseInt(sc.nextLine());

			System.out.println("Resultado a/b=" + (a / b));

		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir entre cero");

		} catch (NumberFormatException e) {
			System.out.println("No es un numero");

		} catch (Exception e) { // esta siempre es la ultima de todas
			System.out.println("Hemos tenido un problema");
		}

		sc.close();

	}

}
