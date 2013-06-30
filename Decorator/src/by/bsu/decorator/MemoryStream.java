package by.bsu.decorator;

public class MemoryStream extends AbstractStream {
	public MemoryStream() {

	}

	public String handleBufferFull() {
		byteFilled = 0;
		//actual data output to stream
		return "Memory Stream. ";

	}

}
