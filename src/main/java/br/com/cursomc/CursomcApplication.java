package br.com.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.cursomc.domain.Categoria;
import br.com.cursomc.domain.Cidade;
import br.com.cursomc.domain.Estado;
import br.com.cursomc.domain.Produto;
import br.com.cursomc.repositories.CategoriaRepository;
import br.com.cursomc.repositories.CidadeRepository;
import br.com.cursomc.repositories.EstadoRepository;
import br.com.cursomc.repositories.ProdutoRepository;

	@SpringBootApplication
	public class CursomcApplication implements CommandLineRunner {
		
		@Autowired
		private ProdutoRepository produtoRepository;
		@Autowired
		private CategoriaRepository categoriaRepository;
		@Autowired
		private CidadeRepository cidadeRepository;
		@Autowired
		private EstadoRepository estadoRepository;
		
		public static void main(String[] args) {
			SpringApplication.run(CursomcApplication.class, args);
		}
	
		@Override
		public void run(String... args) throws Exception {
	
			Categoria cat1 = new Categoria(null, "Informatica");
			Categoria cat2 = new Categoria(null, "Escritorio");
			
			Produto p1 = new Produto(null,"Computador", 2000.00);
			Produto p2 = new Produto(null,"Impressora", 800.00);
			Produto p3 = new Produto(null,"Mouse", 80.00);
			
			p1.getCategorias().addAll(Arrays.asList(cat1));
			p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
			p3.getCategorias().addAll(Arrays.asList(cat1));			
	
			categoriaRepository.save(Arrays.asList(cat1,cat2 ));
			produtoRepository.save(Arrays.asList(p1,p2,p3));
			
			Estado est1 = new Estado(null, "Minas Gerais");
			Estado est2 = new Estado(null, "São Paulo");
			
			Cidade c1 = new Cidade(null,"Uberlândia", est1);
			Cidade c2 = new Cidade(null,"São Paulo", est2);
			Cidade c3 = new Cidade(null,"Campinas", est2);
			
			est1.getCidades().addAll(Arrays.asList(c1));
			est2.getCidades().addAll(Arrays.asList(c2,c3));
			
			estadoRepository.save(Arrays.asList(est1,est2));
			cidadeRepository.save(Arrays.asList(c1,c2,c3));
	
		}
	
}