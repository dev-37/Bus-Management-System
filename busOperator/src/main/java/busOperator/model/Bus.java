package busOperator.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "buses")
public class Bus implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int bus_id;

	String bus_name;

	String location;

	int ticket_price;

	public Bus() {
	}

	public Bus(int bus_id, String bus_name, String location, int ticket_price) {
		this.bus_id = bus_id;
		this.bus_name = bus_name;
		this.location = location;
		this.ticket_price = ticket_price;
	}

	public Bus(String bus_name, String location, int ticket_price) {
		this.bus_name = bus_name;
		this.location = location;
		this.ticket_price = ticket_price;
	}

	public String getBus_name() {
		return bus_name;
	}

	public void setBus_name(String bus_name) {
		this.bus_name = bus_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getTicket_price() {
		return ticket_price;
	}

	public void setTicket_price(int ticket_price) {
		this.ticket_price = ticket_price;
	}

	public int getBus_id() {
		return bus_id;
	}

	public void setBus_id(int bus_id) {
		this.bus_id = bus_id;
	}

}
