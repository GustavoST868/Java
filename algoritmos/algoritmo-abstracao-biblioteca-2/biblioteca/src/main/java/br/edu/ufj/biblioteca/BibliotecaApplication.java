package br.edu.ufj.biblioteca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ufj.biblioteca.Model.Curso;
import br.edu.ufj.biblioteca.dao.CursoDAO;

@SpringBootApplication
public class BibliotecaApplication implements CommandLineRunner {

	@Autowired
	private CursoDAO cursoDAO;

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Curso c1 = new Curso(1, "ingles", 64);
		Curso c2 = new Curso(2, "Francês", 64);
		Curso c3 = new Curso(3, "Alemão", 64);
		cursoDAO.save(c1);
		cursoDAO.save(c2);
		cursoDAO.save(c3);

	}

}
