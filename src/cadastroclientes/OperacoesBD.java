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
    
    public void salvar(Connection conn, Cliente c, Paciente p)throws SQLException {
        
        String concatena="','";
        String insertSQL="INSERT INTO CLIENTE(nome, cpf, idade,telefone) VALUES('";
        insertSQL+=c.getNome()+concatena;
        insertSQL+=c.getCpf()+concatena;
        insertSQL+=c.getIdade()+concatena;
        insertSQL+=c.getTelefone()+"')";
        
        PreparedStatement pstmt = conn.prepareStatement(insertSQL);
        
        pstmt.execute();
        pstmt.close();
        
        insertSQL ="INSERT INTO PACIENTE(nome_pet, rga, cpf_fk) VALUES('";
        insertSQL+=p.getNome()+concatena;
        insertSQL+=p.getRGA()+concatena;
        insertSQL+=c.getCpf()+"')";
  
        pstmt = conn.prepareStatement(insertSQL);

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

    public void alterarTelefone(Connection conn, String nome, int idade, String telefone, String cpf) throws SQLException, Exception {
        String updateSQL = "UPDATE CLIENTE SET TELEFONE = '";
        updateSQL += telefone;
        updateSQL += "', NOME = '";
        updateSQL += nome;
        updateSQL += "', IDADE = '";
        updateSQL += idade;
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
       
        PreparedStatement pstmt = conn.prepareStatement(selectSQL);
        ResultSet rs = pstmt.executeQuery();
       
        while (rs.next()) {
            cliente = new Cliente();
            cliente.setNome(rs.getString("nome"));
            cliente.setCpf(rs.getString("cpf"));
            cliente.setIdade(Integer.parseInt(rs.getString("idade")));
            cliente.setTelefone(rs.getString("telefone"));
            
            selectSQL="SELECT nome, nome_pet FROM PACIENTE JOIN CLIENTE ON cliente.CPF = '";
            selectSQL+=cliente.getCpf()+ "'";
            selectSQL+=" AND paciente.CPF_FK = '";
            selectSQL+=cliente.getCpf()+ "'";
            
            pstmt = conn.prepareStatement(selectSQL);
            ResultSet rs2 = pstmt.executeQuery();
            
            j.append("Nome: " + cliente.getNome() + "\n"+ "CPF:" + cliente.getCpf() + "\n" + "Idade: " + cliente.getIdade() + "\n" + "Telefone: " + cliente.getTelefone() + "\n");
            
            j.append("Nome do pet: ");
            boolean flag = true;
            while(rs2.next()){
                Paciente p = new Paciente();
                if(flag){
                    p.setNome(rs2.getString("nome_pet"));
                    j.append(p.getNome());
                    flag = false;
                }
                else{
                    j.append(", ");
                    p.setNome(rs2.getString("nome_pet"));
                    j.append(p.getNome());
                }
            }
            j.append("\n\n");
            rs2.close();
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
            
        PreparedStatement pstmt = conn.prepareStatement(removeSQL);

        if(pstmt.executeUpdate() == 0)
            throw new Exception();
        pstmt.close();
    }
    
    public void salvarPet(Connection conn, String cpf, Paciente p)throws SQLException{
        String insertSQL ="INSERT INTO PACIENTE(nome_pet, rga, cpf_fk) VALUES('";
        String concatena="','";
        insertSQL+=p.getNome()+concatena;
        insertSQL+=p.getRGA()+concatena;
        insertSQL+=cpf+"')";
        
        PreparedStatement pstmt = conn.prepareStatement(insertSQL);
        pstmt = conn.prepareStatement(insertSQL);

        pstmt.execute();
        pstmt.close();
    }
    
    public void exibirPets(Connection conn, String cpf, JTextArea j) throws SQLException{
        String selectSQL = "SELECT nome, nome_pet FROM PACIENTE JOIN CLIENTE ON cliente.CPF = '";
        selectSQL+=cpf+ "'";
        selectSQL+=" AND paciente.CPF_FK = '";
        selectSQL+=cpf+ "'";
            
        PreparedStatement pstmt = conn.prepareStatement(selectSQL);
        ResultSet rs = pstmt.executeQuery();

        j.append("Nome do pet: ");
        boolean flag = true;
        while(rs.next()){
            Paciente p = new Paciente();
            if(flag){
                p.setNome(rs.getString("nome_pet"));
                j.append(p.getNome());
                flag = false;
            }
            else{
                j.append(", ");
                p.setNome(rs.getString("nome_pet"));
                j.append(p.getNome());
            }
        }
        j.append("\n\n");
        rs.close();
    }
}

