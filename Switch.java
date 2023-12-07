public class Switch {
    public static void main(String[] args) {
        int option = 5;
        switch (option) {
            case 1:
                System.out.printf("Option 1");
                break;
            case 2:
                System.out.printf("Option 2");
                break;
            case 3:
                System.out.printf("Option 3");
                break;
            case 4: case 5: case 6:
                System.out.printf("Option 4,5,6");
                break;
            default:
                System.out.printf("Other Option");
                break;
        }
    }
}
