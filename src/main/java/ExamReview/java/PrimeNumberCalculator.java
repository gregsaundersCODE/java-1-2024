package ExamReview.java;

public class PrimeNumberCalculator {

    public static boolean numIsPrime(int num)   {
        if (num <= 1){
            return false;
        }
        return num == getSmallestDivisor(num);
    }

    public static String getUniquePrimeFactorization(int num)   {
        int i = getSmallestDivisor(num);
        return i == num ? String.valueOf(i) : String.valueOf(i) + " " + getUniquePrimeFactorization(num / i);
        
    }

    private static int getSmallestDivisor(int num){
        if(num <= 1)    {
            return num;
        }
        if(num % 2 == 0)  {
            return 2;
        }
        if(num %3 == 0) {
            return 3;
        }

        for (int i = 6; 1 < Math.sqrt(num); i+=6)   {
            if(num % (i-1) == 0)    {
                return i-1;
            }
            if(num % (i+1) == 0)    {
                return i+1;
            }
        }
        return num;
    }
}