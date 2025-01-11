package ufj.edu.br.biblioteca_t.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ufj.edu.br.biblioteca_t.DAO.MaterialDAO;
import ufj.edu.br.biblioteca_t.Model.Material;

@RestController
@RequestMapping("/biblioteca/material")
public class MaterialController {
    @Autowired
    private MaterialDAO dao;

    @GetMapping("/listar/{id}")
    public Optional<Material> buscarUm(@PathVariable int id) {
        return dao.findById(id);
    }

    @GetMapping("/listar")
    public List<Material> buscarTodos() {
        return dao.findAll();

    }

    @PostMapping("/gravar")
    public Material gravar(@RequestBody Material obj) {
        return dao.save(obj);
    }

    @DeleteMapping("/excluir/{id}")
    public void excluir(@PathVariable int id) {
        dao.deleteById(id);
    }

    @PutMapping("/alterar/{id}")
    public Material alterar(@PathVariable int id, @RequestBody Material obj) {
        obj.setCodigo(id);
        return dao.save(obj);
    }
}
