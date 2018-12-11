/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroclientes;

/**
 *
 * @author viniciuscrepschi, pedro11
 */
public class Paciente {
    
    public String getRGA() {
        return rga;
    }

    public void setRGA(String RGA) {
        this.rga = RGA;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    private String nome;
    private String rga;
}
