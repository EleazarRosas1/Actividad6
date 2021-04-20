/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package clases.ito.poo;

import java.time.LocalDate;
import java.util.HashSet;

import clases.ito.poo.Maquinas;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of MaquinaLavado.
 * 
 * @author USUARIO
 */
public class MaquinaLavado extends Maquinas {
	public MaquinaLavado(HashSet<String> descripcion, HashSet<LocalDate> fechaAdquisicion, HashSet<Float> costoMaquina,
			float capacidadLitro, int cicloLavado) {
		super(descripcion, fechaAdquisicion, costoMaquina);
		CapacidadLitro = capacidadLitro;
		CicloLavado = cicloLavado;
	}

	/**
	 * Description of the property CapacidadLitro.
	 */
	public float CapacidadLitro = 0F;

	/**
	 * Description of the property CicloLavado.
	 */
	public int CicloLavado = 0;

	// Start of user code (user defined attributes for MaquinaLavado)

	// End of user code

	/**
	 * The constructor.
	 */
	public MaquinaLavado() {
		// Start of user code constructor for MaquinaLavado)
		super();
		// End of user code
	}

	/**
	 * Description of the method CostoLavado.
	 * @param CostoMaquina 
	 * @param Botellas 
	 * @return 
	 */
	public float CostoLavado(float CostoMaquina, int Botellas) {
		// Start of user code for method CostoLavado
		float a,CostoTotal;
		a=CostoMaquina*.005F;
		Botellas=Botellas/3;
		CostoTotal=a*Botellas;
		return CostoTotal;
	
		
		// End of user code
	}

	// Start of user code (user defined methods for MaquinaLavado)

	// End of user code
	/**
	 * Returns CapacidadLitro.
	 * @return CapacidadLitro 
	 */
	public float getCapacidadLitro() {
		return this.CapacidadLitro;
	}

	/**
	 * Sets a value to attribute CapacidadLitro. 
	 * @param newCapacidadLitro 
	 */
	public void setCapacidadLitro(float newCapacidadLitro) {
		this.CapacidadLitro = newCapacidadLitro;
	}

	/**
	 * Returns CicloLavado.
	 * @return CicloLavado 
	 */
	public int getCicloLavado() {
		return this.CicloLavado;
	}

	/**
	 * Sets a value to attribute CicloLavado. 
	 * @param newCicloLavado 
	 */
	public void setCicloLavado(int newCicloLavado) {
		this.CicloLavado = newCicloLavado;
	}

	@Override
	public String toString() {
		return "MaquinaLavado [CapacidadLitro=" + CapacidadLitro + ", CicloLavado=" + CicloLavado + " segundos ]";
	}

}
