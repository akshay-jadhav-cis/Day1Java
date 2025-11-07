class StringOperation{
    StringOperation(){
        System.out.println("String Operation constructor called");
    }
    public void operation(String str){
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]+" ");
        }
        String str1=str.toUpperCase();
        System.out.println(str1);
        System.out.println(str.concat(" jadhav"));
        System.out.println(str);
    }
    public boolean  checkPalindrome(String str){
        int si=0;
        int ei=str.length()-1;
        while(si<ei){
            if(str.charAt(si)!=str.charAt(ei)){
                return false;
            }
            si++;
            ei--;
        }
        return true;
    }
    public int findDistance(String str){
        if(str.length()==0){
            return -1;
        }
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='W'){
                x--;
            }else if(ch=='E'){
                x++;
            }else if(ch=='N'){
                y++;
            }
            else{
                y--;
            }
        }
        return (int )Math.sqrt((x*x+y*y));
    }
    public String toUpperCased(String str){
        StringBuilder s1=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        s1.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                s1.append(str.charAt(i));
                i++;
                s1.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                s1.append(str.charAt(i));
            }
        }
        return  s1.toString();
    }
}
class Day2Java{

    public static void main(String args[]){
        System.out.println("Hello World Todays Topic Is String");
        StringOperation str=new StringOperation();
        str.operation("akshay");
        System.out.println("String Is Palindrome "+str.checkPalindrome("bab"));
        System.out.println(str.findDistance("wneenesennn".toUpperCase()));
        System.out.print(str.toUpperCased("i m akshay"));
    }
    
}