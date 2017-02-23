package app;

import enums.SocketType;
import interfaces.Component;

public class CPU extends Part implements Component{
	
	private final String manufacturer;
	private final byte cores;
	private final SocketType socketType;
	
	public CPU(String manufacturer, byte cores, SocketType socketType){
		this.manufacturer = manufacturer;
		this.cores = cores;
		this.socketType = socketType;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public byte getCores() {
		return cores;
	}

	public SocketType getSocketType() {
		return socketType;
	}
	
	@Override
	public String toString(){
		return "";
	}
}
