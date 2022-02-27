package com.leiyi.dao;

import com.leiyi.pojo.Device;
import com.leiyi.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Leiyi548
 * @date 2022/2/26 15:26
 */
public class DeviceMapperTest {
    @Test
    public void insertDevice() {
        // 第一步,获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        DeviceMapper deviceDao = sqlSession.getMapper(DeviceMapper.class);
        int res = deviceDao.insertDevice(new Device(666, "computerzz", 1888, "2000-12-25"));
        if (res > 0) {
            System.out.println("insert success!!!");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteDevice() {
        // 第一步,获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 方式一: getMapper
        DeviceMapper deviceDao = sqlSession.getMapper(DeviceMapper.class);
        int res = deviceDao.deleteDevice(9);
        if (res > 0) {
            System.out.println("delete success!!!");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getDeiveByDate() {
        // 第一步,获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 方式一: getMapper
        DeviceMapper deviceDao = sqlSession.getMapper(DeviceMapper.class);
        List<Device> deviceList = deviceDao.getDeviceByDate();
        for (Device device : deviceList) {
            System.out.println(device);
        }
        // 关闭SqlSession
        sqlSession.close();
    }
}
