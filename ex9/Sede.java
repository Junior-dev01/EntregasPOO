import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sede {

    private String[] vagasGaragem = new String[3];
    private List<Credencial> historicoCatraca = new ArrayList<>();
    private Set<Credencial> acessoCofre = new HashSet<>();

    public void estacionarVeiculo(String placa, int vaga) {

        vagasGaragem[vaga] = placa;

    }

    public void registrarPassagemCatraca(Credencial c) {

        historicoCatraca.add(c);

    }

    public void autorizarEntradaCofre(Credencial c) {

        if (acessoCofre.add(c)) {

            System.out.println("Acesso ao cofre liberado!");

        } else {

            System.out.println("Alerta de segurança! Tentativa de acesso duplicada!");

        }

    }

}
