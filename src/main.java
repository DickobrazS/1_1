public class main {
    public static void main(String[] args) {
        int i;
        int b[];
        int k;
        k = 1;
        b = new int[10];
        for (i = 0; i < 10; i++) {
            b[i] = k;
            k = k + 1;
        }

        for (i = 0; i < 10; i++) {
            System.out.println(b[i]);
        }
        int s = 0;
        for (i = 0; i < 10; i++) {
            s = s + b[i];
        }
        System.out.println("Сумма с помощью цикла for:");
        System.out.println(s);

        int c = 0;
        int l = 9;
        while (l >= 0) {
            c = b[l] + c;
            l = l - 1;
        }
        System.out.println("Сумма с помощью цикла while:");
        System.out.println(c);

        int p = 0;
        int z = 0;
        do {
            p = b[z] + p;
            z = z + 1;
        } while (z < 10);

        System.out.println("Сумма с помощью цикла do while:");
        System.out.println(p);
    }
}

