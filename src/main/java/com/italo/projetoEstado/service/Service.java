package com.italo.projetoEstado.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.italo.projetoEstado.dto.EstadoDTO;
import com.italo.projetoEstado.model.Estado;
import com.italo.projetoEstado.repository.EstadoRepository;

@org.springframework.stereotype.Service
public class Service {
	@Autowired
	private EstadoRepository repository;

	@Transactional(readOnly = true)
	public EstadoDTO getState(Long id) {
		Optional<Estado> state = repository.findById(id);
		Estado local = state.get();
		if (!state.isPresent()) {
			throw new RuntimeException();
		}
		return new EstadoDTO(local);
	}

	public List<Estado> getStates() {
		return null;
	}
}
