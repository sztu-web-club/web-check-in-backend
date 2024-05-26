package io.github.sztuwebclub.webcheckin.mapper;

import io.github.sztuwebclub.webcheckin.pojo.Task;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface taskMapper {
    @Select("SELECT * FROM tasks")
    List<Task> findAll();

    // 根据任务ID查询任务
    @Select("SELECT * FROM tasks WHERE task_id = #{taskId}")
    Task findById(Long taskId);

    // 插入新任务
    @Insert("INSERT INTO tasks (task_name) VALUES (#{taskName})")
    @Options(useGeneratedKeys = true, keyProperty = "taskId")
    void insert(Task task);

    // 更新任务信息
    @Update("UPDATE tasks SET task_name = #{taskName} WHERE task_id = #{taskId}")
    void update(Task task);

    // 删除任务
    @Delete("DELETE FROM tasks WHERE task_id = #{taskId}")
    void delete(Long taskId);
}
