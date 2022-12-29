package ru.vsu.cs.kislova_i_v.service;

import ru.vsu.cs.kislova_i_v.model.SheduleDay;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class SheduleDayService implements BaseService<SheduleDay> {
    private SheduleDayDao sheduleDayDao = new SheduleDayDao();
    @Override
    public Optional<SheduleDay> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<SheduleDay> getAll() {
        return null;
    }

    @Override
    public void save(SheduleDay sheduleDay) throws SQLException, IOException, ClassNotFoundException {
        sheduleDayDao.save(sheduleDay);
    }

    @Override
    public void update(SheduleDay sheduleDay, String[] params) {

    }

    @Override
    public void delete(SheduleDay sheduleDay) {

    }
}
