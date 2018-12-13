package testes;

import cadastroclientes.*;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TestePaciente {
    private Paciente p;
    
    @Before
    public void setup() {
       p = new Paciente();
       p.setNome("Sid");
       p.setRGA("483.264.555-87");
    }
    
     @Test
     public void Teste1Paciente() { 
        assertEquals("Sid", p.getNome());
     }
     
     @Test
     public void Teste2Paciente() { 
        assertEquals("483.264.555-87", p.getRGA());
     }

}