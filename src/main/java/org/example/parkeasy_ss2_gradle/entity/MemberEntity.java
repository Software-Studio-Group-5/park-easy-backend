package org.example.parkeasy_ss2_gradle.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="member_table")
public class MemberEntity {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)  // unique condition
    private String memberEmail;

    @Column
    private String memberPassword;

    @Column
    private String memberName;
}
