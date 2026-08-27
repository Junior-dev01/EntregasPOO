public class MainPagamento {

    public static void main(String[] args) {

        ProcessadorPagamento processador = new ProcessadorPagamento();

        Pagamento pix = new PagamentoPix();
        Pagamento cartao = new PagamentoCartao();

        processador.finalizarCompra(100, pix);
        processador.finalizarCompra(250, cartao);

    }
}
