package ufj.edu.br.biblioteca_t;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ufj.edu.br.biblioteca_t.DAO.AlunoDAO;
import ufj.edu.br.biblioteca_t.DAO.EscolaDAO;
import ufj.edu.br.biblioteca_t.DAO.MaterialDAO;
import ufj.edu.br.biblioteca_t.Model.Aluno;
import ufj.edu.br.biblioteca_t.Model.Escola;
import ufj.edu.br.biblioteca_t.Model.Material;

@SpringBootApplication
public class BibliotecaTApplication implements CommandLineRunner {
	@Autowired
	private AlunoDAO alunoDAO;
	@Autowired
	private EscolaDAO escolaDAO;
	@Autowired
	private MaterialDAO materialDAO;

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaTApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Aluno a = new Aluno(1, "Tiago", 20);
		Escola e = new Escola(1, "CNSA");
		Material m = new Material(1, "Mateirial 1");
		alunoDAO.save(a);
		escolaDAO.save(e);
		materialDAO.save(m);
	}

}
