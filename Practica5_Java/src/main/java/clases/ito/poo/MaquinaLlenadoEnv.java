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
 * Description of MaquinaLlenadoEnv.
 * 
 * @author USUARIO
 */
public class MaquinaLlenadoEnv extends Maquinas {
	public MaquinaLlenadoEnv(HashSet<String> descripcion, HashSet<LocalDate> fechaAdquisicion,
			HashSet<Float> costoMaquina, int envasesxmin, int regulacionMl) {
		super(descripcion, fechaAdquisicion, costoMaquina);
		Envasesxmin = envasesxmin;
		RegulacionMl = regulacionMl;
	}

	

	/**
	 * Description of the property Envasesxmin.
	 */
	public int Envasesxmin = 0;

	/**
	 * Description of the property RegulacionMl.
	 */
	public int RegulacionMl = 0;

	// Start of user code (user defined attributes for MaquinaLlenadoEnv)

	// End of user code

	/**
	 * The constructor.
	 */
	public MaquinaLlenadoEnv() {
		// Start of user code constructor for MaquinaLlenadoEnv)
		super();
		// End of user code
	}

	/**
	 * Description of the method CostoLavado.
	 * @param CostoMaquina 
	 * @param Botellasxmin 
	 * @return 
	 */
	public float CostoLavado(float CostoMaquina, int Botellasxmin) {
		// Start of user code for method CostoLavado
		float costo,botellas= Botellasxmin/Envasesxmin;
		costo=(CostoMaquina*0.0025F)*botellas;
		
		return costo;
		// End of user code
	}

	// Start of user code (user defined methods for MaquinaLlenadoEnv)

	// End of user code
	/**
	 * Returns Envasesxmin.
	 * @return Envasesxmin 
	 */
	public int getEnvasesxmin() {
		return this.Envasesxmin;
	}

	/**
	 * Sets a value to attribute Envasesxmin. 
	 * @param newEnvasesxmin 
	 */
	public void setEnvasesxmin(int newEnvasesxmin) {
		this.Envasesxmin = newEnvasesxmin;
	}

	/**
	 * Returns RegulacionMl.
	 * @return RegulacionMl 
	 */
	public int getRegulacionMl() {
		return this.RegulacionMl;
	}

	/**
	 * Sets a value to attribute RegulacionMl. 
	 * @param newRegulacionMl 
	 */
	public void setRegulacionMl(int newRegulacionMl) {
		this.RegulacionMl = newRegulacionMl;
	}

	@Override
	public String toString() {
		return "MaquinaLlenadoEnv [Envasesxmin=" + Envasesxmin + ", RegulacionMl=" + RegulacionMl + "]";
	}

}
