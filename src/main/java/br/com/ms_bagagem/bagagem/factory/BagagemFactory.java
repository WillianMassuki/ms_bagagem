package br.com.ms_bagagem.bagagem.factory;

import br.com.ms_bagagem.bagagem.dto.BagagemRequestDTO;
import br.com.ms_bagagem.bagagem.enuns.StatusBagagem;
import br.com.ms_bagagem.bagagem.model.Bagagem;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
public class BagagemFactory {

    public static Bagagem criar(BagagemRequestDTO dto) {
        Bagagem bagagem = new Bagagem();

        bagagem.setNomePassageiro(dto.nomePassageiro());
        bagagem.setVoo(dto.voo());

        // Campos gerados automaticamente
        bagagem.setCodigoEtiqueta(gerarCodigoEtiqueta());
   //     bagagem.setStatus(StatusBagagem.REGISTRADA);
        bagagem.setDataRegistro(LocalDateTime.now());

        return bagagem;
    }

    private static String gerarCodigoEtiqueta() {
        return UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }
}
