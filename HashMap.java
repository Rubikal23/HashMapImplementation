import java.util.ArrayList;

@SuppressWarnings("hiding")
public class HashMap<Object> {
	
	private ArrayList<Object> key;
	private ArrayList<Object>value;
//	private static int index = -1;
	
	public HashMap()
	{
		key =  new ArrayList<Object>();
		value = new ArrayList<Object>();
	}
	
	public Object get(Object key)
	{
		int i = this.key.indexOf(key);
	
		if(i != -1)
			return this.value.get(i);
			
		return null;
	}
	
	public void put(Object key, Object value)
	{
		this.key.add(key);
		this.value.add(value);
	}
	
	public Object remove(Object key)
	{
		int i = this.key.indexOf(key);
		if(i != -1)
		{
			this.key.remove(i);
			return this.value.remove(i);
		}
		return null;
	}
	

}
