package Carro;

import IMotores.IMotor;
import IMotores.IRelacionesDiferenciales;
import IMotores.ISupesion;

public class CarroGasolina extends Carro{
	private final IMotor motor;
	private final IRelacionesDiferenciales relaciones;
	private final ISupesion suspension;
	
	public CarroGasolina(IMotor motor, IRelacionesDiferenciales relaciones, ISupesion suspension) {
		this.motor=motor;
		this.relaciones=relaciones;
		this.suspension=suspension;
		System.out.print("Carro de gasolina");
	}

	@Override
	public void tipoCarroOffRoad() {
		motor.tipo();
		relaciones.tipo();
		suspension.tipo();
		
	}

}
