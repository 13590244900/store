package com.kehua.springboot.controller;

import com.kehua.springboot.mapper.DeviceTypeMapper;
import com.kehua.springboot.model.DeviceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class DeviceTypeController {

    @Autowired
    private DeviceTypeMapper deviceTypeMapper;

    /**
     * 通过ID查询设备类型
     * @return
     */
    @RequestMapping(value = "/getDeviceTypeById/{id}", method = RequestMethod.GET)
    public String getDeviceTypeById(HttpServletRequest request, HttpServletResponse response,@PathVariable int id){
        DeviceType deviceType =  deviceTypeMapper.getDeviceTypeById(id);
        return deviceType.getName();
    }


    /**
     * 通过ID查询设备类型
     * @return
     */
    @RequestMapping(value = "/getDeviceTypeByIds", method = RequestMethod.GET)
    public String getDeviceTypeByIds(HttpServletRequest request, HttpServletResponse response){
        String id = request.getParameter("id");
        DeviceType deviceType =  deviceTypeMapper.getDeviceTypeById(Integer.parseInt(id));
        return "哈哈";
    }



}
