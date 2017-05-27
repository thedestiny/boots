package com.acedata.boots.mapper;

import com.acedata.boots.domain.ext.UserExt;
import com.acedata.boots.mapper.basic.BasicMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BasicMapper<UserExt, Long> {



}
