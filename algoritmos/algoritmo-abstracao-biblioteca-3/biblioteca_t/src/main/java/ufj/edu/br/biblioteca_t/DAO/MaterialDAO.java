package ufj.edu.br.biblioteca_t.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import ufj.edu.br.biblioteca_t.Model.Material;

public interface MaterialDAO extends JpaRepository<Material, Integer> {

}
