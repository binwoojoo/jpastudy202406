package com.spring.jpastudy.chap02.repository;

import com.spring.jpastudy.chap02.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, String> {

    // 쿼리 메서드: 메서드의 이름에 특별한 규칙을 적용하면 SQL이 규칙에 맞게 생성됨.
    List<Student> findByName(String name);

}
