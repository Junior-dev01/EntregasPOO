public class MainTeste {

    public static void main(String[] args) {

        CalculadoraFrete calculadora = new CalculadoraFrete();

        double valorPedido = 100.0;

        try {

            double FreteSedex = calculadora.processarFrete(valorPedido, new FreteSedex());
            System.out.println("Frete Sedex: R$ " + FreteSedex);

            double FretePac = calculadora.processarFrete(valorPedido, new FretePac());
            System.out.println(("Frete Pac " + FretePac));

            double FreteMotoboy = calculadora.processarFrete(valorPedido, new FreteMotoboy());
            System.out.println("Frete Motoboy R$ " + FreteMotoboy);

            double FreteNulo = calculadora.processarFrete(valorPedido, null);
            System.out.println("Frete nulo R$ " + FreteNulo);

        } catch (TipoFreteInvalidoException e) {

            System.out.println("Exceção capturada com sucesso: " + e.getMessage());

        }

    }

}
