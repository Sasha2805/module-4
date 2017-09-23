public class Functions {

    public static void main(String[] args) {
        // Call methods
        outputNumbers(5);

        drawRectangle(5,3);
        drawRectangle(3);

        System.out.println(getMax(7,4));
        System.out.println(getMax(7,7.8f));

        outputNumbersRecursion(10);
        drawRectangleRecursion(0,3,5, '+');

        // Второй вариант рекурсивного вывода прямоугольника
        int width = 6, height = 3;
        System.out.println(drawRectangleRecursionTwo(width,width*height));

    }

    public static void outputNumbers(int x) {
        int i = 1;
        while (i <= x){
            System.out.println(i);
            i++;
        }

    }

    public static void drawRectangle(int height, int width) {
        for (int i = 1; i <= height; i++){
            for (int j = 1; j <= width; j++){
                System.out.print("+" + " ");
            }
            System.out.println();
        }

    }

    public static void drawRectangle(int squareWidth) {
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
        if (x > 1) outputNumbersRecursion(x-1);
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

    public static String drawRectangleRecursionTwo(int width, int recArea) {
        if (recArea == 1) return " + ";
        return drawRectangleRecursionTwo(width, recArea-1) + ((recArea % width == 0) ? " + " + "\n" : " + ");

    }

}
