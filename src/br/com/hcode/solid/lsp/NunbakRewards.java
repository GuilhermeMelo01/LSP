package br.com.hcode.solid.lsp;

public class NunbakRewards implements IPaymentInstrument{


    @Override
    public void validate() throws Exception {
        System.out.println("Checkando limite no cartao Rewards!");
        System.out.println("Limite disponivel no cartao Rewards!");

    }

    @Override
    public void collectPayment() {
        System.out.println("Pagamento Realizdo com sucesso!");
        System.out.println("pontuacao do cartao rewards creditada!");
    }
}
