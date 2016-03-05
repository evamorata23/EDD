package fp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.GregorianCalendar;

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
		int length=0;
		int divisor[];
		if(n>0 && n<=20){
			for(int i=1; i<=n; i++)
				 if(n%i==0)
				 length++;
				 divisor = new int[length];
			for(int i=n,j=0; i>0; i--){
				if(n%i==0){
					divisor[j]=i;
					j++;
				}
			}
		return divisor;
		}else
			return divisor=null;
	}


	/*
	 * Toma como parámetros una cadena de caracteres y devuelve cierto si la cadena resulta ser un palíndromo
	 */
	public static boolean checkIsPalindrome(String cadena) {
		if(cadena==null){
			return false;
		}
		cadena = cadena.toLowerCase();
		String string = "";
		String tildes = "áéíóúàèìòùü";
		String sintildes = "aeiouaeiouu";
		for(int i = 0; i < cadena.length(); i++){
			if (Character.isLetter(cadena.charAt(i))) {
				if (tildes.indexOf(cadena.charAt(i)) != -1)
					string += sintildes.charAt(tildes.indexOf(cadena.charAt(i)));
				else
					string += cadena.charAt(i);
			}
		}
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - 1 - i));
			return false;
		}
		return true;
	}

	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	public static String speakToMe(int n) {
		String[] decenas = {"Cero","Diez","Veinte","Treinta","Cuarenta","Cincuenta","Sesenta","Setenta","Ochenta","Noventa"};
		String[] unidades = {"","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","Diez","Once","Doce","Trece","Catorce","Quince","Dieciseis","Diecisiete","Dieciocho","Diecinueve"};
		String nEscrito="";
		if(n==0){
			nEscrito=decenas[0];
			return nEscrito;
		}else if(n<20){
			nEscrito = unidades[n];
			return nEscrito;
		}else if((n%10)==0){
			nEscrito=decenas[n/10];
			return nEscrito;
		}else{
			nEscrito=decenas[n/10]+" y "+unidades[n%10];
			return nEscrito;
		}

	}

	/*
	 * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
	 * dd-MM-yyyy
	 */
	public static boolean isLeapYear(String date) {
		if (isValidDate(date)){
			int year=Integer.valueOf(date.substring(date.length()-4, date.length()));
			return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
		}else{
			return false;
		}

	}

	/*
	 * este metodo devuelve cierto si la fecha es válida
	 */
	public static boolean isValidDate(String date) {
		try{
			int year = Integer.valueOf(date.substring(6,10));
			int month = Integer.valueOf(date.substring(3,5));
			int day = Integer.valueOf(date.substring(0,2));
			if(year==0 || month==0 || day==0 || month > 12 || day > 31){
				return false;
			}
			Calendar calendar = new GregorianCalendar(year,month,day);
			return true;
		}catch(Exception e){
			return false;
		}
	}
}
