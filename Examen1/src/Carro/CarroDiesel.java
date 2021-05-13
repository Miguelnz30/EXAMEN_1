package Carro;

import IMotores.IMotor;
import IMotores.IRelacionesDiferenciales;
import IMotores.ISupesion;

public class CarroDiesel extends Carro{
	
	private final IMotor motor;
	private final IRelacionesDiferenciales relaciones;
	private final ISupesion suspension;
	
	public CarroDiesel(IMotor motor, IRelacionesDiferenciales relaciones, ISupesion suspension) {
		this.motor=motor;
		this.relaciones=relaciones;
		this.suspension=suspension;
		System.out.print("Carro de diesel");
	}

	@Override
	public void tipoCarroOffRoad() {
		motor.tipo();
		relaciones.tipo();
		suspension.tipo();
		
	}

}
