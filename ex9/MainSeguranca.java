public class MainSeguranca {

    public static void main(String[] args) {

        Sede sede1 = new Sede();
        Credencial cred1 = new Credencial("bundinha");

        sede1.registrarPassagemCatraca(cred1);
        sede1.registrarPassagemCatraca(cred1);

        sede1.autorizarEntradaCofre(cred1);
        sede1.autorizarEntradaCofre(cred1);

        sede1.estacionarVeiculo("123-abc", 0);
        sede1.estacionarVeiculo("345-abc", 1);
        sede1.estacionarVeiculo("abc-321", 2);
        sede1.estacionarVeiculo("abc-456", 3);

    }

}
