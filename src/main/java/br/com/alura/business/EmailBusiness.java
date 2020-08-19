package br.com.alura.business;


import br.com.alura.dao.AgendamentoDao;
import br.com.alura.entity.Agendamento;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class EmailBusiness {

    @Inject
    private AgendamentoDao agendamentoDao;

    public List<Agendamento> todos(){
        return agendamentoDao.todos();
    }


}
