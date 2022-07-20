package by.arabienko.spring.aop_hibernate_mvc.service.impl;

import by.arabienko.spring.aop_hibernate_mvc.dao.WorkersDAO;
import by.arabienko.spring.aop_hibernate_mvc.entity.Worker;
import by.arabienko.spring.aop_hibernate_mvc.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class WorkerServiceImpl implements WorkerService {

    @Autowired
    private WorkersDAO workersDAO;

    @Override
    @Transactional
    public List<Worker> getAllWorkers() {
        return workersDAO.getAllWorkers();

    }

    @Override
    @Transactional
    public void saveWorker(Worker worker) {
        workersDAO.saveWorker(worker);
    }

    @Override
    @Transactional
    public Worker getWorker(int id) {
        return workersDAO.getWorker(id);
    }

    @Override
    @Transactional
    public void deleteWorker(int id) {
        workersDAO.deleteWorker(id);
    }
}
