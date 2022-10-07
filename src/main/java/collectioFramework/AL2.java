package collectioFramework;


class AL3<T> {
	
    T arr[];
	int size=0;

	@SuppressWarnings("checked")
	AL3()
	{
		
		T[] a = (T[])new Object[0];
		arr=a;
	}
	@SuppressWarnings("unchecked")
	AL3(int s)
	{
		
		T[] a = (T[])new Object[s];
		arr=a;
	}
	
	//@SuppressWarnings("unchecked")
	@SuppressWarnings("unchecked")
	public void add(Object x)
	{
		if(size==arr.length)
		{
			System.out.println("array capacity :- " + arr.length + ", array size :- " + size +"  Does not hava enough space, let's make some room");
			//Object temp[] = new Object[arr.length+3];
			
			T[] temp = (T[])new Object[arr.length+3];
			size=0;
			int i=0;
			for( i=0; i<arr.length; i++)
			{
				temp[i]=arr[i];
				size++;
			}
			
			temp[i]=(T) x;
			size++;
			arr=null;  // to delete old array
			arr=temp;  // took reference of new array
			
		}
		else
		{
			arr[size]=(T) x;
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
}

public class AL2
{
	public static void main(String[] arg)
	{
		
		
		//ArrayList<Integer> ar = new ArrayList<>();
		
		AL3<Integer> a = new AL3<>();
		a.print1();
		a.add(1);
		a.add(2);
		a.add("ghjhe");
		a.add(4);
		a.add(4);
		a.add(2.323);
		a.add(4);
		a.add(4);
		a.print1();
		
	}
}
