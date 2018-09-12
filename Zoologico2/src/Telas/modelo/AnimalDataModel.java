/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.modelo;

import animal.Animal;
import animal.Animau;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author a400984
 */
public class AnimalDataModel extends AbstractTableModel{
    private ArrayList <Animau> animais;
    private String colunas[] = {"Nome", "Espécie", "Idade"};
    
    public AnimalDataModel(ArrayList<Animau> a){
        this.animais = a;
    }

    @Override
    public int getRowCount() {
        return this.animais.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length; 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Animau a = this.animais.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return a.getNome();
            case 1:
                return a.getEspecie();
            case 2:
                return a.getIdade();
        }
        return 0;
    }

    @Override
    public String getColumnName(int column) {
         return this.colunas[column];
    }
    
    
}
