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
				System.out.println("un byte amb l’edat de la tortuga Solitario George!: "+myEnteredByte);
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
					System.out.println("un enter amb l’edat de la tortuga Solitario George!: "+myEnteredInt);
					continua= false;
				} catch(InputMismatchException e) {
					System.out.println("La teva resposta no és un enter! Usuari/ària torna a introduir l'edat!");;
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
					System.out.println("un Float amb l’edat de la tortuga Solitario George!: "+myEnteredFloat);
					continua= false;
				} catch(InputMismatchException e) {
					System.out.println("La teva resposta no és un Floatant! Usuari/ària torna a introduir l'edat!");;
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
					System.out.println("un Double amb l’edat de la tortuga Solitario George!: "+myEnteredDouble);
					continua= false;
				} catch(InputMismatchException e) {
					System.out.println("La teva resposta no és un double! Usuari/ària torna a introduir l'edat!");
					};
					myObj.nextLine();
			} while(continua);
				
		return myEnteredDouble;
	}
	
//Mètodes a implantar capturant l’excepció de la classe Exception:
	
	public static char llegirChar(String missatge){
		System.out.println(missatge);
		boolean continua= true;
		char myEnteredChar='a';
		try { 
			do {
				myEnteredChar= myObj.next().charAt(0);
				System.out.println("Primera lletra del teu nom es: "+myEnteredChar);
				continua= false;
				} while(continua);
			} catch(InputMismatchException e) {
				System.out.println("La teva resposta no és un character! Usuari/ària torna a introduir el teu nom!");
				}
				catch (Exception e) {
					;System.out.println(" hi ha un error de typo "+e.getMessage());;
					}
		
			
		return myEnteredChar; 
	};
	
	public static String llegirString(String missatge){
		
		System.out.println(missatge);
		
		boolean cotinua= true;
		String myString = "nombre"; 
		
		do {
			try {
				myString= myObj.nextLine();
				System.out.println("El vostre nom d'usuari és!: " +myString);
				cotinua= false;
				;
				}catch(InputMismatchException e) {
					System.out.println("La teva resposta no és un String! Usuari/ària torna a introduir el teu nom!");
					;}
				catch(Exception ex) {
					System.out.println(" hi ha un error de typo! " +ex.getMessage());;
					}
			}while(cotinua);
		
		return myString; 
	};
	
	public static boolean llegirSiNo(String missatge){
		
		System.out.println(missatge);
		
		boolean cotinua= false;
		boolean mySiNo= false; 
		
		do {
			try {
				char myFirstCaracter= myObj.nextLine().charAt(0);
				mySiNo = examinaLeguirSiNoException(myFirstCaracter); //retorna true/false y lanza la exception
				System.out.println("la teva resposta és (true/false): " + mySiNo);
				cotinua= true;
				;
				}
				catch(LeguirSiNoException eSiNO) {
					System.out.println(eSiNO.getMessage());
					}
				catch(InputMismatchException e) {
					System.out.println("La teva resposta no és un Boolean! Usuari/ària torna a introduir (s/n) ");
					;}
				catch(Exception ex) {
					System.out.println(" hi ha un error de typo! " +ex.getMessage());
					}
				
			} while(cotinua==false);
		
		return mySiNo; 
	};
	
	
	public static boolean examinaLeguirSiNoException(char SiNO) throws LeguirSiNoException{
		
		boolean siNo = false;
		
		if (SiNO=='s') {			
			siNo= true;
			}
		else if (SiNO=='n'){
			siNo = false;;
			}
		else {
			throw new LeguirSiNoException("l'elecció introduïda no coincideixi amb (Si/No)"+"\t\n"
					+ "per Si introduïu -> " +" s "+ "\t\n"
					+ "per No intruïu -> n");
			}
		return siNo;
		}
	

}
