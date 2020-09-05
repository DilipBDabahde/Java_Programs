//for server

import java.io.*;
import java.net.*;


class Server
{
	public static void main(String args[])throws Exception
	{
	
		BufferedReader br;
		DataInputStream dis;
		DataOutputStream dos;	//3 ref are created
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		ServerSocket ssk = new ServerSocket(2100);
		
		Socket sk = ssk.accept();
		
		dis = new DataInputStream(sk.getInputStream());
		
		dos = new DataOutputStream(sk.getOutputStream());
	
		String str1 = "";
		String str2 = "";
		
		while(! str1.equals("End"))
		{
			str1 = dis.readUTF(); //incomming message reading
			System.out.println("Client Message: "+str1);
			str2 = br.readLine(); //acceept string
			dos.writeUTF(str2);//sending message to client
			dos.flush(); //cleand input buffer 
		}
		//resource deallocation
		dis.close();
		dos.close();
		ssk.close();
		sk.close();	
	}

}
