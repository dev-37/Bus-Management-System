package busOperator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import busOperator.dao.BusDAO;
import busOperator.model.Bus;

@Service
public class BusServiceImpl implements BusService {
	@Autowired
	BusDAO busDao;

	@Override
	public List<Bus> getBus() {
		return busDao.getBuses();
	}

	@Override
	public List<Bus> getBus(String location) {
		return busDao.getBuses(location);
	}

	@Override
	public void addBus(Bus bus) {
		busDao.addNewBus(bus);
	}

	@Override
	public void updateBus(Bus bus) {
		busDao.updateBus(bus);
	}

	@Override
	public void deleteBus(int id) {
		busDao.deleteBus(id);

	}

	@Override
	public Bus getBusById(int bus_id) {
		return busDao.findById(bus_id);
	}
}
