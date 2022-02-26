/**
 * Cuenta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.modelo;

public class Cuenta  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String mensaje;

    private java.lang.String nombre;

    private int numero;

    public int saldo;

    public boolean status;

    public Cuenta() {
    }

    public Cuenta(
           java.lang.String mensaje,
           java.lang.String nombre,
           int numero,
           int saldo,
           boolean status) {
           this.mensaje = mensaje;
           this.nombre = nombre;
           this.numero = numero;
           this.saldo = saldo;
           this.status = status;
    }


    /**
     * Gets the mensaje value for this Cuenta.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this Cuenta.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }


    /**
     * Gets the nombre value for this Cuenta.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Cuenta.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the numero value for this Cuenta.
     * 
     * @return numero
     */
    public int getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this Cuenta.
     * 
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }


    /**
     * Gets the saldo value for this Cuenta.
     * 
     * @return saldo
     */
    public int getSaldo() {
        return saldo;
    }


    /**
     * Sets the saldo value for this Cuenta.
     * 
     * @param saldo
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }


    /**
     * Gets the status value for this Cuenta.
     * 
     * @return status
     */
    public boolean isStatus() {
        return status;
    }


    /**
     * Sets the status value for this Cuenta.
     * 
     * @param status
     */
    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
