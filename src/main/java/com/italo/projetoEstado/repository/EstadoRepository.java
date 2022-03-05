package com.italo.projetoEstado.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.italo.projetoEstado.model.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long> {
}
