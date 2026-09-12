public class FreteSedex implements EstrategiaFrete {

    @Override
    public double calcular(double valorPedido) {

        double valorFrete = valorPedido * 0.10;
        return valorFrete;

    }

}
