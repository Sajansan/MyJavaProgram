public class Array2D {
    public static void main(String[] args) {
        // 2D array = an array of arrays

        String[][] cars = {{"Toyota", "BMW", "Audi"}, {"Honda", "Ferrari", "Range rover"}, {"Lamborghini", "Pagani", "Bugatti"}};

//        cars[0][0] = "Toyota";
//        cars[0][1] = "BMW";
//        cars[0][2] = "Audi";
//        cars[1][0] = "Honda";
//        cars[1][1] = "Ferrari";
//        cars[1][2] = "Range rover";
//        cars[2][0] = "Lamborghini";
//        cars[2][1] = "Pagani";
//        cars[2][2] = "Bugatti";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }
    }
}
