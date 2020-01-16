import java.io.*;
public class ACT5_P1 {

	public static void main(String[] args) {
	
		float fAltura, fPeso;
		int iDorsal;
		
		fAltura = Float.parseFloat(leer("INTRODUCE UNA ALTURA: "));
		fPeso = Float.parseFloat(leer("INTRODUCE UN PESO: "));
		iiDorsal = Integer.parseInt(leer("INTRODUCE UN DORSAL: "));


	}
	
	private static String leer(String sMensaje) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String cadenaLeida;
		
		System.out.println(sMensaje);
		try {
			cadenaLeida = teclado.readLine();
		}catch(Exception e) {
			cadenaLeida = "";
		}
		return cadenaLeida;
	}

}
