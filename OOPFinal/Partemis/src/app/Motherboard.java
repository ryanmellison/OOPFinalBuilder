package app;

import enums.FormFactor;
import enums.SocketType;
import interfaces.Component;

public class Motherboard extends Part implements Component{
	
	private final String manufacturer;
	private final FormFactor formFactor;
	private final SocketType socketType;
	
	public Motherboard(SocketType socketType, FormFactor formFactor, String manufacturer){
		this.manufacturer = manufacturer;
		this.formFactor = formFactor;
		this.socketType = socketType;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public FormFactor getFormFactor() {
		return formFactor;
	}

	public SocketType getSocketType() {
		return socketType;
	}
	
	@Override
	public String toString(){
		return "";
	}
}
