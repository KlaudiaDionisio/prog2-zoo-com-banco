/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import zoologico2.funcionarios.Funcionario;

/**
 *
 * @author a400984
 */
public class FuncionarioController {
    private final Connection conexao;
    private final String QUERY_INSERT = "INSERT INTO funcionario(nome, telefone, sexo, departamento, endereco)"
                                        + "VALUES(?,?,?,?,?)";
    
    public FuncionarioController(){
        this.conexao = Conexao.getConexao();
    }
    
    public int inserir(Funcionario func) throws SQLException{
        PreparedStatement ps = conexao.prepareStatement(QUERY_INSERT);
        ps.setString(1, func.getNome());
        ps.setString(2, func.getTelefone());
        ps.setString(3, String.valueOf(func.getSexo()));
        ps.setString(4, func.getDepartamento());
        ps.setString(5, func.getEndereco());
        
        return ps.executeUpdate();
    }
    
    public static void main(String[] args){
    Funcionario func = new Funcionario();
    func.setNome("Ronaldo");
    func.setTelefone("123456");
    func.setSexo('M');
    func.setDepartamento("Limpeza");
    func.setEndereco("UENP");
    
    FuncionarioController fc = new FuncionarioController();
    try{
        fc.inserir(func);
    }catch(SQLException ex){
        System.out.println(ex.getMessage());
    }
    }
    
    
}


