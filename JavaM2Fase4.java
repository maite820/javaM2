import javax.swing.*;

public class JavaM2Fase4 {

	public static void main(String[] args) {
		//emmagatzemar les lletres de la llista com el nom de vegades
		
		String  nom = JOptionPane.showInputDialog("Introdueix nom");
		char[] lletres = nom.toCharArray();
		String  cognom = JOptionPane.showInputDialog("Introdueix cognom");
		char[] lletres_2 = cognom.toCharArray();
		
		
		for (char el : lletres) {
			
		    System.out.print("["+"'"+el+"'"+"]"+" " );
		}
		for (char el2 : lletres_2) {
		    System.out.print("["+"'"+el2+"'"+"]"+" "  );
		}
		
	}

}



