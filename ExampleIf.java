public class ExampleIf {

    public static void main(String[] args) {
        
        int user_age=15;
        String citizenship="indian";
        if (citizenship=="indian" ){
            if (user_age>=18){
            System.out.println("eligible ");
                
            }
            else{
                System.out.println("under age ");
            }
        }
        else{
            System.out.println("not eligible ");
        }
    }
    
}
