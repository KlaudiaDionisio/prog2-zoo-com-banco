/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excecoes;

/**
 *
 * @author a400984
 */
public class AnimalNotFoundException extends Exception{ // exceção verificada 
    
    public AnimalNotFoundException(String mensagem){
        super(mensagem);
    }
}
