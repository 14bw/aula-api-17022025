package application.respository;

import application.model.Tarefa;
import org.springframework.data.repository.CrudRepository;


public interface TarefaRepository extends CrudRepository<Tarefa, Long> {
    
}
