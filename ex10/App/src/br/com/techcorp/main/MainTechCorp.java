package br.com.techcorp.main;
public class MainTechCorp {

    public static void main(String[] args) {
        

    ControleDeAcesso controle = new ControleDeAcesso(); 

    Funcionario func1 = new Funcionario("001", "Alice", null);
    Funcionario func2 = new Funcionario("001", "Alice duplicada", null);


    controle.registrarPassagem(func1);
    controle.registrarPassagem(func2);

    controle.concederAcessoSala(func1);
    controle.concederAcessoSala(func2);





    }

  
}
