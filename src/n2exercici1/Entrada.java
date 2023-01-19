package n2exercici1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Entrada {
	
		static Scanner myObj= new Scanner(System.in);
		
		
//Mètodes a implantar capturant l’excepció de la classe InputMismatchException:
		
	public static byte llegirByte(String missatge) {
	
		System.out.println(missatge);
		
		boolean continua = true;
		byte myEnteredByte=0;
		
		do {
			try {
				myEnteredByte = myObj.nextByte();
				System.out.println("un byte amb l’edat de l’usuari/ària: "+myEnteredByte);
				continua=false;
				
		    } catch (InputMismatchException e) {
		      System.out.println("La teva resposta no és un byte! Usuari/ària torna a introduir l'edat!");
		    	}
				myObj.nextLine();
			} while (continua);
		
		return myEnteredByte;
	}	
	
	public static int llegirInt(String missatge) {
		
		System.out.println(missatge);
		
		boolean continua=true;
		int myEnteredInt=0;
		
			do{ 
				try{ 
					myEnteredInt= myObj.nextInt();
					System.out.println("un enter amb l’edat de l’usuari/ària: "+myEnteredInt);
					continua= false;
				} catch(InputMismatchException e) {
					System.out.println("La teva resposta no és un int! Usuari/ària torna a introduir l'edat!");;
					};
					myObj.nextLine();
			} while(continua);
				
		return myEnteredInt; 
	}
	
	public static float llegirFloat(String missatge){
		
		System.out.println(missatge);
		
		boolean continua=true;
		float myEnteredFloat=0;
		
			do{ 
				try{ 
					myEnteredFloat= myObj.nextFloat();
					System.out.println("un enter amb l’edat de l’usuari/ària: "+myEnteredFloat);
					continua= false;
				} catch(InputMismatchException e) {
					System.out.println("La teva resposta no és un Float! Usuari/ària torna a introduir l'edat!");;
					};
					myObj.nextLine();
			} while(continua);
				
		return myEnteredFloat;
	}
	
	public static double llegirDouble(String missatge){
		
		System.out.println(missatge);
		
		boolean continua=true;
		double myEnteredDouble=0;
		
			do{ 
				try{ 
					myEnteredDouble= myObj.nextDouble();
					System.out.println("un enter amb l’edat de l’usuari/ària: "+myEnteredDouble);
					continua= false;
				} catch(InputMismatchException e) {
					System.out.println("La teva resposta no és un Float! Usuari/ària torna a introduir l'edat!");;
					};
					myObj.nextLine();
			} while(continua);
				
		return myEnteredDouble;
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
