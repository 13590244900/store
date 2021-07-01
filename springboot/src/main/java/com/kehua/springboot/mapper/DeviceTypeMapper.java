package com.kehua.springboot.mapper;

import com.kehua.springboot.model.DeviceType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DeviceTypeMapper {

    /**通过id查询**/
    @Select("select * from e_devicetype where id = #{id}")
    DeviceType getDeviceTypeById(@Param("id") int id);
}
