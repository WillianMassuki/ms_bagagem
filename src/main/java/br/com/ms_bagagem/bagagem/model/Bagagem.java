package br.com.ms_bagagem.bagagem.model;

import br.com.ms_bagagem.bagagem.enuns.StatusBagagem;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Bagagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String codigoEtiqueta;

    @Column(nullable = false)
    private String nomePassageiro;

    @Column(nullable = false)
    private UUID voo;

    @Enumerated(EnumType.STRING)
    private StatusBagagem status;

    private String localizacaoAtual;

    private LocalDateTime dataRegistro;

    private double peso;

    private UUID checkIn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoEtiqueta() {
        return codigoEtiqueta;
    }

    public void setCodigoEtiqueta(String codigoEtiqueta) {
        this.codigoEtiqueta = codigoEtiqueta;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public UUID getVoo() {
        return voo;
    }

    public void setVoo(UUID voo) {
        this.voo = voo;
    }

    public StatusBagagem getStatus() {
        return status;
    }

    public void setStatus(StatusBagagem status) {
        this.status = status;
    }

    public String getLocalizacaoAtual() {
        return localizacaoAtual;
    }

    public void setLocalizacaoAtual(String localizacaoAtual) {
        this.localizacaoAtual = localizacaoAtual;
    }

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public UUID getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(UUID checkIn) {
        this.checkIn = checkIn;
    }
}