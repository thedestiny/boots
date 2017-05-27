package com.acedata.boots.mapper;

import com.acedata.boots.domain.ext.TaskExt;
import com.acedata.boots.mapper.basic.BasicMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TaskMapper extends BasicMapper<TaskExt, String> {


}
