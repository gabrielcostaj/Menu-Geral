package com.br.fasipe.menubase.biomedicina.repository;

import com.br.fasipe.menubase.biomedicina.models.PessoaFis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface PessoaFisRepository extends JpaRepository<PessoaFis, Integer> {

    // --- NOVO: DELETE NATIVO ---
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM PESSOAFIS WHERE IDPESSOAFIS = :id", nativeQuery = true)
    void deletarPorIdNativo(@Param("id") Integer id);
}