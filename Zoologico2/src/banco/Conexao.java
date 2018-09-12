/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author a400984
 */
public class Conexao {
    private static final String URL = "jdbc:postgresql://localhost:5432/zoologico";
    private static final String USUARIO = "zoo";
    private static final String SENHA = "zoo123";
    
    private static Connection conexao;
    
    public static Connection getConexao(){
        if(conexao == null){
            try{
                Class.forName("org.postgresql.Driver");
                conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            }catch(SQLException ex){
                System.out.println("Falha ao conectar: "
                        + ex.getMessage());
            }catch(ClassNotFoundException ex){
                System.out.println("Falha ao conectar: "
                        + ex.getMessage());
            }
        }   
        return conexao;
    }
}
