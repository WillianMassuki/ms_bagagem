package br.com.ms_bagagem.bagagem.dto;

import java.util.UUID;

public record BagagemRequestDTO(String nomePassageiro, UUID voo ) {

}