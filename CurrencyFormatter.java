import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {
    public static void main(String[] args) {
        double totalAmount = 780000;

        String indonesia = NumberFormat.getCurrencyInstance(new Locale("in", "ID")).format(totalAmount);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(totalAmount);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINESE).format(totalAmount);
        String japan = NumberFormat.getCurrencyInstance(Locale.JAPAN).format(totalAmount);
        String korea = NumberFormat.getCurrencyInstance(Locale.KOREA).format(totalAmount);

        System.out.println(totalAmount);

        System.out.println(indonesia);
        System.out.println(france);
        System.out.println(china);
        System.out.println(japan);
        System.out.println(korea);

    }
}
