package day5;

public class GenericEx {
	public static void main(String[] args) {

		Box<String> box1 = new Box<String>();
		box1.set("³²±æ¿ì");
		Box<Integer> box2 = new Box<Integer>();
		box2.set(123);
		
		System.out.println(box1.get());
		System.out.println(box2.get());
	}
}
