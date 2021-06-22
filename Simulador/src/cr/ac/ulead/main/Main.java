package cr.ac.ulead.main;

import java.io.PrintStream;
import java.util.Scanner;

import cr.ac.ulead.simulador.Menu;
import cr.ac.ulead.simulador.Segmentacion;
import cr.ac.ulead.simulador.SinSegmentacion;

public class Main {
	private static Scanner input = new Scanner(System.in);
	private static PrintStream output = new PrintStream(System.out);
	
	static SinSegmentacion sSeg = new SinSegmentacion();
	static Segmentacion Seg = new Segmentacion();
	static Menu menu = new Menu();
	
	public static void main(String[] args) {
		menu.bienvenido();
		
		int opcion = 0;
		while (opcion != 3) {
			opcion = input.nextInt();
			switch (opcion) {
			case 1:
				sSeg.ejecutarProcesos();
				break;
			case 2:
				Seg.ejecutarProcesos();
				break;
			case 3:
				output.println("Ha salido");
				break;
			default:
				output.println("Inserte opción correcta");
				output.println("");
				break;
			}
		}
	}

}
