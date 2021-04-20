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
 * Description of MaquinaEmpaq.
 * 
 * @author USUARIO
 */
public class MaquinaEmpaq extends Maquinas {
	public MaquinaEmpaq(HashSet<String> descripcion, HashSet<LocalDate> fechaAdquisicion, HashSet<Float> costoMaquina,
			String tipoEmpaque, int empaquesxmin) {
		super(descripcion, fechaAdquisicion, costoMaquina);
		TipoEmpaque = tipoEmpaque;
		Empaquesxmin = empaquesxmin;
	
	}

	/**
	 * Description of the property TipoEmpaque.
	 */
	public String TipoEmpaque = "";

	/**
	 * Description of the property Empaquesxmin.
	 */
	public int Empaquesxmin = 0;
	
	

	// Start of user code (user defined attributes for MaquinaEmpaq)

	// End of user code

	/**
	 * The constructor.
	 */
	public MaquinaEmpaq() {
		// Start of user code constructor for MaquinaEmpaq)
		super();
		// End of user code
	}

	/**
	 * Description of the method CostoEmpaquetado.
	 * @param CostoMaquina 
	 * @param Empaquestotales 
	 * @return 
	 */
	public float CostoEmpaquetado(float CostoMaquina, int Empaquestotales) {
		// Start of user code for method CostoEmpaquetado
		CostoMaquina=(float) (CostoMaquina-CostoMaquina*.5);
		Empaquestotales=(Empaquestotales*9);
		float costoempaquexbotella=((Empaquestotales/27)*.188F);
		return costoempaquexbotella;
				
		// End of user code
	}

	// Start of user code (user defined methods for MaquinaEmpaq)

	// End of user code
	/**
	 * Returns TipoEmpaque.
	 * @return TipoEmpaque 
	 */
	public String getTipoEmpaque() {
		return this.TipoEmpaque;
	}

	/**
	 * Sets a value to attribute TipoEmpaque. 
	 * @param newTipoEmpaque 
	 */
	public void setTipoEmpaque(String newTipoEmpaque) {
		this.TipoEmpaque = newTipoEmpaque;
	}

	/**
	 * Returns Empaquesxmin.
	 * @return Empaquesxmin 
	 */
	public int getEmpaquesxmin() {
		return this.Empaquesxmin;
	}

	/**
	 * Sets a value to attribute Empaquesxmin. 
	 * @param newEmpaquesxmin 
	 */
	public void setEmpaquesxmin(int newEmpaquesxmin) {
		this.Empaquesxmin = newEmpaquesxmin;
	}

	@Override
	public String toString() {
		return "MaquinaEmpaq [TipoEmpaque=" + TipoEmpaque + ", Empaquesxmin=" + Empaquesxmin + "]";
	}

}
