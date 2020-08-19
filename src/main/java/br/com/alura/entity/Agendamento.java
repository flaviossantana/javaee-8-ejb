package br.com.alura.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Agendamento implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String email;

    @Column
    private Boolean enviado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEnviado() {
        return enviado;
    }

    public void setEnviado(Boolean enviado) {
        this.enviado = enviado;
    }
}
