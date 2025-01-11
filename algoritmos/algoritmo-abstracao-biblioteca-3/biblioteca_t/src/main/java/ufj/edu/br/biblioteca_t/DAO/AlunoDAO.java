package ufj.edu.br.biblioteca_t.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import ufj.edu.br.biblioteca_t.Model.Aluno;

public interface AlunoDAO extends JpaRepository<Aluno, Integer> {

}
