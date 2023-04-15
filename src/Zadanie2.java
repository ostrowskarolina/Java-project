import java.util.ArrayList;
import java.util.List;

public class Zadanie2 {
    private final int[] firstTab = {1, 2, 5, 5};
    private final int[] secondTab = {5, 6, 7, 8, 9};

    private List<Integer> result = new ArrayList<Integer>();

    public void program() {
        for(int i = 0; i < firstTab.length; i++) {
            for(int j = 0; j < secondTab.length; j++){
                if(firstTab[i]==secondTab[j] && !result.contains(firstTab[i])) {
                    result.add(firstTab[i]);
                }
            }
        }
        System.out.println(result);
    }





}
