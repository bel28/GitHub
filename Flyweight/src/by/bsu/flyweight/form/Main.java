package by.bsu.flyweight.form;

public class Main {

	public static void main(String[] args) {
		String doc = "PeTeR";
		SymbolFactory factory = new SymbolFactory();
		for (int i = 0; i < doc.length(); i++) {
			char c = doc.charAt(i);
			Symbol symbol = factory.getSymbol(c);
			symbol.display();
		}
	}
}
