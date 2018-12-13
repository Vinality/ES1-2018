package testes;

import cadastroclientes.*;
import java.sql.Connection;
import java.sql.SQLException;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TesteOperacoesBD {
    private OperacoesBD o;
    private Paciente p1;
    private Cliente c1, c2;
    private Connection conn;
    
    @Before
    public void setup() throws SQLException, Exception {

       c1 = new Cliente();
       c2 = new Cliente();
       p1 = new Paciente();
       o = new OperacoesBD();
       
       conn = Conexao.getConnection();
       
       c1.setNome("Carlos da Silva");
       c1.setCpf("483.264.555-87");
       c1.setTelefone("(15)98233-2417");
       c1.setIdade(34);
       
       p1.setNome("Sid");
       p1.setRGA("555.555.555-55");
       
       o.salvar(conn, c1, p1);
   
       o.alterarTelefone(conn, c1.getNome(), c1.getIdade(), "(19)95532-2241", c1.getCpf());
       c2 = o.buscarCPF(conn, "483.264.555-87");
       o.removerCliente(conn, "483.264.555-87");
   
    }
     
     @Test
     public void Teste1OperacoesBD() { 
       assertEquals("Carlos da Silva", c2.getNome());
     }  
      @Test
     public void Teste2OperacoesBD() { 
        assertEquals("483.264.555-87", c2.getCpf());
     }
      @Test
     public void Teste3OperacoesBD() { 
      assertEquals("(15)98233-2417", c2.getTelefone());
     }
      @Test
     public void Teste4OperacoesBD() { 
        assertEquals(34, c2.getIdade(), 0);
     }
     

}