package br.com.ms_bagagem.bagagem.service;

import br.com.ms_bagagem.bagagem.dto.BagagemRequestDTO;
import br.com.ms_bagagem.bagagem.enuns.StatusBagagem;
import br.com.ms_bagagem.bagagem.exceptions.ResourceNotFoundException;
import br.com.ms_bagagem.bagagem.factory.BagagemFactory;
import br.com.ms_bagagem.bagagem.model.Bagagem;
import br.com.ms_bagagem.bagagem.repository.BagagemRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class BagagemService {

    private final BagagemRepository repository;

    public BagagemService(BagagemRepository repository) {
        this.repository = repository;
    }

    // RF23 + RF24
    public Bagagem registrarBagagem(BagagemRequestDTO dto) {

        Bagagem bagagem = BagagemFactory.criar(dto);
        return repository.save(bagagem);

    }

    ;

    // RF24
    private String gerarEtiqueta() {
        return UUID.randomUUID().toString();
    }

    // RF25
    public Bagagem rastrear(String codigo) {

        return repository.findByCodigoEtiqueta(codigo)
                .orElseThrow(() -> new ResourceNotFoundException("Bagagem não encontrada"));
    }

    // RF25
    public Bagagem atualizarLocalizacao(String codigo, String localizacao) {
        Bagagem bagagem = repository.findByCodigoEtiqueta(codigo)
                .orElseThrow(() -> new ResourceNotFoundException("Bagagem não encontrada"));

        bagagem.setLocalizacaoAtual(localizacao);
     //   bagagem.setStatus(StatusBagagem.EM_TRANSITO);

        return repository.save(bagagem);
    }

    // RF26
    public Bagagem registrarExtravio(String codigo) {
        Bagagem bagagem = repository.findByCodigoEtiqueta(codigo)
                .orElseThrow(() -> new ResourceNotFoundException("Bagagem não encontrada"));

    //    bagagem.setStatus(StatusBagagem.EXTRAVIADA);

        return repository.save(bagagem);
    }

}