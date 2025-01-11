package ufj.edu.br.biblioteca.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import ufj.edu.br.biblioteca.Model.Aluno;

public interface AlunoDAO extends JpaRepository<Aluno, Integer> {

}
