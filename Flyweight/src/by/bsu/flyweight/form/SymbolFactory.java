package by.bsu.flyweight.form;

import java.util.HashMap;
import java.util.Map;

public class SymbolFactory {
	private final int SIZE = 100;

	private Map<Character, Symbol> symbols = new HashMap<Character, Symbol>();

	public Symbol getSymbol(char key) {
		Symbol symbol = null;

		symbol = symbols.get(key);

		if (symbol == null) {
			switch (key) {
			case 'A':
				symbol = new ConcreteSymbol('A', SIZE);
				break;
			case 'B':
				symbol = new ConcreteSymbol('B', SIZE);
				break;
			case 'C':
				symbol = new ConcreteSymbol('C', SIZE);
				break;
			case 'D':
				symbol = new ConcreteSymbol('D', SIZE);
				break;
			case 'E':
				symbol = new ConcreteSymbol('E', SIZE);
				break;
			case 'F':
				symbol = new ConcreteSymbol('F', SIZE);
				break;
			case 'G':
				symbol = new ConcreteSymbol('G', SIZE);
				break;
			case 'H':
				symbol = new ConcreteSymbol('H', SIZE);
				break;
			case 'I':
				symbol = new ConcreteSymbol('I', SIZE);
				break;
			case 'J':
				symbol = new ConcreteSymbol('J', SIZE);
				break;
			case ' ':
				symbol = new ConcreteSymbol(' ', SIZE);
				break;

			default:
				symbol = new ConcreteSymbol('*', SIZE);
				break;
			}
			symbols.put(key, symbol);
		}

		return symbol;
	}
}
