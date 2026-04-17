public class Main{
    public static void main(String[] arg){
        String x ="Water";
        String y = "Salt";
        String temp;

        temp = x;
        x = y;
        y=temp;
        System.out.println("x: "+x);
        System.out.println("y: "+ y);
    }
}