package testtask;
/**
 * Class TestTask.
 * @author Dmitrij Gribovskij
 * @ since 03.12.2016
 */
 public class TestTask {
	 /**
	 *This method checks that the string sub is the substring origin.
	 *@param origin - String
	 *@param sub - String
	 *@return result
	 */
	 public static boolean contains(String origin, String sub) {
         char[] originChar = origin.toCharArray();
         char[] subChar = sub.toCharArray();
         boolean result = false;
            for (int j = 0; j < originChar.length; j++) {
                if (subChar[0] == originChar[j]) {
                    for (int i = 1; i < subChar.length; i++) {
                        try {
                            if (subChar[i] == originChar[j + i]) {
                                result = true;
                            } else {
                                result = false;
                                break;
                            }
                        } catch (Exception e) {
                            result = false;
                        }
                    }
                }
				if (result) {
                    break;
                } else {
				continue;
                }
            }
        return result;
    }
 }