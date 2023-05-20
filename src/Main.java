public class Main {
    public static void main(String[] args) {

        Zadanie1 zadanie1 = new Zadanie1();
        zadanie1.program();

        Zadanie2 zadanie2 = new Zadanie2();
        zadanie2.program();

        int[] inputTable = {10, 5, 20};
        Zadanie3 zadanie3 = new Zadanie3(inputTable);
        zadanie3.program();

        int[] numbers = {4, 4, 3, 3, 5, 5, 5, 6, 6, 6, 6};
        Zadanie4 zadanie4 = new Zadanie4(numbers);
        char[] result = zadanie4.program();
        System.out.println(result);
    }
}