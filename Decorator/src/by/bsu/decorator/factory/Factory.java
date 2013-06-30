package by.bsu.decorator.factory;

import by.bsu.decorator.AbstractStream;

public class Factory {
	private Factory() {
	}

	public static AbstractStream getStream(String className)
			throws ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		
		AbstractStream instance =  (AbstractStream) Class
				.forName(className).newInstance();
		
		return instance;

	}
}
