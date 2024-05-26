package io.github.sztuwebclub.webcheckin.mapper;

import io.github.sztuwebclub.webcheckin.pojo.CheckInRecord;
import io.github.sztuwebclub.webcheckin.pojo.checkin;
import io.github.sztuwebclub.webcheckin.pojo.user;
import io.github.sztuwebclub.webcheckin.pojo.Task;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface userMapper {
    @Select("SELECT webchekck.user., t.task_name, t.description, ut.is_completed " +
            "FROM webchekck.user t JOIN user_tasks ut ON t.task_id = ut.task_id " +
            "WHERE ut.user_id = #{userId}")
    List<Task> getUserTasks(int userId);

    @Select("SELECT r.record_id, r.task_id, r.check_in_time, r.check_out_time, r.date " +
            "FROM check_in_records r " +
            "WHERE r.user_id = #{userId}")
    List<CheckInRecord> getUserCheckInRecords(int userId);

    @Select("SELECT r.record_id, r.task_id, u.user_id,r.check_in_time " +
            "FROM check_in_records r " +
            "WHERE r.user_id = #{userId}")
    List<checkin> getUsercheckin(int userId);
    @Select("SELECT u.user_id, u.username, u.email " +
            "FROM check_in_records r " +
            "WHERE r.user_id = #{userId}")
    List<user> getUserById(int userId);
    @Select("SELECT u.user_id, u.username, u.email " +
            "FROM check_in_records r " +
            "WHERE r.user_id = #{userId}")
    List<user> updateUser(int userId);
}
