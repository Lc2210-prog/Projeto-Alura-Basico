public class CvsTemp {
    public static void main(String[] args) {
        double temperaturaEmGrausCelsius = 8.1;
        double temperaturaEmFahrenheit = (temperaturaEmGrausCelsius + (temperaturaEmGrausCelsius * 1.8) + 32.);

        String mensagem = String.format("A temperatura de %f celsius é equivalente a temperatura %f Fahrenheit"
                , temperaturaEmGrausCelsius, temperaturaEmFahrenheit);
        System.out.println(mensagem);
        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);
    }

}




