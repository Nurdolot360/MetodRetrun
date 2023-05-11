public class Main {
    public static void main(String[] args) {
        System.out.println(kill());
        System.out.println(alin());
        System.out.println(suma());
    }

    public static int kill() {
        int a = 0;
        for (int i = 1; i < 100; i++) {
            if ((i % 3) == 0) {
                a += i;
            }
        }
        return a;
    }

    public static int alin() {
        int b = 0;
        for (int j = 1; j < 100; j++) {
            if ((j % 4) == 0) {
                b += j;
            }
        }
        return b;

    }

    public static int suma() {
        int x = 0;
        for (int k = 1; k < 100; k++) {
            if ((k % 5) == 0) {
                x += k;
            }
        }
        return x;
    }
}