package homework1SDA;

public class Ex7_10 {

    // 7. Napisz funkcję tworzącą ciąg arytmetyczny o podanych: długości,
    //pierwszym elemencie, różnicy ciągu

    public static int[] createArithmeticSeries(int lenght, int firstElement, int seriesDifference) {

        int[] arithmeticSeries = new int[lenght];
        arithmeticSeries[0] = firstElement;
        for (int i = 1; i < lenght; i++) {
            arithmeticSeries[i] = arithmeticSeries[i - 1] + seriesDifference;
        }
        System.out.print("Ciąg arytmetyczny: ");
        Ex4_6.arrayPrinter(arithmeticSeries);
        return arithmeticSeries;
    }

    //8. Sprawdź, czy podany ciąg liczb jest ciągiem arytmetycznym
    // r = (an - a1)/(n-1)
    public static boolean isThatSeries(int[] exampleTab) {

        if (exampleTab.length < 2) return false;

        for (int i = 1; i < exampleTab.length; i++) {
            int isCorect = exampleTab[exampleTab.length - 1] - exampleTab[0] / exampleTab.length - 1;
            int r = exampleTab[i] - exampleTab[i - 1];
            if (r != isCorect) return false;
            break;
        }
        return true;
    }

    //9. Załóżmy, że nie wiesz, że istnieje operator %, a potrzebujesz wylicz resztę z dzielenia
    //dwóch liczb. Napisz własną wersję funkcji modulo.

    public static double myModulo(int a, int b) {
        System.out.println("Ile wynosi reszta z dzielenia " + a + " / " + b + " ?");
        int result = a / b;
        double realResult = (double) a / b;
        double modulo = realResult - result;
        return modulo;
    }

    //10. Właśnie się dowiedziałeś, że istnieje operator %. Napisz funkcję, która będzie sprawdzała,
    //czy napisana w poprzednim zadaniu funkcja zwraca dokładnie takie same wyniki jak ten
    //operator. Przetestuj dla różnych przypadków.

    public static boolean comparisionModuloAndMyModulo(int[] testNumb, int b) {
        for (int num : testNumb) {

            double myModulo = Ex7_10.myModulo(num, b);
            double modulo = num % b;
            if (myModulo == modulo) return true;
        }
        return false;
    }


    public static void main(String[] args) {


    }
}
