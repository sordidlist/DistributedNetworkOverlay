package overlay.node;

import java.util.ArrayList;

import overlay.transport.TCPSender;

public class NodeReference {
	
	private String ipAddress;
	private int localPort;
	private int publicPort;
	private int id;
	public ArrayList<LinkWeight> neighbors;
	public ArrayList<TCPSender> senders;
	public ArrayList<Thread> receivers;
	
	public NodeReference() {
		neighbors = new ArrayList<LinkWeight>();
		senders = new ArrayList<TCPSender>();
		receivers = new ArrayList<Thread>();
	}

	public void setIP(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public void setLocalPort(int port) {
		this.localPort = port;
	}
	public void setPublicPort(int port) {
		this.publicPort = port;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
		String msg = "IP: " + ipAddress + "\tLocal Port: " + localPort + "\tPublic Port: " + publicPort + "\tID num: " + id + " \n    Neighbor nodes-- ";
		for (int i = 0; i < neighbors.size(); i++) {
			msg += "\n    ID num-- " + neighbors.get(i).id + "\tWeight-- " + neighbors.get(i).weight;
		}
		return msg;
	}
	public String getIP() { return this.ipAddress; }
	public int getLocalPort() { return this.localPort; }
	public int getPublicPort() { return this.publicPort; }
	public int getId() { return this.id; }
}
