package Dominio;

import java.util.Arrays;

public class Album {
	
	private static String selecciones[] = {"Qatar", "Ecuador", "Senegal", "Paises Bajos", "Inglaterra", "Irán", "EEUU", "Gales", "Argentina", "Arabia Saudita", "México", "Polonia", "Francia", "Australia", "Dinamarca", "Tunez", "España", "Costa Rica", "Alemania", "Japón", "Bélgica", "Canadá", "Marruecos", "Croacia", "Brasil", "Serbia", "Suiza", "Camerún", "Portugal", "Ghana", "Uruguay", "Corea del Sur"};
	
	private static Figurita figuritasDisponibles[] = new Figurita[704];
	private Figurita figuritasActuales[];
	
	public Album() {
		this.figuritasActuales= new Figurita [800];
		/*
		 * El constructor debe generar las condiciones necesaias para garantizar el correcto funcionamiento de la app
		 */
	}
	
	public static void inicializarCodigosDeFiguritas() {
		int posicionEnFiguritasDisponibles = 0;
		for(int i=0;i<selecciones.length; i++) {
			String nombreCorto = selecciones[i].substring(0, 3).toUpperCase();
			for(int j=0; j<22; j++) {
				String codigoDeLaFigurita = nombreCorto + j;
				figuritasDisponibles[posicionEnFiguritasDisponibles++] = new Figurita(codigoDeLaFigurita);
			}
		}
		
	}
	
		/*
		 * Por cada país debe generar 22 códigos de manera automática por ejemplo QAT1, URU12, COS10
		 */

	
	
	public static void actualizarDatosFigurita(String codigo, char grupo, String nombreJugador, double valor) {
		boolean actualizar=false;
		for (int i = 0; i < figuritasDisponibles.length && !actualizar; i++) {
			if(figuritasDisponibles[i]!=null && figuritasDisponibles[i].getCodigo().equals(codigo) ) {
			 figuritasDisponibles[i].setGrupo(grupo);
				figuritasDisponibles[i].setNombreJugador(nombreJugador);
				figuritasDisponibles[i].setValor(valor);
				actualizar=true;
				
			}
		}
		
		
		
		/*
		 * En función del código de figurita, se deben actualizar los datos de la misma en figuritasDisponibles 
		 */
	}
	
	public static Figurita getFigurita(String codigo) {
		Figurita buscada=null;
		boolean sepudo=false;
		for (int i = 0; i < figuritasDisponibles.length && !false; i++) {
			if(figuritasDisponibles[i]!=null && figuritasDisponibles[i].getCodigo().equals(codigo)) ;
			buscada= figuritasDisponibles[i];
			sepudo=true;
		}
		/*
		 * En función del código de figurita, devuelve la figurita de figuritasDisponibles
		 */
		return buscada;
	}
	
	public Figurita[] comprarSobre() {
		Figurita sobre[] = new Figurita[5];
		int posicionAleatoria=0;
		for (int i = 0; i < sobre.length; i++) {
			if(sobre[i]==null) {
				posicionAleatoria= (int)Math.random()*704;
				sobre[i]= figuritasDisponibles[posicionAleatoria];
			}
		}
		return sobre;
				
	}		
				// Math.round(Math.random() * (5 - 0 + codigo) + 0);
				
			
		
		
		
		/*
		 * Se debe calcular y devolver 5 códigos de figurita de manera aleatoria.
		 */
		
		
	
	
	public void agregarFigurita(Figurita nueva) {
		boolean sepudo= false;
		for (int i = 0; i < figuritasActuales.length; i++) {
			if(figuritasActuales[i]== null) {
				figuritasActuales[i]= nueva;
				sepudo=true;
			}
		}
		
		
		/*
		 * Agrega una nueva figurita al array figuritasActuales
		 */
	}
	
	public void ordenarFiguritasActuales() {
		Figurita auxiliar=null; 
		boolean sepudo=false;
		for (int i = 0; i < figuritasActuales.length; i++) {
			for (int j = 0; j < figuritasActuales.length-1; j++) {
				if(figuritasActuales[i]!=null && figuritasActuales[j+1]!=null){
					if(figuritasActuales[j].getCodigo().compareTo(figuritasActuales[j+1].getCodigo())>0) {
						auxiliar=figuritasActuales[j+1];
						figuritasActuales[j+1]=figuritasActuales[j];
						figuritasActuales[j]=auxiliar;
						sepudo=true;
					}
				}
			}
		}
		
		
		
		
		
		/*
		 * 
		 * Debe ordenar el array figuritasActuales
		 */
	}
	
	public boolean elAlbumEstaCompleto() {
		
		if(calcularPorcentajeCompletado()==100) {
			return true;
		}else {
			return false;
		}
		
		/*if(
		 * 
		 * 
		 * 
		 * Debe verificar que todas las figuritas disponibles estén presentes al menos una vez en las figuritas actuales 
		 */		
		
	}
	

	
	public double calcularPorcentajeCompletado() {
		double porcentaje =0;
		double porcentajequesemultiplica=100;
		double acumulable=0;
		for (int i = 0; i < figuritasDisponibles.length; i++) {
			if(figuritasDisponibles[i]!=null&& figuritasActuales[i]!=null) {
			for (int j = 0; j < figuritasActuales.length; j++) {
				
				if(figuritasDisponibles[i].getCodigo().equals(figuritasActuales[j].getCodigo())) {
					acumulable++;
				}
			}
			}
		
		}
		/*
		 * Debe calcular el porcentaje de figuritas del album que está completo. Para esto se debe basar en la información de las figuritasDisponibles en relación a las figuritasActuales que se tiene en el album.
		 */porcentaje  =(acumulable*porcentajequesemultiplica)/figuritasDisponibles.length;
		return porcentaje;
				
	}

	public static String[] getSelecciones() {
		return selecciones;
	}

	public static void setSelecciones(String[] selecciones) {
		Album.selecciones = selecciones;
	}

	public static Figurita[] getFiguritasDisponibles() {
		return figuritasDisponibles;
	}

	public static void setFiguritasDisponibles(Figurita[] figuritasDisponibles) {
		Album.figuritasDisponibles = figuritasDisponibles;
	}

	public Figurita[] getFiguritasActuales() {
		return figuritasActuales;
	}

	public void setFiguritasActuales(Figurita[] figuritasActuales) {
		this.figuritasActuales = figuritasActuales;
	}

	@Override
	public String toString() {
		return "Album [figuritasActuales=" + Arrays.toString(figuritasActuales) + "]";
	}

	
	
	
	
	
	
	
	
	
	
}
