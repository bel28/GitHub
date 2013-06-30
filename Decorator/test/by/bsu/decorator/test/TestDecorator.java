package by.bsu.decorator.test;

import static org.junit.Assert.*;

import org.junit.Test;

import by.bsu.decorator.ASCII7Stream;
import by.bsu.decorator.AbstractStream;
import by.bsu.decorator.CompressingStream;
import by.bsu.decorator.factory.Factory;

public class TestDecorator {

	@Test
	public void testCompressing() throws ClassNotFoundException,
			InstantiationException, IllegalAccessException {

		AbstractStream abstractStream = Factory.getStream("by.bsu.decorator.FileStream");
		CompressingStream compressingStream = (CompressingStream) Factory.
				getStream("by.bsu.decorator.CompressingStream");
		compressingStream.setStream(abstractStream);
		

		byte[] b = new byte[10];
		for (int i = 0; i < 10; i++)
			b[i] = (byte) i;
		compressingStream.putByte(b);
		
		String handleResult = compressingStream.handleBufferFull();
		System.out.println(handleResult);
		assertEquals("Compressing Stream. File Stream. ", handleResult);
	}
 
	@Test
	public void testASCII7() throws ClassNotFoundException,
			InstantiationException, IllegalAccessException {

		AbstractStream abstractStream2 = Factory.getStream("by.bsu.decorator.NetworkStream");
		ASCII7Stream asciStream = (ASCII7Stream) Factory.getStream("by.bsu.decorator.ASCII7Stream");
		asciStream.setStream(abstractStream2);
		
		byte[] b = new byte[10];
		for (int i = 0; i < 10; i++)
			b[i] = (byte) i;
		asciStream.putByte(b);
		String handleResult = asciStream.handleBufferFull();

		System.out.println(handleResult);
		assertEquals("ASCII7Stream Stream. Network Stream. ", handleResult);

	}

}
