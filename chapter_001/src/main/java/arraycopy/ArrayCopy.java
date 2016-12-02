package arraycopy;
import java.util.Arrays;
/**
 * Class ArrayCopy.
 * @author Dmitrij Gribovskij
 * @ since 02.12.2016
 */
 public class ArrayCopy {
	 /**
	 *This method delete duplicate.
	 *@param array - arraycopy
	 *@return arraycopy
	 */
	  public String[] duplicate(String[] array) {
        int count = 0;
        int size = array.length;
        for (int i = 0; i < size - count; i++) {
            for (int j = i + 1; j < size - count; j++) {
                if (array[i].equals(array[j])) {
                    String reserv;
                    reserv = array[size - count - 1];
                    array[size - count - 1] = array[j];
                    array[j] = reserv;
                    count++;
                }
            }
        }
        return  Arrays.copyOf(array, size - count);
    }
 }