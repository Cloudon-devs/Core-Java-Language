package assignments;

public class CurrencyConvertor {
    int rupee = 63;
    int real = 3; 
    int chilean_peso = 595;
    int dirham = 3;
    int mexican_peso = 18;
    int _yen = 107;
    int $australian = 2; 
    int Rupee = 63;

    public static void printCurrencies(String name,  int value) {
        System.out.println(name + ": " + value);
    }

    public static void main(String[] args) {
        CurrencyConvertor cc = new CurrencyConvertor();

        printCurrencies("Rupee", cc.rupee);
        printCurrencies("Real", cc.real);
        printCurrencies("Chilean Peso", cc.chilean_peso);
        printCurrencies("Dirham", cc.dirham);
        printCurrencies("Mexican Peso", cc.mexican_peso);
        printCurrencies("Yen", cc._yen);
        printCurrencies("Australian Dollar", cc.$australian);
        printCurrencies("Rupee", cc.Rupee);
    }
}
