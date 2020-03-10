public class Test4{
  public static int f(int n){
  int reverse = 0;
  while(n != 0){
    reverse = reverse * 10;
    reverse = reverse + n % 10;
    n = n/10;
  }
  return reverse;
  }
  public static void main(String [] args){
      int num = 123;
    System.out.println(f(num));
  }
}
