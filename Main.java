public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Object> h = new HashMap<Object>();
		
		h.put(1, "One");
		h.put(2, "Two");
		h.put(3, "Three");
		h.put(4, "Four");
		
		System.out.println(h.get(2));
		System.out.println(h.remove(3));
		System.out.println(h.get(4));
	}

}
