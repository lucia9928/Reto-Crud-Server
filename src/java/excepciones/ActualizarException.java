/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author 2dam
 */
public class ActualizarException extends Exception{

    public ActualizarException(String message) {
        super(message);
    }

    public ActualizarException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
