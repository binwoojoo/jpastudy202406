package com.spring.jpastudy.chap05.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "purchaseList")
@Builder
@EqualsAndHashCode(of = "id")

@Entity
@Table(name = "tbl_mtm_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "user_name")
    private String name;

    @OneToMany(mappedBy = "user", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Purchase> purchaseList = new ArrayList<>();

}
