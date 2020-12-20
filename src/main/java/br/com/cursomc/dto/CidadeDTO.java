package br.com.cursomc.dto;

import java.io.Serializable;

import br.com.cursomc.domain.Cidade;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CidadeDTO implements Serializable {
    
    private static final long serialVersionUID = 2613926061257992082L;
    
    private Integer id;
    private String nome;

    public CidadeDTO() {
    }

    public CidadeDTO(Cidade obj) {
	id = obj.getId();
	nome = obj.getNome();
    }

}
