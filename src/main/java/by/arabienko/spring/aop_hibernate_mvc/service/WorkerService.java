package by.arabienko.spring.aop_hibernate_mvc.service;

import by.arabienko.spring.aop_hibernate_mvc.entity.Worker;
import org.hibernate.jdbc.Work;

import java.util.List;

public interface WorkerService {

    public List<Worker> getAllWorkers();
    public void saveWorker(Worker worker);
    public Worker getWorker(int id);

}
