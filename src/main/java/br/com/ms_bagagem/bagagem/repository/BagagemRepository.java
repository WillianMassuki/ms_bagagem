package br.com.ms_bagagem.bagagem.repository;

import br.com.ms_bagagem.bagagem.model.Bagagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BagagemRepository extends JpaRepository<Bagagem, Long> {

    Optional<Bagagem> findByCodigoEtiqueta(String codigoEtiqueta);
}