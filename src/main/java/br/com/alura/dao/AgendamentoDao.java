package br.com.alura.dao;

import br.com.alura.entity.Agendamento;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import java.util.List;

@Stateless
public class AgendamentoDao {

//    @PersistenceContext
    private EntityManager manager;

    public List<Agendamento> todos(){
        return manager.
                createQuery("select a from Agendamento", Agendamento.class)
                .getResultList();
    }


}
