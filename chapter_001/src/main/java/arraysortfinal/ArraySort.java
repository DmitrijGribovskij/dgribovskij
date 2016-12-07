package arraysortfinal;
/**
 * Class ArraySort.
 * @author Dmitrij Gribovskij
 * @ since 07.12.2016
 */
public class ArraySort {
    /**
     *This method sorting two arrays.
     *@param arrayFirst - array first
     *@param arraySecond - array second
     *@return - values
     */
    public int[] sort(int[] arrayFirst, int[] arraySecond) {
        int[] arrayResult = new int[arrayFirst.length + arraySecond.length];
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arrayResult.length; i++) {
            if (count1 < arrayFirst.length && count2 < arraySecond.length && arrayFirst[count1] < arraySecond[count2]) {
                arrayResult[i] = arrayFirst[count1];
                count1++;
            } else if (count2 < arraySecond.length) {
                arrayResult[i] = arraySecond[count2];
                count2++;
            } else {
                arrayResult[i] = arrayFirst[count1];
                count1++;
            }
        }
        return arrayResult;
    }
}