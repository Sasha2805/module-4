import java.util.Scanner;

public class AdditionalTask {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Call methods
        choiceOfTask(in);
        confirmation(in);

        in.close();

    }

    public static void choiceOfTask(Scanner in) {
        System.out.print("Введите номер задачи: ");
        int number = in.nextInt();
        if (number == 1) outputNumbers(in);
        if (number == 2) drawRectangle(in);
        if (number == 3) drawSquare(in);
        if (number == 4) {
            System.out.print("Введите a: ");
            int a = in.nextInt();
            System.out.print("Введите b: ");
            if (in.hasNextInt()) {
                System.out.println("Максимальное число: " + getMax(a, in.nextInt()));
            }else {
                System.out.println("Максимальное число: " + getMax(a,in.nextFloat()));
            }
        }
        if (number == 5) {
            System.out.print("Введите x: ");
            int x = in.nextInt();
            outputNumbersRecursion(x);
        }
        if (number == 6) {
            System.out.print("Введите высоту: ");
            int height = in.nextInt();
            System.out.print("Введите ширину: ");
            int width = in.nextInt();
            drawRectangleRecursion(0, height, width, '+');
        }

    }

    public static void confirmation(Scanner in) {
        System.out.print("Если желаете продожить решение задач, введите \"yes\": ");
        boolean confirm = in.next().equals("yes");
        if (confirm) {
            choiceOfTask(in);
            confirmation(in);
        }

    }

    public static void outputNumbers(Scanner in) {
        System.out.print("Введите n: ");
        int n = in.nextInt();
        int i = 1;
        while (i <= n){
            System.out.println(i);
            i++;
        }

    }

    public static void drawRectangle(Scanner in) {
        System.out.print("Введите высоту: ");
        int height = in.nextInt();
        System.out.print("Введите ширину: ");
        int width = in.nextInt();
        for (int i = 1; i <= height; i++){
            for (int j = 1; j <= width; j++){
                System.out.print("+" + " ");
            }
            System.out.println();
        }

    }

    public static void drawSquare(Scanner in) {
        System.out.print("Введите ширину квадрата: ");
        int squareWidth = in.nextInt();
        for (int i = 1; i <= squareWidth; i++){
            for (int j = 1; j <= squareWidth; j++){
                System.out.print("+" + " ");
            }
            System.out.println();
        }

    }

    public static int getMax(int a, int b) {
        int max;
        max = a > b ? a : b;
        return max;

    }

    public static float getMax(int a, float b) {
        float max;
        max = a > b ? a : b;
        return max;

    }

    public static void outputNumbersRecursion(int x) {
        if (x > 1) outputNumbersRecursion(x - 1);
        System.out.println(x);

    }

    public static void drawRectangleRecursion(int i, int height, int width, char symbol) {
        if (height >= 1 && width >= 1){
            System.out.print(symbol + " ");
            drawRectangleRecursion(i+1, height, width-1, symbol);
        }
        if (width == 0) {
            System.out.println();
            drawRectangleRecursion(0, height - 1, i, symbol);
        }

    }

}
