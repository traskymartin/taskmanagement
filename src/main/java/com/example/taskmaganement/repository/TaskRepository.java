    package com.example.taskmaganement.repository;
    
    import com.example.taskmaganement.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUserId(Long userId);
    // Additional query methods for filtering
}