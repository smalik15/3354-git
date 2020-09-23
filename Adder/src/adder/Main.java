package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide two integers to add");
        } catch (IllegalArgumentException e){
	    System.err.println("Please provide a valid argument");
	}
    }

    private static int addArguments(String[] args) {
        return Integer.valueOf(args[0]) + Integer.valueOf(args[1]);
    }
}
