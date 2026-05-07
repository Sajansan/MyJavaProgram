public class StringMethods {
    public static void main(String[] args) {
        // String = a reference data type that can store one or more characters
        //            reference data types have access to useful methods

        String name = "Sajan   ";

        // boolean result = name.equalsIgnoreCase("Saan");
        // int result = name.length();
        // char result = name.charAt(4);
        // int result = name.indexOf("j");
        // boolean result = name.isEmpty();
        // String result = name.toUpperCase();
        // String result = name.toLowerCase();
        // String result = name.trim();
        String result = name.replace('a', 'A');

        System.out.println(result);
    }
}
