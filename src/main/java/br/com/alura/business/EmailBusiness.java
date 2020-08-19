package br.com.alura.business;


import javax.ejb.Stateless;
import java.util.Arrays;
import java.util.List;

@Stateless
public class EmailBusiness {


    public List<String> todos(){
        return Arrays.asList("email-01@foofle.com", "email-02@foofle.com");
    }


}
