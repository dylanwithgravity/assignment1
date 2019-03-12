public class CheckSign {
    public static void main(String[] args) {
        int number;
        int len = args.length;

        if(len == 0){
            System.out.println("No arguments were given!");
        } else {
            number = Integer.valueOf(args[0]).intValue();
            if(number > 0) {
                System.out.println("Positive");
            } else {
                System.out.println("Negative");
            }
        }
    }
}
