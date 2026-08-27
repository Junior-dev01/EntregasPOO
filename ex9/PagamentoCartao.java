public class PagamentoCartao implements Pagamento {

    @Override
    public void processar(double valor) {

        System.out.println("Valindando limite do cartão para cobrança de R$ " + valor);

    }

}
