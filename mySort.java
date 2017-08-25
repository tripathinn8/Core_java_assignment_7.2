import java.util.*;
import java.lang.*;
public class mySort {

	public static void main(String[] args) {
		String[] arr= {"My", "name", "is", "xyz"};
		
		String tmp;
		for(int i=0; i<arr.length; i++)
		{
			tmp=arr[i];
			for (int j=0; j<arr.length; j++)
			{
				if (i==j)continue;
				int x=tmp.compareTo(arr[j]);
				if(x<0)
				{
					tmp=arr[j];
					arr[j]=arr[i];
					arr[i]=tmp;
				}
			}
		}
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
