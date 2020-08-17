package com.example.demo.repository;

import com.example.demo.entity.User;
import com.example.demo.entity.UserItemVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Query(value="select new com.example.demo.entity.UserItemVO(i.itemId,u.userId,i.itemName,u.name) from User as u left join Item as i ON u.userId = i.userId")
    List<UserItemVO> findBySql();
}
