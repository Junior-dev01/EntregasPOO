package br.com.techcorp.main;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ControleDeAcesso {

    public List<Funcionario> listaRegistro = new ArrayList<>();
    public Set<Funcionario> autorizadosSalaSegura = new HashSet<>();
        
    


    public void registrarPassagem(Funcionario f){

        this.listaRegistro.add(f);

    }

   public void concederAcessoSala(Funcionario f){

        if(autorizadosSalaSegura.add(f)){

            System.out.println("Acesso permitido!");

        }else{

            System.out.println("Acesso negado! Matricula ja registrada");

        }
   }
}

  

  

