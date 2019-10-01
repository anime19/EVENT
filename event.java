import java.util.*;
import java.io.*;

class aa{
	
	static int getNum(String s)
	{
		if(s.equals("sunday"))
			return 0;
		if(s.equals("monday"))
			return 1;
		if(s.equals("tuesday"))
			return 2;
		if(s.equals("wednesday"))
			return 3;
		if(s.equals("thursday"))
			return 4;
		if(s.equals("friday"))
			return 5;
		if(s.equals("saturday"))
			return 6;
		return -1;
		
			
	}

	public static void main(String[] args) throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String s;
	String[] sr;
	s=br.readLine();
	int t= Integer.parseInt(s);
	String startday,endday;
	int l,r,bday,eday,diff,lcal,rcal,quot,quot1,instance,day=0;
	while(t!=0)
	{
		t--;
		s=br.readLine();
		sr=s.split(" ");
		startday=sr[0];
		endday=sr[1];
		l=Integer.parseInt(sr[2]);
		r=Integer.parseInt(sr[3]);
		bday=getNum(startday);
		eday=getNum(endday);
		instance=0;
		if(eday-bday<0)
		{
			diff=7-bday+eday+1;
		}
		else
		{
			diff=eday-bday+1;
		}
		lcal=l-diff;
		rcal=r-diff;
		quot=lcal/7;
		if(quot<0)
		{
			System.out.println("impossible");
			continue;
		}
		
		if(lcal<=(quot)*7&&(quot)*7<=rcal)
		{
			instance=instance+1;
			day=quot*7;
		}
		if(lcal<=(quot+1)*7&&(quot+1)*7<=rcal)
			{
				instance=instance+1;
				day=(quot+1)*7;
			}
		
		if(lcal<=(quot+2)*7&&(quot+2)*7<=rcal)
			instance=instance+1;
		
		if(instance==0)
		{
			System.out.println("impossible");
			continue;
		}
		if(instance==1)
		{
			System.out.println(day+diff);
			continue;
		}
		if(instance>1)
		{
			System.out.println("many");
			continue;
		}
		
	
		
		
		
		
		
		
	}
	
	}
    
}

