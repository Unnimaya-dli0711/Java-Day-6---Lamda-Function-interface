package functionalinterface_and_lamdafunctions;

public interface SumCalculator {
    int sum(int a,int b);
    public static void main(String[] args){
        SumCalculator sumcalculator= (x,y)->x+y;
        int result=sumcalculator.sum(3,5);
        System.out.println(result);
    }
}
