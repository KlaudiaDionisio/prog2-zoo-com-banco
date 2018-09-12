/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico2.funcionarios;

import animal.IOperavel;
import animal.mamiferos.Vaca;

/**
 *
 * @author a400984
 */
public class CirurgiaoDeJoelho <T extends IOperavel> extends Veterinario{ // tipo generico T
    
    private T animal;
    public CirurgiaoDeJoelho(T animal){
        this.animal = animal;
    }
    public void operar(){
        System.out.println("operou " 
                        + this.animal.getClass().getSimpleName());
    }
    
    public static void main(String[] args){
        CirurgiaoDeJoelho <Vaca> objeto = new CirurgiaoDeJoelho <>(new Vaca());
        objeto.operar();
    }
}
