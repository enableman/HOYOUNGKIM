package Quiz;

import java.io.File;
import java.util.Scanner;

import net.coobird.thumbnailator.Thumbnails;

public class Quiz1 {

	public static void main(String[] args) throws Exception{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("크기를 줄일 파일명을 입력해 주세요.");
		String str1 = scan.nextLine();
		
		System.out.println("변환할 크기의 가로픽셀을 입력해 주세요.");
		int a = scan.nextInt();
		
		System.out.println("변환할 크기의 세로픽셀을 입력해 주세요.");
		int b = scan.nextInt();
		
		System.out.println("변환할 파일명을 입력해 주세요.");
		String str2 = scan.next();
		 
		try {
			
			 Thumbnails.of(new File(str1)) //입력파일
			.size(a,b)                             //파일 크기
			.outputFormat("jpg")                       //파일 타입
			.toFile(str2);            //출력파일 
			 System.out.println("변환이 완료되었습니다.");
		
	     } 
		 catch(Exception e) {
			 e.printStackTrace();
			 System.out.println("오류가 발생되었습니다.");
	     }
		
		scan.close();

	}

}
