public class BitwiseOperater {

    public static void main(String[] args){
        int a,b,result,n;
        a=5;
        b=10;
        n=2;
        result=a^b;
       System.out.println(result);
       result=~a;
       System.out.println(result);
       result=a<<n;
       System.out.println(result);
       result=a>>n;
       System.out.println(result);

    }
}