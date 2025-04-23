package busOperator.service;

import java.util.List;

import busOperator.model.Bus;

public interface BusService {
	public List<Bus> getBus();

	public List<Bus> getBus(String location);

	public void addBus(Bus bus);

	public void updateBus(Bus bus);

	void deleteBus(int id);

	Bus getBusById(int bus_id);

}
