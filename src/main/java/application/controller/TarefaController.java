package application.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import application.model.Tarefa;
import application.respository.TarefaRepository;

@Controller
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaRepository tarefaRepository;

    @GetMapping
    @ResponseBody
    public Iterable<Tarefa> list() {
        return tarefaRepository.findAll();
    }

    @PostMapping
    @ResponseBody
    public Tarefa create(@RequestBody Tarefa novaTarefa) {
        return tarefaRepository.save(novaTarefa);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public Tarefa update(@RequestBody Tarefa dados, @PathVariable long id) {
        Optional<Tarefa> resultado = tarefaRepository.findById(id);

        if (resultado.isPresent()) {
            resultado.get().setDescricao(dados.getDescricao());
            return tarefaRepository.save(resultado.get());
        }

        return new Tarefa();
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void delete(@PathVariable long id) {
        tarefaRepository.deleteById(id);
    }
}
