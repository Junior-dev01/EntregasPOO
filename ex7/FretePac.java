public class FretePac implements EstrategiaFrete {

    @Override
    public double calcular(double valorPedido) {

        double valorFrete = valorPedido * 0.05;
        return valorFrete;

    }

}
