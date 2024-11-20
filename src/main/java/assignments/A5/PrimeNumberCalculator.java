package assignments.A5;

public class PrimeNumberCalculator {

    /**
     * method that determines if numbers are prime.
     * @param number
     * @return false or true
     */
    public static boolean isPrimenumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int num = 2; num <= Math.sqrt(number); num++) {
            if (number % num == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * a method that gets the prime factorization of numbers and
     * adds them to a string to be displayed.
     * @param number
     * @return string
     */
    @org.jetbrains.annotations.NotNull
    public static String getUniquePrimeFactorization(int number) {
        if (number <= 1) {
            return "No prime factorization for numbers that are <= 1.";
        }

        StringBuilder factorsString = new StringBuilder();
        for (int num = 2; num <= number; num++) {
            while (number % num == 0) {
                factorsString.append(num).append("*");
                number /= num;
            }
        }
        if (factorsString.length() > 0) {
            factorsString.setLength(factorsString.length() - 1);
        }
        return factorsString.toString();
    }
}
