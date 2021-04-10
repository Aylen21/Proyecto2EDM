package ar.edu.unju.edm.controler;

import ar.edu.unju.edm.model.Cuenta;

public class CuentaControler {

	public void operarConCuenta() {
		//instancia de la clase Cuenta
		Cuenta nuevaCuenta= new Cuenta();
		
		int numCuenta = 1;
		int dni = 236888;
		int saldo = 0;
		
	//una instancia de la clase Cuenta con valores asignado a sus atributos
		Cuenta otraCuenta = new Cuenta (numCuenta, dni, saldo);
		
		System.out.println("valor nombre de nuevacuenta:  " + nuevaCuenta.getNumCuenta());
		
		System.out.println("valor DNI de otraCuenta: " + otraCuenta.getDni());
	
		System.out.println("Valor del SALDO:" + otraCuenta.getSaldo());
		otraCuenta.depositar(1000);
		otraCuenta.depositar(5000);
		System.out.println("Valor del SALDO:" + otraCuenta.getSaldo());
		otraCuenta.extraer(9000);
		System.out.println("Valor del SALDO:" + otraCuenta.getSaldo());
	   
		if (otraCuenta.getSaldo()<0);{
		System.out.println("SALDO INSUFICIENTE, NO SE PUEDE HACER LA OPERACION");
		otraCuenta.depositar(9000);
       		
	}
  System.out.println("Valor del SALDO:" + otraCuenta.getSaldo());
	}
}
