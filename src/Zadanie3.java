public class Zadanie3 {

    private final int[] inputTable;

    public Zadanie3(int[] inputTable) {
        this.inputTable = inputTable;
    }

    public void program() {
        int result = this.inputTable[0];
        for (int i = 1; i < this.inputTable.length; i++) {
            int current = this.inputTable[i];
            while (current != 0) {
                int new_current = result % current;
                result = current;
                current = new_current;
            }
        }
       System.out.println(result);
    }
}
