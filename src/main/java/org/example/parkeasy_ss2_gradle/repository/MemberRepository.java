package org.example.parkeasy_ss2_gradle.repository;

import org.example.parkeasy_ss2_gradle.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity,Long> {

}
