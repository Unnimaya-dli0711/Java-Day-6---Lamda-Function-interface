package functionalinterface_and_lamdafunctions;

public interface FindArea {
    double area(int radius);
    public static void main(String[] args){
        FindArea findArea=(r)->3.14*r*r;
        double result=findArea.area(2);
        System.out.println(result);
    }
}
