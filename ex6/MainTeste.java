public class MainTeste {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("123.456.789-00", "Joao Silva", "joao@email.com");
        Cliente cliente2 = new Cliente("123.456.789-00", "Joao Pedro Silva", "joao.pedro@email.com");

        if (cliente1.equals(cliente2)) {
            System.out.println("CPF já cadastrado!!");

        } else {
            System.out.println("Cliente cadastrado com sucesso!");

        }

        ContaBancaria conta1 = new ContaBancaria("1", cliente1, 50.0);

        boolean resultado = conta1.sacar(50.0);
        System.out.println("Resultado do saque " + resultado);

        int TotalContas = Agencia.getTotalContasAbertas();

        System.out.println("Total de contas abertas: " + TotalContas);
    }

}
