public class HashMap<E,E1> {
	
	private E [] key ;
	private E1 [] value;
	int size = 10000;
	
//	private static int index = -1;
	
	@SuppressWarnings("unchecked")
	public HashMap()
	{
		key = (E[]) new Object[size];
		value = (E1[]) new Object[size];
	}
	

	public E1 get(E key)
	{
		int index = getIndexValue(key);
		int count = 0;
		
	
		if(this.key[index] == key)
			return (E1)this.value[index];
		
		else{
			while(this.key[index] != key)
			{
				index++;count++;
			
				if(index == size)
					index = 0;
				if(count == size - 1)
					return null;
			}
		
			return (E1)this.value[index];
		}
		
	}
	

	public void put(E key, E1 value)
	{
		int index = getIndexValue(key);
		
		if(get(key) == null){
			if(this.key[index] == null){
				
				this.key[index] = key;
				this.value[index] = value;
			}
			else{
				while(this.key[index] != null)
				{
					index++;
					if(index == size)
						index = 0;
				}
			
				this.key[index] = key;
				this.value[index] = value;
			}
		}	
		else System.out.println("Key already exist.");
	}
	
	public int getIndexValue(E key)
	{
		int index = 0;
		
		if(key instanceof Integer){
			//System.out.println("Integer " + key);
			index = (int) key;
		}
		else if (key instanceof String)
		{
			int sum = 0;
			char [] ch = ((String) key).toCharArray();	
			for(int i  = 0 ; i < ch.length; i++)
				sum += (int)ch[i] - 64;
			
			index = sum;
			//System.out.println("String "+ index);
		}
		return index;
	}
	
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
