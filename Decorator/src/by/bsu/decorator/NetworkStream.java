package by.bsu.decorator;

public class NetworkStream extends AbstractStream {

	public NetworkStream() {

	}

	public String handleBufferFull() {
		byteFilled = 0;
		//actual data output to stream
		return "Network Stream. ";

	}

}