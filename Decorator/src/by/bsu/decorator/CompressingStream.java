package by.bsu.decorator;

public class CompressingStream extends StreamDecorator {
	public CompressingStream() {
	}

	public CompressingStream(AbstractStream stream) {
		super(stream);
	}

	@Override
	public String handleBufferFull() {
		bytes = compress(bytes);
		
		return "Compressing Stream. " + super.handleBufferFull();
	}

	private byte[] compress(byte[] bytes) {
		System.out.println("Compress");
		
		return bytes;
	}
}