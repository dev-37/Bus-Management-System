package busOperator.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import busOperator.model.Bus;

@Repository
public class BusDAOImpl implements BusDAO {
	@Autowired
	JdbcTemplate template;

	@Override
	public List<Bus> getBuses() {
		return template.query("select * from buses", new RowMapper<Bus>() {
			public Bus mapRow(ResultSet rs, int row) throws SQLException {
				return new Bus(rs.getInt("bus_id"), rs.getString("bus_name"), rs.getString("location"),
						rs.getInt("ticket_price"));
			}
		});

	}

	@Override
	public List<Bus> getBuses(String location) {
		String sql = "SELECT * FROM buses WHERE location = ?";
		return template.query(sql, new RowMapper<Bus>() {
			public Bus mapRow(ResultSet rs, int row) throws SQLException {
				return new Bus(rs.getInt("bus_id"), rs.getString("bus_name"), rs.getString("location"),
						rs.getInt("ticket_price"));
			}
		}, location);
	}

	@Override
	public Bus findById(int bus_id) {
		String sql = "select * from buses where bus_id = ?";
		return template.queryForObject(sql, new RowMapper<Bus>() {
			public Bus mapRow(ResultSet rs, int row) throws SQLException {
				return new Bus(rs.getInt("bus_id"), rs.getString("bus_name"), rs.getString("location"),
						rs.getInt("ticket_price"));
			}
		}, bus_id);
	}

	@Override
	public int addNewBus(Bus bus) {
		String sql = "INSERT INTO buses(bus_name, location, ticket_price) VALUES (?, ?, ?)";
		return template.update(sql, bus.getBus_name(), bus.getLocation(), bus.getTicket_price());
	}

	@Override
	public void updateBus(Bus bus) {
		String sql = "update buses set bus_name = ?, location = ?, ticket_price = ? where bus_id = ?";
		template.update(sql,
				new Object[] { bus.getBus_name(), bus.getLocation(), bus.getTicket_price(), bus.getBus_id() });
	}

	@Override
	public void deleteBus(int id) {
		String sql = "delete from buses where bus_id = ?";
		template.update(sql, new Object[] { id });

	}

}
