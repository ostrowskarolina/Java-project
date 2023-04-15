public class Zadanie1 {

    private final String[] words = {"Sagres", "Porto", "Lagos", "Lizbona"};
    private final int expectedNumber = 12;

    public Zadanie1(){ }

    public void program(){

        String first;
        String second;

        for(int i = 0; i < words.length; i++) {
            for(int j = 0; j < words.length; j++){
                first = words[i];
                second = words[j];
                if(first.length() + second.length() + 1 < expectedNumber && first != second) {
                    System.out.println(first + " " + second);
                }
            }

        }
    }

}
