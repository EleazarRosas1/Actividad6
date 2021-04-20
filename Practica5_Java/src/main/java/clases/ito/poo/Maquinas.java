/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package clases.ito.poo;

import java.time.LocalDate;
import java.util.HashSet;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Maquinas.
 * 
 * @author USUARIO
 */
public class Maquinas {
	public Maquinas(HashSet<String> descripcion, HashSet<LocalDate> fechaAdquisicion, HashSet<Float> costoMaquina) {
		super();
		Descripcion = descripcion;
		FechaAdquisicion = fechaAdquisicion;
		CostoMaquina = costoMaquina;
	}

	/**
	 * Description of the property Descripcion.
	 */
	public HashSet<String> Descripcion = new HashSet<String>();

	/**
	 * Description of the property FechaAdquisicion.
	 */
	public HashSet<java.time.LocalDate> FechaAdquisicion = new HashSet<java.time.LocalDate>();

	/**
	 * Description of the property CostoMaquina.
	 */
	public HashSet<Float> CostoMaquina = new HashSet<Float>();
	
	// Start of user code (user defined attributes for Maquinas)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public Maquinas() {
		// Start of user code constructor for Maquinas)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Maquinas)

	// End of user code
	/**
	 * Returns Descripcion.
	 * @return Descripcion 
	 */
	public HashSet<String> getDescripcion() {
		return this.Descripcion;
	}

	/**
	 * Returns FechaAdquisicion.
	 * @return FechaAdquisicion 
	 */
	public HashSet<java.time.LocalDate> getFechaAdquisicion() {
		return this.FechaAdquisicion;
	}

	/**
	 * Returns CostoMaquina.
	 * @return CostoMaquina 
	 */
	public HashSet<Float> getCostoMaquina() {
		return this.CostoMaquina;
	}

	@Override
	public String toString() {
		return "Maquinas [Descripcion=" + Descripcion + ", FechaAdquisicion=" + FechaAdquisicion + ", CostoMaquina="
				+ CostoMaquina + "]";
	}

}
