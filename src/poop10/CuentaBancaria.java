/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author Claudio Flores
 */
public class CuentaBancaria {
    /**
     * saldo: es una variable de instancia privada de tipo double que representa el saldo actual de la cuenta bancaria. 
     */
    private double saldo; 
    /**
    * Constructor sin argumentos: inicializa el saldo de la cuenta a cero cuando se crea una nueva instancia de la clase CuentaBancaria.
    */
    public CuentaBancaria(){
        saldo=0;
    }
    /**
     * Este método permite depositar dinero en la cuenta. 
     * Incrementa el saldo de la cuenta por la cantidad especificada, además imprime un mensaje indicando que se está depositando una cantidad específica.
     * @param monto: Cantidad a depositar en la cuenta.
     */    
    public void depositar(double monto){
        System.out.println("Depositando " + monto);
        saldo += monto;
    }
    /**
     * Este método permite retirar dinero de la cuenta.
     * Si el retiro es exitoso, decrementa el saldo por la cantidad retirada.
     * @param monto es la cantidad de dinero a retirar
     * @throws SaldoInsuficienteException
     */
    public void retirar(double monto) throws SaldoInsuficienteException {
        System.out.println("Retirando " + monto);
        if(saldo < monto)
            throw new SaldoInsuficienteException();
        else
            saldo -= monto;
    }
    
    /**
     * @return saldo: devolverá el valor actual del saldo de la cuenta.
     */
    public double getSaldo(){
        return saldo;
    }
}
