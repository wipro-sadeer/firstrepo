package Io;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;


public class IoStreams {

	public static void main(String[] args) {
		File f = new File("lemon.jpg"); 
		try {
			four();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void one(File f) throws FileNotFoundException, IOException{
		try (BufferedReader br = new BufferedReader(new FileReader(f))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		       System.out.println(line);
		    }
		}
	}
	public static void two(File f) throws FileNotFoundException, IOException{
		try (BufferedReader br = new BufferedReader(new FileReader(f))) {
		    int count = 0;
			int cha;
            while ((cha = br.read()) != -1) {
               if (cha == 'a' || cha == 'A'){
            	   count++;
               }
            }
            System.out.println(count);
		}
	}
	public static void three(File f, File f2) throws IOException {
		@SuppressWarnings("resource")
		FileChannel file = new FileInputStream(f).getChannel();
		@SuppressWarnings("resource")
		FileChannel dupe = new FileOutputStream(f2).getChannel();
		dupe.transferFrom(file, 0, file.size());
	}
	/*public static BufferedImage four(File f) throws IOException {;
      return new BufferedImage(500, 500, 
    		  BufferedImage.TYPE_INT_ARGB);
      
	}
	public static BufferedImage copyImage(BufferedImage srcImage){
	    return new BufferedImage(srcImage.getWidth(),
	    		srcImage.getHeight(), srcImage.getType());
	    
	}*/
	
	@SuppressWarnings("resource")
	public static void four() throws FileNotFoundException, IOException{
		InputStream is = null;
		OutputStream os = null;
		int size = 0;
		is = new FileInputStream(new File("lemon.jpg"));
		os = new FileOutputStream(new File("lemon2.jpg"));
		
		byte[] buffer = new byte[1024];
		while ((size = is.read(buffer)) > 0){
			os.write(buffer,0, size);
		}
		is.close();
		os.close();
	}
}
