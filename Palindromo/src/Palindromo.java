import java.util.Stack;

public class Palindromo {

    public static Boolean invertirConStack(String cadena) {
        Stack pila = new Stack();

        for (int i = 0; i < cadena.length(); i++) {
            pila.push(cadena.charAt(i));
        }

        StringBuilder cadenaInvertida = new StringBuilder();
        while (!pila.isEmpty()) {
            cadenaInvertida.append(pila.pop());
        }
    	System.out.println(cadenaInvertida);

        
        if(cadenaInvertida.toString().equals(cadena)) {
            return true;	
        }
        else {
        	return false;
        }

    }
}