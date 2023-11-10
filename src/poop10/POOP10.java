/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 *
 * @author Claudio Flores
 */
public class POOP10 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
        *Aquí comienza el bloque try, que envuelve el código que podría generar una excepción.
        */
        try{
            /**
            * Se crea un arreglo de cadenas llamado mensajes que contiene tres elementos: "Primero", "Segundo" y "Tercero".
            */
            String mensajes[] = {"Primero","Segundo","Tercero"};
            /**
             * El bucle for intenta imprimir cada elemento del arreglo mensajes. 
             * Sin embargo, hay un error en la condición del bucle (i <= 3).
             * el índice del arreglo va de 0 a 2 (ya que hay tres elementos en el arreglo). 
             * Por lo tanto, cuando i alcanza el valor 3, 
             * se produce un ArrayIndexOutOfBoundsException.
             */
            for(int i=0;i<=3;i++){
                System.out.println(mensajes[i]);
            }
            
          /**
           * Este bloque catch captura la excepción ArrayIndexOutOfBoundsException, que podría generarse en el bloque try. 
           * En caso de que la excepción ocurra, imprime un mensaje de error indicando que el puntero está fuera del rango del arreglo.
           */
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Apuntador fuera del rango del arreglo.");
        }
        
        //----------------------------------------------------------------------------------
        System.out.println("\n");
        /**
        *Aquí comienza el bloque try, que envuelve el código que podría generar una excepción.
        */
        try {
        /**
         * Se intenta realizar una operación de división por cero, lo cual es una operación aritmética inválida. 
         * Esto generará una excepción de tipo ArithmeticException.
         */
        double x; 
        x= 0/0;
        System.out.println(x); 
        /**
         * Este bloque catch captura la excepción ArithmeticException que podría generarse en el bloque try. 
         * Imprime el mensaje de la excepción (e.getMessage()) y un mensaje adicional indicando que se produjo una división entre cero.
         */
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Error: division entre cero. ");
        /**
         * Este bloque finally se ejecuta siempre, independientemente de si se produce una excepción o no. 
         * En este caso, imprime un mensaje indicando que siempre se ejecuta.
         */
        }finally{
            System.out.println("Siempre se ejecuta (Finally)");
        }
        
        //--------------------------------------------------------------------
        System.out.println("\n");
        /**
        *Aquí comienza el bloque try, que envuelve el código que podría generar una excepción.
        */
        try {
        /**
         * Se intenta realizar una operación de división por cero, lo cual es una operación aritmética inválida. 
         * Esto generará una excepción de tipo ArithmeticException.
         */
        double x; 
        x= 0/0;
        System.out.println(x);
        /**
         * Este bloque catch captura la excepción ArithmeticException que podría generarse en el bloque try. 
         * Imprime el mensaje de la excepción (e.getMessage()) y utiliza e.printStackTrace() para imprimir el seguimiento de la pila de la excepción.
         */
        } catch (ArithmeticException e){
            /**
             * e.getMessage(): Imprime el mensaje asociado con la excepción.
             */
            System.out.println(e.getMessage());
            /**
            * e.printStackTrace(): Imprime el seguimiento de la pila, que es una lista de métodos que fueron llamados en el momento en que se lanzó la excepción.
            */
            e.printStackTrace();
        }
        
        //-------------------------------------------------------------------
        System.out.println("\n");
        /**
         * Aquí, se llama a la función division dentro de un bloque try. 
         * Si la función lanza una excepción del tipo UnsupportedOperationException, se captura en el bloque catch.
         */
        try {
        double division = division(4.0f,6.0);
        /**
         * Este bloque catch captura la excepción UnsupportedOperationException que podría generarse en el bloque try. 
         * Imprime el mensaje de la excepción (e.getMessage()), que en este caso sería "Operacion no soportada".
         */
        } catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }
        
        
        //EJECUCIÓN CLASS CUENTA BANCARIA
        /**
         * Se crea una instancia de la clase CuentaBancaria llamada cuenta. 
         * Esto inicializa una cuenta bancaria con un saldo inicial de cero.
         */
        CuentaBancaria cuenta = new CuentaBancaria();
        /**
         * Aquí comienza un bloque try, que se utiliza para rodear el código que podría lanzar excepciones.
         */
        try{
            cuenta.depositar(2000); 
            cuenta.retirar(1000);
            cuenta.getSaldo();
            cuenta.retirar(1000);
            cuenta.getSaldo();
            cuenta.retirar(1000);
            cuenta.getSaldo();
            cuenta.depositar(200);
            cuenta.retirar(100);
        /**
         * Este bloque catch se ejecutará si se lanza una excepción del tipo SaldoInsuficienteException dentro del bloque try.
         */    
        }catch(SaldoInsuficienteException e){
            /**
             * Si se lanza la excepción, se imprime la traza de la pila en la consola. 
             * Esto mostrará la información sobre el tipo de excepción, el mensaje asociado y la ubicación en el código donde se lanzó la excepción.
             */
            e.printStackTrace();
        }
        
        
    }
    
    /**
     * @param f 
     * @param d
     * @return En este caso, la función simplemente lanza la excepción con un mensaje indicando que la operación no está soportada.
     * @throws UnsupportedOperationException 
     */
    private static double division(float f, double d) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Operacion no soportada. "); 
    }
    
}
