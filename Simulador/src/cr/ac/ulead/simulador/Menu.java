package cr.ac.ulead.simulador;

import java.io.PrintStream;

public class Menu {

	private static PrintStream output = new PrintStream(System.out);
	
	public void bienvenido() {
		output.println("Bienvendo");
		output.println("Como desea ejecutar las intrucciones");
		output.println("1. Sin segmentación");
		output.println("2. Con segmentación");
		output.println("3. Salir");
	}
	
	public void ciclo() {
		output.println("Desea volver a repetir la acción");
		output.println("1. Sin segmentación");
		output.println("2. Con segmentación");
		output.println("3. Salir");	
	}
	
}
