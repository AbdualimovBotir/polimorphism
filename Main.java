public class Main {
    public static void main(String[] args) {
        MathFunctions math = new MathFunctions();
        System.out.println(math.add(5, 3));
        System.out.println(math.sub(10, 4));
        System.out.println(math.multiply(6, 7));
        System.out.println(math.div(15, 3));
        System.out.println(math.abs(-8));
        System.out.println(math.pow(2, 3));
    }

    public static class MathFunctions {
        public int add(int a, int b) {
            return a + b;
        }

        public int sub(int a, int b) {
            return a - b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }

        public double div(int a, int b) {
            if (b == 0) {
                throw new IllegalArgumentException("Divisor cannot be zero");
            }
            return (double) a / b;
        }

        public int abs(int a) {
            return Math.abs(a);
        }

        public double pow(int base, int exponent) {
            return Math.pow(base, exponent);
        }
    }
}
