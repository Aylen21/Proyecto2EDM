package ar.edu.unju.edm.controler;

import ar.edu.unju.edm.model.Calculadora;

public class CalculadoraControler {
	public void resolverOperaciones() {
		
	float num1;
	float num2;
	num1 = 45;
	num2 = 5;
	
	Calculadora nuevaCalculadora = new Calculadora ();
	nuevaCalculadora.setA(num1);
	nuevaCalculadora.setB(num2);

	System.out.println("El resultado de la suma: " + nuevaCalculadora.sumarDosnumeros() );
    System.out.println("El resultado de la division: " + nuevaCalculadora.dividirDosnumeros());
	
	}

}
