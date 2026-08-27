public class CalculadoraFrete {

    public double processarFrete(double valorPedido, EstrategiaFrete estrategia) {

        if (estrategia == null) {

            throw new TipoFreteInvalidoException("Estratégia de frete inválida!");

        } else {

            return estrategia.calcular(valorPedido);

        }
    }

}
