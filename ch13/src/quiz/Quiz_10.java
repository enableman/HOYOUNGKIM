package quiz;

class Aminal{
	//필드
	String name;
	String species;
	int age;
	String sound = "설정중";
	//생성자
	Aminal(String name, String species, int age){
		
		this.name = name;
		this. species =  species;
		this.age = age; 
	} 
	
    Aminal(String name, String species, int age,String sound){
		
		this.name = name;
		this. species =  species;
		this.age = age;
		this.sound = sound;
	} 
	
	//메소드
	void makeSound(String sound) {
		
		this.sound = sound; 
		
	}
	
	void printInfo() { //메소드
		
		System.out.print("이름:"+name+" ");
		System.out.print("종류:"+species+" ");
		System.out.print("나이:"+age+"살"+" ");
		System.out.print("소리:"+sound+" ");
		System.out.println("");
		
	}
} 

public class Quiz_10 { //public 클래스명 

	public static void main(String[] args) { //메인 메소드
		
		Aminal a1 = new Aminal("야옹이", "고양이", 1);
		Aminal a2 = new Aminal("멍멍이", "개", 3, "멍멍");  
		
		a1.makeSound("야옹~");
		a2.makeSound("으르렁!");
		a1.printInfo();
		a2.printInfo();
		
		
		Aminal a3 = new Aminal("야옹이", "고양이", 1, "야옹~");
		Aminal a4 = new Aminal("멍멍이", "개", 3, "으르렁!"); 
		a3.printInfo();
		a4.printInfo();
		
	}

}
