/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 * @author Claudio Flores
 */

/**
 * Excepción verificada, lo que indica que los métodos que lanzan esta excepción deben manejarla o declarar que la lanzan.
 */
public class SaldoInsuficienteException extends Exception {
    /**
     * Cuando se crea una instancia de SaldoInsuficienteException, este constructor llama al constructor de la clase base (Exception) utilizando super("Saldo insuficiente"). 
     * La cadena "Saldo insuficiente" es el mensaje asociado con la excepción.
     */
    public SaldoInsuficienteException(){
        super("Saldo insuficiente");
    }
}
