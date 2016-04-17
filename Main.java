public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> h = new HashMap<String,Integer>();
			
		h.put("one",1);
		h.put("Two",2);
		h.put("Three",3);
		h.put("Four",4);
		h.put("une",1);
		
		System.out.println(h.get("Two"));
		System.out.println(h.get("one"));
		System.out.println(h.get("une"));
		System.out.println(h.get("Four"));
		
	}

}
