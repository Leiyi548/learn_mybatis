package com.leiyi.dao;

import com.leiyi.pojo.User;
import com.leiyi.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Leiyi548
 * @date 2022/2/25 8:31 下午
 */
public class UserDaoTest {

    @Test
    public void test(){
        // 第一步,获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();


        // 方式一: getMapper
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();
        for (User user : userList){
            System.out.println(user);
        }

        // 关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void getUserById(){
        // 第一步,获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        // 方式一: getMapper
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = userDao.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }
}
