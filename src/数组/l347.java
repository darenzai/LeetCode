package 数组;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class l347 {
	
    public int[] topKFrequent(int[] nums, int k) {
        	
    	
    	
    	return nums;
    }
	
	
	public static void main(String[] args) throws IOException {
		Socket sock=new Socket("172.30.0.117",7456);
		OutputStream os=sock.getOutputStream();
		PrintWriter pw=new PrintWriter(os,true);
		pw.println("darenzai");
		
		pw.close();
		sock.close();
	}
}
