package cr.ac.ulead.simulador;

import java.io.PrintStream;

public class Menu {

	private static PrintStream output = new PrintStream(System.out);
	
	public void bienvenido() {
		output.println("Bienvendo");
		output.println("Como desea ejecutar las intrucciones");
		output.println("1. Sin segmentaci�n");
		output.println("2. Con segmentaci�n");
		output.println("3. Salir");
	}
	
	public void ciclo() {
		output.println("Desea volver a repetir la acci�n");
		output.println("1. Sin segmentaci�n");
		output.println("2. Con segmentaci�n");
		output.println("3. Salir");	
	}
	
}
