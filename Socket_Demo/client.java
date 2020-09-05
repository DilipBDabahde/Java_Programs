//for client 

import java.io.*;
import java.net.*;

class Client
{
	public static void main(String argsp[])throws Exception
	{
		
		BufferedReader br; 
		DataInputStream dis;
		DataOutputStream  dos; //3 are ref of diff class
		
		br  = new BufferedReader(new InputStreamReader(System.in));
		
		Socket  sk = new Socket("localhost",2100);
		
		dis = new DataInputStream(sk.getInputStream());
		
		dos = new DataOutputStream(sk.getOutputStream());
		
		String str1 = "";
		String str2 = "";
		
		
		while(! str1.equals("End"))
		{
			str1 = br.readLine(); //taking input from user
			dos.writeUTF(str1);
			dos.flush();
			str2 = dis.readUTF();
			System.out.println("Server Message: "+str2);
		}
		
		dis.close();
		dos.close();
		sk.close();
	
	}

}
