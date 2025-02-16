/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuentas;

/**
 *
 * @author USUARIO
 */
public class CCuenta {

    /**
     * @return the nombre
     */
    public String getNombre() {       
        return nombre;
    }

    /**
     * @param nombre setter creado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta setter creado
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo setter creado
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés Setter creado
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * @param nombre declarado
     * @param cuenta declarado
     * @param saldo declarado
     * @param tipoInterés declarado
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     *
     */
    public CCuenta()
    {
    }

    /**
     * @param nom como atributo de CCuenta
     * @param cue como atributo de CCuenta
     * @param sal como atributo de CCuenta
     * @param tipo como atributo de CCuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        /**
        * @param nombre se le atribuye el valor del atributo nom
        * @param cuenta se le atribuye el valor del atributo cue
        * @param saldo se le atribuye el valor del atributo sal
        */
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * @return the Saldo
     */
    public double estado()
    {
        return getSaldo();
    }
    /**
     * @param cantidad como atributo de ingresar
     * @throws Exception en caso de que cantidad sea una cifra negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * @param cantidad como atributo de retirar
     * @throws Exception en el caso de que la cantidad sea una cifra negativa o no haya suficiente saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
}
