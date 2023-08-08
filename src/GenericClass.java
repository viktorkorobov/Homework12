public class GenericClass<T extends Number> {

    private T num1;
    private T num2;

    private int operator;

    public GenericClass(T num1, T num2, int operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator=operator;
        switch (operator) {

            // performs addition between numbers
            case 1:
                System.out.println(num1 + " + " + num2);
                break;

            // performs subtraction between numbers
            case 2:
                System.out.println(num1 + " - " + num2);
                break;

            // performs multiplication between numbers
            case 3:
                System.out.println(num1 + " * " + num2);
                break;

            // performs division between numbers
            case 4:
                System.out.println(num1 + " / " + num2);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
    }
}

