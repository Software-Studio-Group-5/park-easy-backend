package org.example.parkeasy_ss2_gradle.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.parkeasy_ss2_gradle.dto.MemberDTO;
import org.example.parkeasy_ss2_gradle.repository.MemberRepository;

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

    public static MemberEntity toMemberEntity(MemberDTO memberDTO){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setMemberEmail(memberDTO.getMemberEmail());
        memberEntity.setMemberPassword(memberDTO.getMemberPassword());
        memberEntity.setMemberName(memberDTO.getMemberName());
        return memberEntity;
    }


}
