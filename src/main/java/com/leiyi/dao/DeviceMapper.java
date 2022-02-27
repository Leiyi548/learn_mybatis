package com.leiyi.dao;

import com.leiyi.pojo.Device;

import java.util.List;

/**
 * @author Leiyi548
 * @date 2022/2/26 15:11
 */
public interface DeviceMapper {
    List<Device> getDeviceByDate();
    int insertDevice(Device device);
    int deleteDevice(int id);
}
