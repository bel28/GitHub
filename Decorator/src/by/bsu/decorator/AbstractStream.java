package by.bsu.decorator;

public abstract class AbstractStream {
	private final int MAX_BUFFER_SIZE = 100;
	protected byte[] bytes = new byte[MAX_BUFFER_SIZE];
	protected int byteFilled;

	public int putByte(byte[] bytes) {

		int i = byteFilled;
		while ((i < MAX_BUFFER_SIZE) && (i + byteFilled < bytes.length)) {
			this.bytes[i] = bytes[i];
			i++;
		}
		if (i == MAX_BUFFER_SIZE) {
			handleBufferFull();
		}
		
		return 1;
	}

	public abstract String handleBufferFull();
}
