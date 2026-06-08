package br.com.ms_bagagem.bagagem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CheckIn {
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
