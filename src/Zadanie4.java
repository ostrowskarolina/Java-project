public class Zadanie4 {

    private final int[] numbers;
    private static final String[] keyboard = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};


    public Zadanie4(int[] numbers) {
        this.numbers = numbers;
    }

    public char[] program() {
        StringBuilder sb = new StringBuilder();
        int prevNumber = -1;

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];

            if (number == 1 || number == 0) {
                System.out.println("nacisnales 1 lub 0 a tam nie ma zadnych cyfr");
            }
            else if(number == prevNumber){
                System.out.println("litery z tej samej cyfry nie moga sie po sobie powtarzac");
                break;
            }
            else {String letters = keyboard[number - 2];

                int count = letters.length();
                int howManyTimesClicked = 1;
                while(count>1 && i + count <numbers.length){

                    if(i + howManyTimesClicked > numbers.length) {
                        break;
                    }
                    int numberToCheck = numbers[i+count-1];

                    if (numberToCheck == number){
                        howManyTimesClicked = count;
                        count = 0;
                    }
                    count--;
                }
                i += howManyTimesClicked - 1;
                char letter = letters.charAt(howManyTimesClicked - 1);
                sb.append(letter);
            }
            prevNumber = number;
        }
        System.out.println(sb);
        char[] result = sb.toString().toCharArray();
        return result;
    }
}
