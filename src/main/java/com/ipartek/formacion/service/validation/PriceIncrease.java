package com.ipartek.formacion.service.validation;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class PriceIncrease {

	/** Logger for this class and subclasses */
	protected final Log logger = LogFactory.getLog(getClass());

	@Min(0)
	@Max(50)

	private int porcentaje;
	@AssertTrue
	private boolean confirmar;

	public boolean isConfirmar() {
		return this.confirmar;
	}

	public void setConfirmar(boolean confirmar) {
		this.confirmar = confirmar;
	}

	public void setPorcentaje(int i) {
		this.porcentaje = i;
		this.logger.info("Incremanta porcentaje a " + i);
	}

	public int getPorcentaje() {
		return this.porcentaje;
	}

}
