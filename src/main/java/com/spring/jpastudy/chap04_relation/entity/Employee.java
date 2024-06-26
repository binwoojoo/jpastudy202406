package com.spring.jpastudy.chap04_relation.entity;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "tbl_emp")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long id;

    @Column(name = "emp_name", nullable = false)
    private String name;

    // 단 방향 매핑 - 데이터베이스처럼 한 쪽에 상대방의 pk를 fk로 갖는 형태
    @ManyToOne
    @JoinColumn(name = "dept_id") // fk 컬럼명
    private Department department;

//    @ManyToOne
//    @JoinColumn(name = "receive_dept_id")
//    private Department department2;

}
