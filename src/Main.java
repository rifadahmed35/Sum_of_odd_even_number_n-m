public class Main {
    public static void main(String[] args) {
        int i, sum=0;
        for(i=1; i<=10; i++){
            if (i%2==0){
                continue;
            }
            sum = sum + i; }
        {
            System.out.println(sum);
        }
    }
}