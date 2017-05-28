package com.acedata.boots.service.impl;

import com.acedata.boots.domain.ext.TaskExt;
import com.acedata.boots.domain.ext.UserExt;
import com.acedata.boots.mapper.TaskMapper;
import com.acedata.boots.mapper.UserMapper;
import com.acedata.boots.service.inter.IndexService;
import com.acedata.boots.util.string.StringUtils;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;


@Service
public class IndexServiceImpl implements IndexService {


    @Autowired
    private TaskMapper taskMapper;

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<String> queryList() {

        List<String> list = Lists.newArrayList("12", "23", "56", "98", "87");
        Collections.sort(list);

        for (String str : list) {
            System.out.println("str is : " + str);
        }

        return list;
    }

    @Override
    public UserExt queryUserByName(String name) {

        UserExt user = new UserExt();
        user.setAddress("USA");
        user.setAge(7);
        user.setUserName("jim");

        return user;
    }

    @Autowired
    public List<TaskExt> getTaskList() {
        // List<TaskExt> taskIterable = taskMapper.queryAll();


        return null;

    }

   @Autowired
    public Integer saveTask(TaskExt task) {

       task.setId(StringUtils.generateUUID());
       return taskMapper.save(task);

    }





}
