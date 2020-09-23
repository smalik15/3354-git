package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide 3 integers to add");
        }
    }

    private static int addArguments(String[] args) {
        
	if (args[0] == '-'){
	return (-1*(Integer.valueOf(args[1] + Integer.valueOf(args[2]));
	}
	return Integer.valueOf(args[0]) + Integer.valueOf(args[1]) + Integer.valueOf(args[2]);
    }
}
