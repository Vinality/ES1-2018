/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroclientes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author viniciuscrepschi
 */
public class OperacoesBD {
    
    public void salvar(Connection conn,Cliente c)throws SQLException{
        String concatena="','";
        String insertSQL="INSERT INTO CLIENTE(nome, cpf, idade,telefone) VALUES('";
        insertSQL+=c.getNome()+concatena;
        insertSQL+=c.getCpf()+concatena;
        insertSQL+=c.getIdade()+concatena;
        insertSQL+=c.getTelefone()+"')";
        System.out.println(insertSQL);
        PreparedStatement pstmt = conn.prepareStatement(insertSQL);

        pstmt.execute();
        pstmt.close();
    }

    public Cliente buscarCPF(Connection conn, String cpf) throws SQLException {
        String selectSQL = "SELECT * FROM CLIENTE WHERE CPF = ?";
        Cliente cliente = null;
        PreparedStatement stmt = conn.prepareStatement(selectSQL);
        
        stmt.setString(1, cpf);
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {
            cliente = new Cliente();
            cliente.setNome(rs.getString("nome"));
            cliente.setCpf(rs.getString("cpf"));
            cliente.setIdade(Integer.parseInt(rs.getString("idade")));
            cliente.setTelefone(rs.getString("telefone"));
        }
        rs.close();
        stmt.close();
        return cliente;
    }

    public void alterarTelefone(Connection conn, String telefone, String cpf) throws SQLException {
        String updateSQL = "UPDATE CLIENTE SET TELEFONE = '";
        updateSQL += telefone;
        updateSQL += "' WHERE CPF = '";
        updateSQL += cpf;
        updateSQL += "'";
        
        System.out.println(updateSQL);
        
        PreparedStatement pstmt = conn.prepareStatement(updateSQL);

        pstmt.executeUpdate();
        pstmt.close();
    }
}
