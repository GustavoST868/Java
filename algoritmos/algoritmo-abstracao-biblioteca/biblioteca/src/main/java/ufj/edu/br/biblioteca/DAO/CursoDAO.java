package ufj.edu.br.biblioteca.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import ufj.edu.br.biblioteca.Model.Curso;

public interface CursoDAO extends JpaRepository<Curso, Integer> {

}
