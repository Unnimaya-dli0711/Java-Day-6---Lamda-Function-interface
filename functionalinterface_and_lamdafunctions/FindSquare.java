package functionalinterface_and_lamdafunctions;

interface Square{
    int calculate(int number);
    default void display(){
        System.out.println("Result computed");
    }
}
public class FindSquare {
    public static void main(String[] args){
        int number=5;
        Square square=(int x)->x*x;
        int answer=square.calculate(number);
        System.out.println(answer);
        square.display();
    }
}
