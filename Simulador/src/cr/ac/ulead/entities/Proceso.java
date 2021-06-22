package cr.ac.ulead.entities;

public class Proceso {
	
	private final String id;
	private boolean nuevo, listo, ejecucion, espera, terminado;
	private final int tLlegada;
	private int tCPU, tiBloq, tBloq, tiES;
	
	public int getTiES() {
		return tiES;
	}

	public Proceso(String id2, int tLlegada2, int tCPU2, int tiBloq2, int tBloq2) {
		this.id = id2;
		this.tLlegada = tLlegada2;
		this.tCPU = tCPU2;
		this.tiBloq = tiBloq2;
		this.tBloq = tBloq2;
		this.nuevo = true;
		this.tiES = tiES;
	}
	
	public void listo()  {
		nuevo = false;
		listo = true;
		ejecucion = false;
		espera = false;
		terminado = false;
		System.out.println("\tProceso "+id+ " LISTO");
	}

	public void ejecucion() {
		nuevo = false;
		listo = false;
		ejecucion = true;
		espera = false;
		terminado = false;
		System.out.println("\tProceso "+id+ " en ejecucion");
	}
	
	public void espera() {
		nuevo = false;
		listo = false;
		ejecucion = false;
		espera = true;
		terminado = false;
		System.out.println("\tProceso "+id+ " en espera");
	}
	
	public void terminado() {
		nuevo = false;
		listo = false;
		ejecucion = false;
		espera = false;
		terminado = true;
		System.out.println("\tProceso "+id+ " Terminado");
	}
	
	public String getEstado(){
		String estado="";
		
		if(nuevo==true) {
			estado = "nuevo";
		}
		
		if(listo==true) {
			estado = "listo";
		}
		
		if(ejecucion==true) {
			estado = "ejecucion";
		}
		
		if(espera==true) {
			estado = "en espera";
		}
		
		if(terminado==true) {
			estado = "terminado";
		}

		return (estado);
		
	}

	@Override
	public String toString() {
		String estado="";
		
		if(nuevo==true) {
			estado = "nuevo";
		}
		
		if(listo==true) {
			estado = "listo";
		}
		
		if(ejecucion==true) {
			estado = "ejecucion";
		}
		
		if(espera==true) {
			estado = "en espera";
		}
		
		if(terminado==true) {
			estado = "terminado";
		}
		
		
		return ("Proceso "+id+" "+estado);
	}

	public int gettLlegada() {
		return tLlegada;
	}
	
	public int gettCPU() {
		return tCPU;
	}

	public int gettiBloq() {
		return tiBloq;
	}


	public int gettBloq() {
		return tBloq;
	}
	
	
	public void ejecutarProceso() {
		if(tCPU>0) {
			tCPU--;
			System.out.println("\ttiempo de ejecucion "+id+": "+tCPU);
		}
		if(tCPU<1) {
			terminado();
		}
	}
	
	public void esperando() {
		if(tBloq>0) {
			tBloq--;
			System.out.println("\ttiempo de espera "+id+": "+tBloq);
		}
		if(tBloq<1) {
			listo();
		}
	}
	
	public void datoES() {
		System.out.println("Pidiendo datos al usuario");
	}
}
