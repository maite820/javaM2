

import javax.swing.*;


public class JavaM2Fase2 {

	public static void main(String[] args) {
		// detectar caracter en character i treure si es constant, vocal o numero
		
			String Paraula=JOptionPane.showInputDialog("Introduiu Paraula");
			for (int i=0; i<Paraula.length();i++) {
		
			   char r = Paraula.charAt(i);
													
				if (Character.isDigit(r)){
				System.out.println(r+ " "+ "es un numero");
				}
						
			if(r=='a'||(r=='e')||r=='i'||r=='o'||r=='u'||r=='A'||(r=='E')||r=='I'||r=='O'||r=='U') {
			System.out.println(r+ " "+ "es una vocal");
					}
				
	else if (Character.isLetter(r)) {
	System.out.println(r+ " "+ "es una consonante");
	}
				}
			}
	}						
	



