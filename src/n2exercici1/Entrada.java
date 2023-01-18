package n2exercici1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Entrada {
	
		Scanner newObj= new Scanner(System.in);
		
		
//Mètodes a implantar capturant l’excepció de la classe InputMismatchException:
		
	public static byte llegirByte(String missatge) {
		try {
		      int[] myNumbers = {1, 2, 3};
		      System.out.println(myNumbers[10]);
		    } catch (Exception e) {
		      System.out.println("Something went wrong.");
		    };
		return;
	}	
	
	public static int llegirInt(String missatge) {
		;
		return; 
	}
	
	public static float llegirFloat(String missatge){
		;
		return; 
	}
	
	public static double llegirDouble(String missatge){
		;
		return; 
	}
	
//Mètodes a implantar capturant l’excepció de la classe Exception:
	
	public static char llegirChar(String missatge){
		;
		return; 
	};
	
	public static String llegirString(String missatge){
		;
		return; 
	};
	
	public static boolean llegirSiNo(String missatge){
		;
		return; 
	};
}
