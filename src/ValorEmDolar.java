public class ValorEmDolar {
    public static void main(String[] args) {
        System.out.println( """
        Welcome to Locker Room
        i will help you in converting our prices on dollar to real
        I’d just like to remind you that I’ll be rounding the prices from USD to BRL.
        """);

        double valorEmDolares = 209.9;
        double cotaçãoDoDólar = 4.94;

        //O exercício não pede, porém fiz algo mais completo e desafiador, poderia ter usado math.round, porém preferi
        // usar somente as ferramentas ensinadas.
        // Também optei por simular uma conversa e usar o int para "arredondar" o valor do produto, sei que o int apenas
        // tira a casa decimal, porém como dito, preferi usar somente as ferramentas ensinadas.

        int valorArredondado = (int) (valorEmDolares * cotaçãoDoDólar);
        String mensagem = "The price of jordan's 5 converted to BRL is rounding BRL $" + valorArredondado;
        System.out.println(mensagem);


        System.out.println("Good news! you earn discount of 15% i'll calculate and check the new price for you");

        double valorEmReais = 1036;
        double percentualDesconto = 15;
        double valorDesconto = (percentualDesconto / 100) * valorEmReais;

        String mensagem2 = "The discount value is " + valorDesconto;

        System.out.println(mensagem2);

        double novoValor = valorEmReais - valorDesconto;

        String mensagem3 = "The new price is " + novoValor;
        System.out.println(mensagem3);





    }
}
