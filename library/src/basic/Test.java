package basic;

import java.io.File;
// import java.util.Map;

import net.coobird.thumbnailator.Thumbnails;

public class Test {

	public static void main(String[] args) throws Exception{
		 
		 try {
		
			 Thumbnails.of(new File("C:/Users/HYK/Downloads/dog.jpg"))
			.size(100,100)
			.outputFormat("jpg")
			.toFile(new File("thumbnail.jpg"));
		
	     } 
		 catch(Exception e) {
			 e.printStackTrace();
	     }
	}
	
//	Map<K, V>;

}
