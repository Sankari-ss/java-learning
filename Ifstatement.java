public class Ifstatement {
   public static void main(String[] args) {
    int a,b,c;
    a=10;
    b=50;
    c=1000;
    
    if (b<a && c<a){
        System.out.println("a is greater");
    
    }
    else if (b>a && b>c){
        System.out.println("b is greater");
    }
    else{
        
        System.out.println("c is greater");
    }
    



    if (a<b ){
        System.out.println("a is smaller");
        if (a<c){
            System.out.println("a is smaller");
        }
    }
    else if (b<a && b<c){
        if (b<c &&){
            System.out.println("b is smaller");
        }
       
    }
    else if (c<a && c<b){
    System.out.println("c is smaller");
    }
    
   
}

}