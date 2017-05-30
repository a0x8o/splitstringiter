import java.lang.*;
import java.util.*;
import java.util.regex.*;

// Output:
//   java -cp .:$CLASSPATH SplitString
//   Return :["Hello World", marker, coffee, "Headphones eraser"]

public class SplitStringIter {

		public SplitStringIter() {
		}

		public static void main(String args[]) {
                System.out.println("SplitString - Iterative Solution");
                System.out.println("================================");
                String input = "\"Hello World\" marker coffee \"Headphones eraser\"";
				System.out.println("Return: " + splitStringToArray(input).toString());
                String input1 = "!cmd 45 90 \"An argument\" Another AndAnother \"Another one in quotes\"";
                System.out.println("Return: " + splitStringToArray(input1).toString());
                String input2 = "'foo bar' c;\"baz,blurb\" d;\"quux,syzygy\"";
                System.out.println("Return: " + splitStringToArray(input2).toString());
                String input3 = "";
                System.out.println("Return: " + splitStringToArray(input3).toString());
                if (args != null) {
                    for (String s : args) {
                        System.out.println("Return: " + splitStringToArray(s).toString());
                    }
                }
		}

		public static List<String> splitStringToArray(String input) {
				String[] tokenized = input.split("\""); // split on quote first
	     	List<String> result = new LinkedList<>();
	     	for(int i = 0; i < tokenized.length; i++) {
	      		tokenized[i] = tokenized[i].trim();
	      		if ("".equals(tokenized[i])) {
	          		continue;
	      		}
	         	if (i % 2 == 0) {
                String[] tmp = tokenized[i].split("\\s+");
                // second, split on spaces (when needed)
	              for (String t : tmp) {
	                  result.add(t);
	             	}
	         	} else {
                result.add("\"" + tokenized[i] + "\"");
                // return the quote back to place
	         	}
	      }
			  return result;
    }
}

