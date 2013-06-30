package by.bsu.flyweight.form;

public abstract class Symbol {
	protected char letter;

	protected int width, height, ascent, descent, size;

	abstract void display();

}
