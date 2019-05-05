package br.com.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cursomc.domain.Categoria;
import br.com.cursomc.domain.Pagamento;
import br.com.cursomc.domain.Pedido;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

	
}
