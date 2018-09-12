/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import zoologico2.funcionarios.FuncTela;

/**
 *
 * @author a400984
 */
public class FuncionarioDataModel extends AbstractTableModel{
     private ArrayList <FuncTela> func;
    private String colunas[] = {"Nome", "Idade", "Telefone"};
    
    public FuncionarioDataModel(ArrayList<FuncTela> f){
        this.func = f;
    }

    @Override
    public int getRowCount() {
        return func.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        FuncTela a = this.func.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return a.getNome();
            case 1:
                return a.getIdade();
            case 2:
                return a.getTelefone();
        }
        return 0;
    }
    
     @Override
    public String getColumnName(int column) {
         return this.colunas[column];
    }
    
    
}
