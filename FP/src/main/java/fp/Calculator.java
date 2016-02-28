package fp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.*;

public class Calculator {


	/*
     * este metodo devuelve el Class del object que le pasamos
     */
	public static Class classTypeOf(Object x) {
		//throw  new NotImplementedException();
		return x.getClass();
	}


	/*
     * devuelve una lista con los n numeros de la serie de fibonacci.
     */
	public static List<Integer> fibonacci(int n) {
		List<Integer> lista = new ArrayList<Integer>();
		if(n<1)
			return lista;
		lista.add(1);
		if(n==1)
			return lista;
		lista.add(1);
		for(int i=2; i<n; i++){
			lista.add(lista.get(i-2) + lista.get(i-1));
		}
		return lista;
	}

	/*
	 * Escribir todos los números del number al 0 de step en step.
	 */
	public static int[] stepThisNumber(int number, int step) {
		int length=0;
		int n=number;
		if(number>0 && step>0){
			length=(number-1)/step;
		int advance[] = new int[length];
			for(int i=0; i<advance.length; i++){
				number-=step;
				advance[i]=number;
			}
			return advance;
		}else
			return new int[0];
	}



	/*
	 * Módulo al que se le pasa un número entero del 0 al 20 y devuelve los
	 * divisores que tiene.
	 */
	public static int[] divisors(int n) {
		throw  new NotImplementedException();
	}

	/*
	 * Toma como parámetros una cadena de caracteres y devuelve cierto si la cadena resulta ser un palíndromo
	 */
	public static boolean checkIsPalindrome(String cadena) {
		throw  new NotImplementedException();
	}

	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	public static String speakToMe(int n) {
		throw  new NotImplementedException();
	}

	/*
	 * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
	 * dd-MM-yyyy
	 */
	public static boolean isLeapYear(String fecha) {
		throw  new NotImplementedException();
	}

	/*
	 * este metodo devuelve cierto si la fecha es válida
	 */
	public static boolean isValidDate(String date) {
		throw  new NotImplementedException();
	}
}
