package desafiosemanal.model;

import java.io.Serializable;

public class Pessoa implements Serializable {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
