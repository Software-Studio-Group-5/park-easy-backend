package org.example.parkeasy_ss2_gradle.repository;

import org.example.parkeasy_ss2_gradle.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity,Long> {
    // check user information by email
    // (select * from member_table where member_email = ?
    Optional<MemberEntity> findByMemberEmail(String memberEmail);

}


// plain -> hash1 -> hash2
