public class libstring {

	public static void main(String[] args) {
	
		String nombre1=new String("Holanda");
		String nombre2 = new String("que talca");
		
		//Concatena dos string.
		System.out.println(nombre1.concat(nombre2));
		
		//Compara una cadena identica a la variable.
		System.out.println(nombre1.contentEquals("holanda"));
		
		//Comprueba si esta cadena termina con el sufijo especificado.
		System.out.println(nombre1.endsWith("a"));
		
		//Compara variable string sin considerar mayusculas y minusculas.
		System.out.println(nombre1.equalsIgnoreCase("HolaNDa"));
		
		//devuelve true si la variable no contiene caracteres.
		System.out.println(nombre1.isEmpty());
		
		
	}
}
