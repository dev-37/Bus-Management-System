package busOperator.dao;

import java.util.List;

import busOperator.model.Bus;

public interface BusDAO {
	public List<Bus> getBuses();

	public List<Bus> getBuses(String location);

	public int addNewBus(Bus bus);

	public void updateBus(Bus bus);

	void deleteBus(int id);

	public Bus findById(int bus_id);
}
