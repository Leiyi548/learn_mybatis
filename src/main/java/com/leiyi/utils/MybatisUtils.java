package com.leiyi.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Leiyi548
 * @date 2022/2/24 2:36 下午
 */
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        String resource = "configuration.xml";
        try {
            //使用Mybatis获取与sqlSessionFactory对象
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //既然有了 SqlSessionFactory，顾名思义，我们可以从中获得 SqlSession 的实例。
    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }
}
