package arrayturntwo;
/**
 * Class TurnTwo.
 * @author Dmitrij Gribovskij
 * @ since 02.12.2016
 */
 public class ArrayTurnTwo {
	 /**
	 *This method overturns the array on 90 grad.
	 *@param values - array
	 *@return array - arrayTurn
	 */
	public int[][] turn(int[][] values) {

        int size = values.length;
       int[][] arrayTurn = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arrayTurn[j][size - i - 1] = values[i][j];

            }
       }
        return arrayTurn;
    }
}