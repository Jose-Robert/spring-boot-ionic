package br.com.cursomc.dto;

import java.io.Serializable;

import br.com.cursomc.domain.Estado;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EstadoDTO implements Serializable {

    private static final long serialVersionUID = -6585766589290063415L;

    private Integer id;
    private String nome;

    public EstadoDTO() {
    }

    public EstadoDTO(Estado obj) {
	id = obj.getId();
	nome = obj.getNome();
    }
}
