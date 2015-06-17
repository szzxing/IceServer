package testIce;

import Ice.Current;
import PrinterInterface._PrinterDisp;

@SuppressWarnings("serial")
public class PrinterI extends _PrinterDisp {
	public void shutdown(Current arg0) {

	}

	public void writeMessage(String arg0, int arg1, Current arg2) {

	}

	public void printString(String s, Ice.Current current) {
		System.out.println("The string is : " + s);
	}
}