package by.arabienko.spring.aop_hibernate_mvc.controller;

import by.arabienko.spring.aop_hibernate_mvc.dao.WorkersDAO;
import by.arabienko.spring.aop_hibernate_mvc.dao.impl.WorkerDAOImpl;
import by.arabienko.spring.aop_hibernate_mvc.entity.Worker;
import by.arabienko.spring.aop_hibernate_mvc.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ControllerMain {

    @Autowired
    private WorkerService workerService;

    @RequestMapping("/")
    public String showAllWorkers(Model model){
        List<Worker> workerList = workerService.getAllWorkers();
        model.addAttribute("allWorkers",workerList);
        return "show-all-workers";
    }
}
