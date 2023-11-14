import java.sql.SQLOutput;

public class Temperatura {
    public static void main(String[] args) {
        double temperaturaCelsius = 31.7;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        String mensagem = String.format("A temperatura em celsius é de %f º, convertido para Fahrenheit a temperatura é de: %f", temperaturaCelsius, temperaturaFahrenheit);

        System.out.println(mensagem);

        int temperaturaCelsiusInteira = (int) (temperaturaCelsius);
        int temperaturaFahrenheitInteira = (int) (temperaturaFahrenheit);
        String temperaturaInteira = String.format("A temperatura " + temperaturaCelsiusInteira + "ºC, convertida em Fahrenheit é iguala á: " + temperaturaFahrenheitInteira + "°F");
        System.out.println(temperaturaInteira);
    }
}
