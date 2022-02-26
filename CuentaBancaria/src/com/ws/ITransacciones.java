package com.ws;

import com.modelo.Cuenta;

public interface ITransacciones {

	Cuenta validaCuenta(int c);
	int retirar(int mov);
	int consultar();
	int consignar(int mov);
	int calculo(int con, int valor);
	
}
