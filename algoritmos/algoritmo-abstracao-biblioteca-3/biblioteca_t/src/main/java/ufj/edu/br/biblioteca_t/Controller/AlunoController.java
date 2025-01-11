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

import ufj.edu.br.biblioteca_t.DAO.AlunoDAO;
import ufj.edu.br.biblioteca_t.Model.Aluno;

@RestController
@RequestMapping("/biblioteca/aluno")
public class AlunoController {
    @Autowired
    private AlunoDAO dao;

    @GetMapping("/listar/{id}")
    public Optional<Aluno> buscarUm(@PathVariable int id) {
        return dao.findById(id);

    }

    @GetMapping("/listar")
    public List<Aluno> buscarTodos() {
        return dao.findAll();
    }

    @PostMapping("/gravar")
    public Aluno gravar(@RequestBody Aluno obj) {
        return dao.save(obj);
    }

    @DeleteMapping("/excluir/{id}")
    public void excluir(@PathVariable int id) {
        dao.deleteById(id);
    }

    @PutMapping("/alterar/{id}")
    public Aluno alterar(@PathVariable int id, @RequestBody Aluno obj) {
        obj.setCodigo(id);
        return dao.save(obj);
    }
}
