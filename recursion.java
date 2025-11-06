public class recursion{
    public static void increasingOrder(int n,int i){
        if(i>n){
            return;
        }
        System.out.println(i);
        increasingOrder(n, i+1);
    }
    public static int Fact(int n){
        if(n==0){
            return 1;
        }
        int fact=n*Fact(n-1);
        return fact;
    }
    public static void decOrder(int n){
        if(n<=0){
            return;
        }
        System.out.println(n);
        decOrder(n-1);
    }
    public static boolean isPalindrome(int arr[],int sI,int lI){
        if(sI>=lI){
            return true;
        }
        return arr[sI]==arr[lI] && isPalindrome(arr, sI+1, lI-1);
    }
    public static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String args[]){
      //  increasingOrder(10, 1);
       // System.out.println(Fact(5));
       //decOrder(10);
       int arr[]={1,1,9,1,1};
       int n=arr.length-1;
       System.out.println(isPalindrome(arr, 0, n));
       System.out.println(fibo(8));
    }
}