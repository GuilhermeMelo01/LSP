package br.com.hcode.solid.lsp;

public class NubankCard implements IPaymentInstrument {






    @Override
    public void validate() throws Exception {
        //Validacao basica
    }

    @Override
    public void collectPayment() {
        System.out.println("Pagamento realizado");
    }
}
