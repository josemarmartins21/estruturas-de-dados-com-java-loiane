public class exe001 {
    public static void main(String[] args) {
        String lista[] = {
            "12",
            "34",
            "2",
            "52",
            "20",
        };

        imprimir(lista, 0);
    }

    public static String regressivo(int num) {
        if (num == 0) {
            System.out.println( 0);
            System.out.println("Fim");
            return "";
        }
        System.out.println(num);
        regressivo(num - 1);
        return "";
    }

    public static int somaAte(int num) {
        if (num == 1) {
            return 1;
        }
        return num + somaAte(num - 1);
    }

    public static String imprimir(String v[], int pos) {
        if (pos == v.length) {
            System.out.println("Fim");
            return "";
        }
        System.out.println(v[pos]);
        imprimir(v, pos + 1);
        return "";
    }
}
