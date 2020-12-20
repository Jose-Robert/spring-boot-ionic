package br.com.cursomc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cursomc.domain.Estado;
import br.com.cursomc.repositories.EstadoRepository;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository repo;

    public List<Estado> findAll() {
	return repo.findAllByOrderByNome();
    }
}