import java.util.Scanner;

public interface IWord {
	
	public static void main(String[] args){
	    
		Scanner scan = new Scanner(System.in);
	    System.out.print("Enter your word: ");
	    String s = scan.next();
	    String Str = new String(s);
        System.out.print( s);
	    System.out.print("Возвращаемое значение: " );
	    System.out.println(Str.replace('n', '%'));
	}

}
