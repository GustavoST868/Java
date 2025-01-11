package ufj.edu.br.biblioteca.Controller;

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
import ufj.edu.br.biblioteca.DAO.CursoDAO;
import ufj.edu.br.biblioteca.Model.Curso;

@RestController
@RequestMapping("/biblioteca/curso")
public class CursoController {
    @Autowired
    private CursoDAO dao;

    @GetMapping("/listar/{id}")
    public Optional<Curso> buscarUm(@PathVariable int id) {
        return dao.findById(id);
    }

    @GetMapping("/listar")
    public List<Curso> buscarTodos() {
        return dao.findAll();

    }

    @PostMapping("/gravar")
    public Curso gravar(@RequestBody Curso obj) {
        return dao.save(obj);
    }

    @DeleteMapping("/excluir/{id}")
    public void excluir(@PathVariable int id) {
        dao.deleteById(id);
    }

    @PutMapping("/alterar/{id}")
    public Curso alterar(@PathVariable int id, @RequestBody Curso obj) {
        obj.setCodigo(id);
        return dao.save(obj);
    }

}
