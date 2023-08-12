package ExerciseBookJava;

public class CaracteresInfiltrados {
	/*
	 * Crea una función que reciba dos cadenas de texto casi iguales,
	 * a excepción de uno o varios caracteres. 
	 * La función debe encontrarlos y retornarlos en formato lista/array.
	 * - Ambas cadenas de texto deben ser iguales en longitud.
	 * - Las cadenas de texto son iguales elemento a elemento.
	 * - No se pueden utilizar operaciones propias del lenguaje
	 *   que lo resuelvan directamente.*/
	
	public static void main(String[] args) {
		CaracteresInfiltrados characters = new CaracteresInfiltrados();
		try {
			System.out.println(characters.identificadorCaracteres("hola", "hali"));
		} catch (chainsSizeException e) {
			e.printStackTrace();
		}
	}
	
	public char[] identificadorCaracteres(String original, String copia) throws chainsSizeException {
		if (original.length() != copia.length()) {
			throw new chainsSizeException("the size of the chains not is the same", new chainsSizeException());
		}
		char [] caracteresInfiltrados = new char [original.length()];
		for (int i = 0 ; i < original.length() ; i++) {
			if(original.charAt(i) != copia.charAt(i)) {
				caracteresInfiltrados[i] =  copia.charAt(i);
			}
		}
		return caracteresInfiltrados;

	}
}
