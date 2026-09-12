public class MainTeste {

    public static void main(String[] args) {

        Departamento dep1 = new Departamento("TI", "Tecnologia", 3);
        Funcionario funcionario1 = new Funcionario("M001", "Juvenal", dep1);
        Veiculo veiculo1 = new Veiculo("ABC-1234", "HB20", funcionario1);

        SistemaSeguranca sistema = new SistemaSeguranca(2);

        Credencial credencial1 = new Credencial("FFF-999", true, funcionario1);
        Credencial credencial2 = new Credencial("FFF-999", true, funcionario1);

        sistema.registrarCatraca(funcionario1);
        sistema.registrarCatraca(funcionario1);

        sistema.acessarCofre(credencial1);
        sistema.acessarCofre(credencial2);

        sistema.estacionarVeiculo(veiculo1, 0);
        sistema.estacionarVeiculo(veiculo1, 5);

    }
}
