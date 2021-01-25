
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class JavaM2fas3 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String cadena = "MARIA";
	Map <Character,Integer> m = new HashMap <Character,Integer>();
	
	
		for (int i=0; i<cadena.length();i++) {
		
		if (m.containsKey(cadena.charAt(i))) {
			m.put(cadena.charAt(i),(int)m.get(cadena.charAt(i))+1);
		}else {
			m.put(cadena.charAt(i), 1);
		}
	
}	
		Set<Map.Entry<Character,Integer>> freq= m.entrySet();
		
		Iterator<Map.Entry<Character,Integer>> it= freq.iterator();
		
		//mostrar resultado pantalla
		while (it.hasNext()) {
			Map.Entry<Character, Integer> item= it.next();
			System.out.println(item.getKey()+":"+item.getValue() );
		}
}	
}
	