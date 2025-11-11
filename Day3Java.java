import java.util.HashMap;

class Day3Java{
    public static int findMissingNumber(int arr[]){
        int sum=0;
        int currSum=0;
        int n=arr.length+1;
        sum=n*(n+1)/2;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
        }
        return sum-currSum;
    }
    public static String compression(String str){
        HashMap<Character,Integer>map=new HashMap<>();
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i), 0)+1);
        }
        for(char ch:map.keySet()){
            sb.append(ch).append(map.get(ch));
        }

        return sb.toString();
    }
    public static int kadanesAlgo(int arr[]){
        int currSum=0;
        int maxSum=0;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            maxSum=Math.max(currSum,maxSum);
            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }
    public static void moveZeros(int arr[]){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                arr[i]=arr[j];
                i++;
            }
        }
        while(i<arr.length){
            arr[i]=0;
        }
    }
    public static void mergeSort(int arr[],int si,int ei){
        if(si<ei){
        int mid=si+(ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
}
    public static void merge(int arr[],int si,int mid,int ei){
        int n1=mid-si+1;
        int n2=ei-mid;
        int lSize[]=new int[n1];
        int rSize[]=new int[n2];
        for(int i=0;i<lSize.length;i++){
            lSize[i]=arr[si+i];
        }
        for(int i=0;i<rSize.length;i++){
            rSize[i]=arr[mid+1+i];
        }
        int i=0,j=0;
        int k=si;
        while (i<lSize.length && j<rSize.length) { 
            if(lSize[i]<=rSize[j]){
                arr[k]=lSize[i];
                k++;
                i++;
            }else{
                arr[k]=rSize[j];
                k++;
                j++;
            }
        }
        while(i<lSize.length){
            arr[k]=lSize[i];
                k++;
                i++;
        }
        while(j<rSize.length){
            arr[k]=rSize[j];
                k++;
                j++;
        }
    }
    public static void reverseArr(int arr[],int key){
        if(arr.length==0){
            return;
        }
        int si=0;
        int ei=arr.length-1;
       key=key%ei+1;
       System.out.println(key);
        reverse(arr,si,ei);
        reverse(arr,si,key-1);
        reverse(arr, key,ei);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"   ");
        }
    }
    public static void countFreq(String str){
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i), 0)+1);
        }
        for(char ch:map.keySet()){
            System.out.println(ch+" = "+map.get(ch));
        }
    }
    public  static void reverse(int arr[],int si,int ei){
        while(si<ei){
            int temp=arr[si];
            arr[si]=arr[ei];
            arr[ei]=temp;
            si++;
            ei--;
        }
    }
    public static int maxDiff(int arr[][]){
        int firstDiagonalSum=0;
        int secondDiagonalSum=0;
        for(int i=0;i<arr.length;i++){
            firstDiagonalSum=arr[i][i];
            secondDiagonalSum=arr[i][arr.length-i-1];
        }
        return Math.abs(firstDiagonalSum-secondDiagonalSum);
    }
    public static void printArr(int arr[]){
        for (int idx = 0; idx < arr.length; idx++) {
           System.out.print(arr[idx]+"    ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        int arr[]={1,2,3,5,6};
        System.out.println(findMissingNumber(arr));
        System.out.println(compression("aaabbbcc"));
        int arr2[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(maxDiff(arr2));
        int arr3[]={1,2,3,4,5,7};
        reverseArr(arr3, 3);
        countFreq("akshay");
    }
}