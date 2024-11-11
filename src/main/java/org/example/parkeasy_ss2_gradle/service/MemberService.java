package org.example.parkeasy_ss2_gradle.service;

import lombok.RequiredArgsConstructor;
import org.example.parkeasy_ss2_gradle.dto.MemberDTO;
import org.example.parkeasy_ss2_gradle.entity.MemberEntity;
import org.example.parkeasy_ss2_gradle.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    public void save(MemberDTO memberDTO) {
        // 1. dto -> entity
        // 2. call save from repository
        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
        memberRepository.save(memberEntity);
        // call save method from repository ( forwarding entity objects)
    }
}


