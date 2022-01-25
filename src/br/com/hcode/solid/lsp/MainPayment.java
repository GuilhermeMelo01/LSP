package br.com.hcode.solid.lsp;

public class MainPayment {
    public static void main(String[] args) throws Exception {
//        CreditCard creditCard = new CreditCard();
//        DebitCard debitCard = new DebitCard();
        NunbakRewards rewardsCard = new NunbakRewards();

//        creditCard.validate();
//        creditCard.collectPayment();

//        debitCard.validate();
//        debitCard.collectPayment();

        rewardsCard.validate();
        rewardsCard.collectPayment();
    }
}
