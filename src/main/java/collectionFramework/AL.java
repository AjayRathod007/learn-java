package collectionFramework;

public  class AL {
	 int arr[];
	int size=0;

	AL()
	{
	    arr = new int[0];
	}
	AL(int s)
	{
		arr = new int[s];
	}
	
	public void add(int x)
	{
		if(size==arr.length)
		{
			System.out.println("array capacity :- " + arr.length + ", array size :- " + size +"  Does not hava enough space, let's make some room");
			int temp[] = new int[arr.length+3];
			size=0;
			int i=0;
			for( i=0; i<arr.length; i++)
			{
				temp[i]=arr[i];
				size++;
			}
			
			temp[i]=x;
			size++;
			arr=null;  // to delete old array
			arr=temp;  // took reference of new array
			
		}
		else
		{
			arr[size]=x;
			size++;
		}
	}
	
	
	public void print1()
	{
		if(size==0)
		{
			System.out.println("array is empty");
			return;
		}
		
		for(int x=0; x<size; x++)
		{
			System.out.print(arr[x]+" ");
		}
	}




	public static void main(String[] arg)
	{
		AL a = new AL();
		a.print1();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(4);
		a.add(4);
		a.add(4);
		a.add(4);
		a.print1();
		
	}
}
