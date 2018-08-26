import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int count = 0;
		
		for(int i=0;i<input.length()-1;i++)
		{
		    char temp = input.charAt(i);
		    char temp2 = input.charAt(i+1);
		    if((temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u'||temp=='A'||temp=='E'||temp=='I'||temp=='O'||temp=='U')&&(temp2=='a'||temp2=='e'||temp2=='i'||temp2=='o'||temp2=='u'||temp2=='A'||temp2=='E'||temp2=='I'||temp2=='O'||temp2=='U'))
		        count++;
		}
		System.out.println(count);
	}
}
