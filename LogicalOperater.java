/**
 * LogicalOperater
 */
public class LogicalOperater {

    public static void main(String[] args){
    int x,y,z;
    x=100;
    y=200;
    z=50;
    boolean answer;
    answer = x>y && y<z;
    System.out.println(answer);
    answer = x>y || y<z;
    System.out.println(answer);
    answer = ! (x>y && y<z);
    System.out.println(answer);
}
}