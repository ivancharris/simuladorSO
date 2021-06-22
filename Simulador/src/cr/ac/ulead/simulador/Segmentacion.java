package cr.ac.ulead.simulador;


import java.util.Scanner;

import cr.ac.ulead.entities.Proceso;


public class Segmentacion {
	
	private Scanner input = new Scanner(System.in);
	static Proceso[] cprocesos;
	
	public static void ejecutarProcesos() {
		
	int[] tiempo = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,
			43,44,45,46,47,48,49,50,51,52,53,54,55};
	
	Proceso p1 = new Proceso("Fetch",0,5,0,0);
	Proceso p2 = new Proceso("Acceso a Memoria",2,10,0,5);
	Proceso p3 = new Proceso("Ejecución",7,20,0,15);
	Proceso p4 = new Proceso("Retroescritura",17,10,0,35);
	Proceso p5 = new Proceso("Actualización del procesador",21,10,0,45);
	
	cprocesos = new Proceso[] {p1,p2,p3,p4,p5};
		
		System.out.println("");
		estadoProceso();
		
		
		for (int i=0;i < tiempo.length; i++) {
			
			System.out.println("TIEMPO " + tiempo[i] + " : ");
			
			//bucle ejecutar
			
			for (Proceso pr : cprocesos) {
				if (pr.getEstado().equals("listo")){
					pr.ejecucion();
				}
			}
			
			
			for (Proceso pr : cprocesos) {
				if (pr.getEstado().equals("ejecucion")){
					pr.ejecutarProceso();
				}
			}
			
			for (Proceso pr : cprocesos) {
				if (pr.gettiBloq()==tiempo[i]){
					pr.espera();
				}
			}
			
			for (Proceso pr : cprocesos) {
				if (pr.getEstado().equals("en espera")){
					pr.esperando();
				}
			}
			
			//bucle listo
			for (Proceso pr : cprocesos) {
				if(pr.gettLlegada() == tiempo[i]) {
					pr.listo();
				}
			}
			
			for(Proceso pr: cprocesos) {
				if(pr.getTiES() == tiempo[i]) {
					//pr.datoES();
					//Scanner sc = new Scanner(System.in);
					//sc.nextLine();
				}
			}	
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
					System.out.println("Error");
				}
		}
		estadoProceso();
	
	}
	
	public static void estadoProceso() {
		for (Proceso i : cprocesos) {
			System.out.println(i);
		}
	}
	
}

