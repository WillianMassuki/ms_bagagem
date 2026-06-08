package br.com.ms_bagagem.bagagem.dto;

import java.time.LocalDateTime;

public record BagagemResponseDTO(String codigoEtiqueta, String nomePassageiro, String voo,String localizacaoAtual,  LocalDateTime dataRegistro) {

}