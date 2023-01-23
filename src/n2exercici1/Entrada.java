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
		float myEnteredFloat= 1;
		
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
		String myEnteredString="  ";
		char myOutputChar=' ';
		try { 
			do {
				myEnteredString= myObj.nextLine();
				//myEnteredString= myObj.next().charAt(0);  // toma la posición 0 del String
				if (myEnteredString.length()==1) {
					myOutputChar=myEnteredString.charAt(0);
					System.out.println("Primera lletra del teu nom es de tipus char: "+myOutputChar);
					continua= false;
					} else {
						System.out.println("introdueix primera lletra del teu nom, la lletra introduïda serà de tipus char?"); 
						}
				} while(continua);
			} catch(InputMismatchException e) {
				System.out.println("La teva resposta no és un character! Usuari/ària torna a introduir el teu nom!");
				}
				catch (Exception e) {
					;System.out.println(" hi ha un error de typo "+e.getMessage());;
					}
		return myOutputChar; 
	}
	
	
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
	}
	
	public static boolean llegirSiNo(String missatge){
		
		System.out.println(missatge);
		String myStringImput; 
		boolean cotinua= true;
		boolean mySiNo= false;
	
		do {
			try {
				myStringImput= myObj.nextLine();
				if (myStringImput.length()==1) {
					mySiNo = examinaLeguirSiNoException(myStringImput); //retorna true/false y lanza la exception
					System.out.println("la teva resposta és (true/false): " + mySiNo);
					cotinua= false;
					}else {
						System.out.println("l’usuari/ària introdueix “s”, retorna “true”, si l’usuari introdueix “n”, retorna “false”");
						}
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
				
			} while(cotinua);
		
		return mySiNo; 
	};
	
	
	public static boolean examinaLeguirSiNoException(String SiNO) throws LeguirSiNoException{
		
		boolean siNo = false;
		
		if (SiNO.equalsIgnoreCase("s")) {			
			siNo= true;
			}
		else if (SiNO.equalsIgnoreCase("n")){
			siNo = false;;
			}
		else {
			throw new LeguirSiNoException("l'elecció introduïda no coincideixi amb (Si/No)"+"\t\n"
					+ "per Si introduïu -> " +" s "+ "\t\n"
					+ "per No introduïu -> n");
			}
		return siNo;
		}
	

}
