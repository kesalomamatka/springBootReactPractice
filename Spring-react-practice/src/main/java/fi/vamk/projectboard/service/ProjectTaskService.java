package fi.vamk.projectboard.service;

import fi.vamk.projectboard.domain.ProjectTask;
import fi.vamk.projectboard.repository.ProjectTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectTaskService {
    @Autowired
    private ProjectTaskRepository projectTaskRepository;

    public ProjectTask saveOrUpdateProjectTask(ProjectTask projectTask){
        if(projectTask.getStatus()==null || projectTask.getStatus()==""){
            projectTask.setStatus("TO_Do");
        }
        return projectTaskRepository.save(projectTask);
    }
}
