package com.spring.jpastudy.chap04_relation.entity;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@ToString(exclude = "department") // 연관 관계 필드는 제외
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
    // EAGER Loading: 연관된 데이터를 항상 JOIN을 통해 같이 가져옴
    // LAZY Loading: 해당 엔터티 데이터만 가져오고 필요한 경우 연관 엔터티를 가져옴
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dept_id") // fk 컬럼명
    private Department department;

//    @ManyToOne
//    @JoinColumn(name = "receive_dept_id")
//    private Department department2;

}
