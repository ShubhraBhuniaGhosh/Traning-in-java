
public class DemoStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DemoStringBuilder().display();
		System.err.println("Done");
		
	}
	
	public void display() {
		StringBuilder sb = new StringBuilder("This is java");// this is mutable
		
		System.out.println(sb.length());
		System.out.println(sb.delete(3, 5));
		System.out.println(sb);
		sb.append(" India");
		System.out.println(sb);
		
		// StringBuffer - find out the similarities and difference between string builder and String buffer
		sb = new StringBuilder();
		sb = null;
		sb = new StringBuilder();
	}

}
