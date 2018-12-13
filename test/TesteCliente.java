package testes;

import cadastroclientes.*;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TesteCliente {
    private Cliente c;
    
    @Before
    public void setup() {
       c = new Cliente();
       c.setNome("Carlos da Silva");
       c.setCpf("483.264.555-87");
       c.setTelefone("(15)98233-2417");
       c.setIdade(34);
    }
    
     @Test
     public void Teste1Cliente() { 
        assertEquals("Carlos da Silva", c.getNome());
     }
     
     @Test
     public void Teste2Cliente() { 
        assertEquals("483.264.555-87", c.getCpf());
     }
     
     @Test
     public void Teste3Cliente() { 
        assertEquals("(15)98233-2417", c.getTelefone());
     }
     
     @Test
     public void Teste4Cliente() { 
        assertEquals(34, c.getIdade(), 0);
     }

}