

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class RemoveFirstLastOccurance {

	public static String removeFirstandLastChar(String word,char ch)
	{
		List <Character> clist = new ArrayList<Character>();
		
		for(int i=0;i<word.length();i++)
		{
			clist.add(word.charAt(i));
		}
		
		//remove first occu
		
		System.out.println(clist);
		for(int i=0;i<clist.size();i++)
		{
			
			char c=clist.get(i);
			if(c==ch)
			{
				clist.remove(i);
				break;
			}
		}
		
		
		// remove last occurrence of char
		
		for(int i=clist.size()-1;i>=0;i--)
		{
			
			char c=clist.get(i);
			if(c==ch)
			{
				clist.remove(i);
				break;
			}
		}
		
		//System.out.println(clist.toString())
	      //Convert list to string
			
			StringBuilder br = new StringBuilder();
			
			for(int i=0;i<clist.size();i++) {
				br.append(clist.get(i));
			}
			
			return br.toString();
			
		
	
		
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String word;
		char c;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 word=br.readLine();
		    c=br.readLine().charAt(0);
		    System.out.println( RemoveFirstLastOccurance.removeFirstandLastChar(word, c));
		
		
	}

}
