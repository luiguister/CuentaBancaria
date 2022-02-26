package com.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.modelo.Cuenta;

@WebService(serviceName ="TransaccionesImpl")
public class TransaccionesImpl implements ITransacciones{

	private static Cuenta cuenta = new Cuenta();
	Cuenta c_out = new Cuenta();
	@WebMethod(operationName = "validacuenta")
	
	public Cuenta validaCuenta(int c) {
		// 

		if(c_out.getNumero() == 37) {
			c_out.setMensaje("Acceso Concedido");
			c_out.setStatus(true);
		}else {
			c_out.setMensaje("Acceso Denegado");
			c_out.setStatus(false);
		}
		return c_out;
	}

	@WebMethod(operationName = "retirar")
	public int retirar(@WebParam(name = "valor") int valor) {
		cuenta.saldo -= valor; 
		c_out.setSaldo(cuenta.saldo);
		return c_out.getSaldo();
	}


	@WebMethod(operationName = "consultar")
	public int consultar() {
		// TODO Auto-generated method stub
		//return c_out.getSaldo();
		return cuenta.saldo;
	}

	@WebMethod(operationName = "consignar")
	public int consignar(@WebParam(name = "valor") int valor) {
		cuenta.saldo += valor; 
		c_out.setSaldo(cuenta.saldo);
		return c_out.getSaldo();
		
	}


	@WebMethod(operationName = "calculo")
	public int calculo(@WebParam(name = "con") int con, @WebParam(name = "valor") int valor) {
		int valor2 = cuenta.saldo;
		int c = 37;
		validaCuenta(c);
		//if(c_out.isStatus()) {
				
			switch(con) {
				case 1:{
				
					valor2 = consignar(valor);
				}break;
				case 2:{
					valor2 = retirar(valor);
				}break;
				case 3:{
					valor2 = consultar();
				}break;
				default :{
					valor2 = c_out.getSaldo();
				}break;
			}
			
		//}
		return valor2;
	}

	
}
