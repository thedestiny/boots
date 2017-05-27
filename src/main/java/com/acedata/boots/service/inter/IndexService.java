package com.acedata.boots.service.inter;

import com.acedata.boots.domain.ext.TaskExt;
import com.acedata.boots.domain.pojo.User;

import java.util.List;


public interface IndexService {

    List<String> queryList();

    User queryUserByName(String name);

    List<TaskExt> getTaskList();

    Integer saveTask(TaskExt taskExt);


}
