package com.cloudm.p.mapper;

import com.cloudm.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    @Select("SELECT * FROM t_user WHERE name = #{name}")
    User findByName(@Param("name") String name);

    @Insert("INSERT INTO t_user(id,name, age) VALUES(#{id},#{name}, #{age})")
    int insert(@Param("id") long id,@Param("name") String name, @Param("age") Integer age);

    @Update("UPDATE t_user SET age=#{age},name=#{name} WHERE id=#{id}")
    void update(User user);

    @Delete("DELETE FROM t_user WHERE id =#{id}")
    void delete(Long id);

    @Results({
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age")
    })
    @Select("SELECT name, age FROM t_user")
    List<User> findAll();

}

