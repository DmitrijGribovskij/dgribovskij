package paint;
/**
 * Class Paint.
 * @author Dmitrij Gribovskij
 * @ since 29.11.2016
 */
 public class Paint {
	/**
	* Piramida.
	* @param h - number
	*/
	 public void piramid(int h) {
        String space = " ";
        String symbol = "^";
        for (int j = 0; j < h; j++) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i <= h * 2; i++) {
                 if (i == h - j || i == h + j) {
                    builder.append(symbol);
                } else {
					builder.append(space);
				  }
            }
            System.out.println(builder.toString());
        }
    }
 }