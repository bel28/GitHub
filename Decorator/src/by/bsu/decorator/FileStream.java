package by.bsu.decorator;

public class FileStream extends AbstractStream {
	public FileStream() {

	}

	public String handleBufferFull() {
		byteFilled = 0;
		//actual data output to stream
		return "File Stream. ";
	}
}