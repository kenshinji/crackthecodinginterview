package chapter1;

public class DuplicatedCharDel {

    /**
     * @param args
     */
    public static void main(String[] args) {

	String dupstr = "abcdeabjkl";
	System.out.println("original str:");
	System.out.println(dupstr);
	

	System.out.println("after deleting duplicated chars:");
	System.out.println(delDuplicatedChars(dupstr));
	
    }

    public static String delDuplicatedChars(String dupstr) {
	char[] chArray = dupstr.toCharArray();
	for (char ch : chArray) {
	    if (dupstr.indexOf(ch) != dupstr.lastIndexOf(ch)) {
		dupstr = dupstr.substring(0,dupstr.lastIndexOf(ch))
			+dupstr.substring(dupstr.lastIndexOf(ch)+1,dupstr.length());
	    }
	}
	
	return dupstr;
    }
    
    
}
