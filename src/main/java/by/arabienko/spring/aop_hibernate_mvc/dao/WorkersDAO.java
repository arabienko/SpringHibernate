package by.arabienko.spring.aop_hibernate_mvc.dao;

import by.arabienko.spring.aop_hibernate_mvc.entity.Worker;

import java.util.List;

public interface WorkersDAO {

    public List<Worker> getAllWorkers();
    public void saveWorker(Worker worker);
    public Worker getWorker(int id);
    public void deleteWorker(int id);
}
