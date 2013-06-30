package by.bsu.decorator;

public abstract class StreamDecorator extends AbstractStream {

	private AbstractStream stream;

	public StreamDecorator() {

	}

	public StreamDecorator(AbstractStream stream) {
		this.stream = stream;
	}

	public String handleBufferFull()
	{
		return stream.handleBufferFull();
	}

	public AbstractStream getStream() {
		return stream;
	}

	public void setStream(AbstractStream stream) {
		this.stream = stream;
	}

}