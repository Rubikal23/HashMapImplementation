import java.lang.reflect.Array;

public class HashMap<E,E1> {
	
	private int [] key ;
	private E1 [] value;
	Class<E> type1;
	Class<E1> type2 ;

	
//	private static int index = -1;
	
	@SuppressWarnings("unchecked")
	public HashMap()
	{
		key = new int[Integer.MAX_VALUE];
		value = (E1[])Array.newInstance(type2, Integer.MAX_VALUE);
	}
	

	public E1 get(int key)
	{
		int i = key;
		int count = 0;
		
		if(this.key[i] == key)
			return (E1)this.value[i];
		
		while(this.key[i] != key)
		{
			i++;
			count++;
			if(i == Integer.MAX_VALUE)
				i = 0;
			if(count == Integer.MAX_VALUE - 1)
				return null;
		}
		
		return (E1)this.value[i];
		
	}
	
	public E1 get(String key)
	{
		return null;
		
	}

	/*public Object get(Object key)
	{
		int i = this.key.indexOf(key);
	
		if(i != -1)
			return this.value.get(i);
			
		return null;
	}*/
	
	public void put(int key, E1 value)
	{
		int i = key;
		
		if(get(key) == null){
			
			if(this.key[i] == 0){
				this.key[i] = key;
				this.value[i] = value;
			}
			else{
				while(this.key[i] != 0)
				{
					i++;
					if(i == Integer.MAX_VALUE-1)
						i = 0;
				}
				this.key[i] = key;
				this.value[i] = value;
				
			}
		}
			
	}
	
	
	/*public void put(Object key, Object value)
	{
		this.key.add(key);
		this.value.add(value); 
	}*/
	
	public Object remove(Object key)
	{
	/*	int i = this.key.indexOf(key);
		if(i != -1)
		{
			this.key.remove(i);
			return this.value.remove(i);
		} */
		return null; 
	}
	

}
