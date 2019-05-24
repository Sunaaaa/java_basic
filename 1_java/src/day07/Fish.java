package day07;

class Fish extends Animal{
	String name;

	public Fish() {
		super("물고기");
	}
	
	public Fish(String name) {
		super("물고기");
		this.name = name;
	}
	
	public void print() {
		System.out.printf("동물[%s, %s, %s, %s]%n ", name, this.kind, super.kind, kind);
	}

	@Override
	public void breath() {
		System.out.println("아가미로 숨쉬기");
	}
}