public class Main {
    public static void main(String[] args) {
       int evenCount = 0;
       int oddCount = 0;

       for (int i = 1; i<= 100; i++){
           if (i % 2 == 0){
               evenCount++;
           }else {
               oddCount++;
           }
       }
       System.out.printf("Between(including) 1 and 100 there are %d even and %d odd numbers",evenCount, oddCount);
    }
}
