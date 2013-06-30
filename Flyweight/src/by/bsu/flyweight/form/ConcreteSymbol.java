package by.bsu.flyweight.form;

public class ConcreteSymbol extends Symbol {

	public ConcreteSymbol(char anotherLetter, int anotherSize) {
		letter = anotherLetter;
		size = anotherSize;
		
		height = 5;
		width = 5;
		ascent = 2;
		descent = 2;
	}

	@Override
	void display() {
		System.out.println(letter + " ( symbol's size = " + size + " )");
	}

}
