package Quiz;

import java.io.File;

import net.coobird.thumbnailator.Thumbnails;

public class Quiz1 {

	public static void main(String[] args) throws Exception{
		 
		try {
			
			 Thumbnails.of(new File("C:/DEV/aaa.jpg")) //입력파일
			.size(100,200)                             //파일 크기
			.outputFormat("jpg")                       //파일 타입
			.toFile(new File("aaa_1.jpg"));            //출력파일 
			 System.out.println("변환이 완료되었습니다.");
		
	     } 
		 catch(Exception e) {
			 e.printStackTrace();
			 System.out.println("오류가 발생되었습니다.");
	     }

	}

}
