package by.bsu.memento.test;

import org.junit.Test;

import by.bsu.memento.*;

public class MementoTest {
	
	@Test
	public void testMemento() {
		Caretaker caretaker = new Caretaker();

        Originator originator = new Originator();
        originator.set("State1");
        originator.set("State2");
        caretaker.addMemento( originator.saveToMemento() );
        originator.set("State3");
        caretaker.addMemento( originator.saveToMemento() );
        originator.set("State4");

        originator.restoreFromMemento(caretaker.getMemento(1));

	}
}
