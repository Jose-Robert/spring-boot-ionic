package br.com.cursomc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.cursomc.service.S3Service;


	@SpringBootApplication
	public class CursomcApplication implements CommandLineRunner {
		
		@Autowired
		private S3Service s3Service;
		
		@Value("${path.file.local}")
		private String pathFileLocal;
		
		public static void main(String[] args) {
			SpringApplication.run(CursomcApplication.class, args);
		}
	
		@Override
		public void run(String... args) throws Exception {
			s3Service.uploadFile(pathFileLocal);
		}
	
}
