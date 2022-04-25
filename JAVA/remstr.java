import java.util.*;
class remstr
{
	public static void main(String arg[])
	{
		String info = "Hello.. Welcome to CGPIT";
        String info1;
        char str[] = info.toCharArray();  
        int len = str.length;   
        int index = 0;
        for (int i = 0; i < len; i++)   
        {   
            int j;   
            for (j = 0; j < i; j++)    
            {   
                if (str[i] == str[j])   
                {   
                    break;   
                }   
            }   
            if (j == i)    
            {   
                str[index++] = str[i];   
            }   
        }
        char str1[]=new char[index];
        //str1=Arrays.copyOf(str,index);
        for(int i=0;i<index;i++)
        {
            str1[i]=str[i];    
        }
        //System.out.println(str1);
        info1=String.valueOf(str1);
        System.out.println(info1);
        //System.out.println(String.valueOf(Arrays.copyOf(str, index)));
	}
}
