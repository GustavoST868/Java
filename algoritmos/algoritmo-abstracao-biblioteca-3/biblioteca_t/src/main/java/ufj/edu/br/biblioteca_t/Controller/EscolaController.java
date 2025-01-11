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

import ufj.edu.br.biblioteca_t.DAO.EscolaDAO;
import ufj.edu.br.biblioteca_t.Model.Escola;

@RestController
@RequestMapping("/biblioteca/escola")
public class EscolaController {
    @Autowired
    private EscolaDAO dao;

    @GetMapping("/listar/{id}")
    public Optional<Escola> buscarUm(@PathVariable int id) {
        return dao.findById(id);
    }

    @GetMapping("/listar")
    public List<Escola> buscarTodos() {
        return dao.findAll();
    }

    @PostMapping("/gravar")
    public Escola gravar(@RequestBody Escola obj) {
        return dao.save(obj);

    }

    @DeleteMapping("/excluir/{id}")
    public void excluir(@PathVariable int id) {
        dao.deleteById(id);
    }

    @PutMapping("/alterar/{id}")
    public Escola alterar(@PathVariable int id, @RequestBody Escola obj) {
        obj.setCodigo(id);
        return dao.save(obj);
    }
}
