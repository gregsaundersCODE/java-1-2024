package assignments.A4;

class FibonacciCalc {

    /**
     * a method determines whether a number is a fibonacci number.
     * @param number
     * @return
     */
    public boolean isFibonacciNumber(int number) {
        return isPerfectSquare(5 * number * number + 4) || isPerfectSquare(5 * number * number - 4);
    }

    /**
     * a method that determines whether a number is a fibonnaci number.
     * @param number
     * @return
     */
    private boolean isPerfectSquare(int number) {
        int squareRoot = (int) Math.sqrt(number);
        return squareRoot * squareRoot == number;
    }

    /**
     * Method to get the nth Fibonacci number
     * @param num
     * @return 0,1, fibonacci
     */
    public int getFibonacciNumber(int num) {
        if (num <= 0) return 0;
        if (num== 1) return 1;

        int num1 = 0, num2 = 1, fibonacci = 1;
        for (int i = 2; i <= num; i++) {
            fibonacci = num1 + num2;
            num1 = num2;
            num2 = fibonacci;
        }
        return fibonacci;
    }
}