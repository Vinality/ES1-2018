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
import javax.swing.JTextArea;
import javax.swing.JTextPane;

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

    public void alterarTelefone(Connection conn, String telefone, String cpf) throws SQLException, Exception {
        String updateSQL = "UPDATE CLIENTE SET TELEFONE = '";
        updateSQL += telefone;
        updateSQL += "' WHERE CPF = '";
        updateSQL += cpf;
        updateSQL += "'";
            
        PreparedStatement pstmt = conn.prepareStatement(updateSQL);

        if(pstmt.executeUpdate() == 0)
            throw new Exception();
        pstmt.close();
    }
    
    public void listarClientes(Connection conn, JTextArea j) throws SQLException{
        String selectSQL = "SELECT * FROM CLIENTE ORDER BY NOME ASC";
        Cliente cliente = null;
        System.out.println(selectSQL);
       
        PreparedStatement pstmt = conn.prepareStatement(selectSQL);

        ResultSet rs = pstmt.executeQuery();
        
        while (rs.next()) {
            cliente = new Cliente();
            cliente.setNome(rs.getString("nome"));
            cliente.setCpf(rs.getString("cpf"));
            cliente.setIdade(Integer.parseInt(rs.getString("idade")));
            cliente.setTelefone(rs.getString("telefone"));
            j.append("Nome: " + cliente.getNome() + "\n"+ "CPF:" + cliente.getCpf() + "\n" + "Idade: " + cliente.getIdade() + "\n" + "Telefone: " + cliente.getTelefone() + "\n\n");
            
        }
        rs.close();
        
        pstmt.execute();
        pstmt.close();
    }
    
    public void removerCliente(Connection conn, String cpf) throws Exception{
        String removeSQL = "DELETE FROM CLIENTE";
        removeSQL += " WHERE CPF = '";
        removeSQL += cpf;
        removeSQL += "'";
        
        System.out.println(removeSQL);
            
        PreparedStatement pstmt = conn.prepareStatement(removeSQL);

        if(pstmt.executeUpdate() == 0)
            throw new Exception();
        pstmt.close();
    }
}

