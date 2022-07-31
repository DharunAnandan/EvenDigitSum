public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(1234));
    }
    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }

        int sum=0;
        while (number>0) {
             int num=number%10;
            int even=num%2;
            if (even==0) {
                sum += num;
            }
            number/=10;


            }
            return sum;

    }
}
