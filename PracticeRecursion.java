

public class PracticeRecursion {
    public static void printInceasring(int n,int i){
        if(i>=n){
            return;
        }
        System.out.println(i);
        printInceasring(n,i+1);
    }
    public static int Fact(int n){
        if(n==0){
            return 1;
        }
        return n*Fact(n-1);
    }
    public static int naturalSum(int n){
        if(n==1){
            return 1;
        }
        return n+naturalSum(n-1);
    }
    public static int fistOccur(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return fistOccur(arr, key, i+1);
    }
    public static int lastOccur(int[] arr,int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccur(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static boolean arraySorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]<arr[i+1]){
           return arraySorted(arr, i+1);
        }
       return false;
    }
    public static boolean isStirngPalindrome(String str,int sI,int end){
        if (sI>=end) {
            return true;
        }
        if(str.charAt(sI)==str.charAt(end)){
            return isStirngPalindrome(str, sI+1, end-1);
        }
        return false;
    }
    public static int pow(int n,int i){
        if(i==0){
            return 1;
        }
        return n*pow(n, i-1);
    }
    public static void reverseString(String str,int i){
        if(i==str.length()){
            return;
        }
        reverseString(str, i+1);
        System.out.print(str.charAt(i));
    }
    public static int countDigit(int num){
        if(num==0){
            return 0;
        }
        return 1+countDigit(num/10);
    }
    public static int countZero(int num){
        if(num<10){
            return num==0?1:0;
        }
        int digit=num%10;
        if(digit==0){
            return 1+ countZero(num/10);
        }
         return countZero(num/10);
    }
    public static int sumOfDigit(int num,int sum){
        if(num<10){
            return num+sum;
        }
        int digit=num%10;
        return sumOfDigit(num/10, sum+digit);
    }
    public static void printSubset(String str,int sI,int eI){
        if(eI>=str.length()){
            return ;
        }
        System.out.println(str.substring(sI, eI+1));
        printSubset(str, sI, eI+1);
    }
    public static int tillingProblem(int n){
        if(n==1||n==0){
            return 1;
        }
        return tillingProblem(n-1)+tillingProblem(n-2);
    }
    public static String removeDuplicates(String str,StringBuilder newStr,int idx,boolean arr[]){
        if(idx==str.length()){
            return newStr.toString();
        }
        char ch=str.charAt(idx);
        if(arr[ch-'a']==true){
            return removeDuplicates(str, newStr, idx+1, arr);
        }else{
            arr[ch-'a']=true;
            return removeDuplicates(str, newStr.append(ch), idx+1, arr);
        }
    }
    public static int friendPair(int n){
        if(n==1||n==2){
            return n;
        }
        return friendPair(n-1)+friendPair(n-1)*friendPair(n-2);
    }
    public static int permutation(int n,int r){
        if(n==r){
            return 1;
        }
        return n*permutation(n-1, r);
    }
    public static void generateBinary(int arr[],int i){
        if(i==arr.length){
           for(int val:arr)
            System.out.print(val);
            System.out.println();
         return;
        }
       arr[i]=0 ;
        generateBinary(arr, i+1);
        arr[i]=1;
        generateBinary(arr, i+1);
    }
    public static void towerOfHanoi(int n,char Source,char Destination,char Auxilary){
        if(n==1){
            System.out.println("Disk"+n+" Move From "+Source+" to "+Destination);
            return;
        }
        towerOfHanoi(n-1, Source, Auxilary, Destination);
        System.out.println("Disk"+n+" Move From "+Source+" to "+Destination);
        towerOfHanoi(n-1, Auxilary, Destination, Source);
    }
    public static int noOfMoves(int n,char C,char D,char A){
        if(n==1||n==0){
            return n;
        }
        return noOfMoves(n-1, C, A, D)+1+noOfMoves(n-1, A, D, C);
    }
    public static void main(String args[]){
        // printInceasring(10,1);
        // System.out.println(Fact(5));
        // System.out.println(naturalSum(5));
        // int arr[]={1,2,3,4};
        // System.out.println(arraySorted(arr, 0));
        // String str="racar";
        // System.out.println(isStirngPalindrome(str, 0, str.length()-1));
        // System.out.println("First Ocurence in the array");
        // int arr2[]={2,1,3,6,3,4,1,4};
        // System.out.println(fistOccur(arr2, 2, 0));
        // System.err.println("Last Occurence ");
        // System.out.println(lastOccur(arr2, 2, 0));
        // System.out.println(pow(2, 10));
        // System.out.println();
        // reverseString("abc", 0);
        // System.out.println(countDigit(123));
        // printSubset("str", 0, 0);
        // System.out.println(countZero(01110));
        // System.out.println(tillingProblem(4));
        // System.out.println(removeDuplicates("akshay", new StringBuilder(""), 0,new boolean[26]));
        // System.out.println(friendPair(2));
        // System.out.println("Permutation of n=5 & r=3 is " + permutation(5,3));
        System.out.println("Sum Of Digits ="+sumOfDigit(987, 0));
        int arr[]=new int[3];
        generateBinary(arr, 0);
        towerOfHanoi(3, 'A', 'B', 'C');
        System.out.println(noOfMoves(3, 'C', 'D', 'D'));
    }
    
}
