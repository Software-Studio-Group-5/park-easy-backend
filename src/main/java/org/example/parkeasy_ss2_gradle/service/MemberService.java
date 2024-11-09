package org.example.parkeasy_ss2_gradle.service;

import lombok.RequiredArgsConstructor;
import org.example.parkeasy_ss2_gradle.dto.MemberDTO;
import org.example.parkeasy_ss2_gradle.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    public void save(MemberDTO memberDTO) {

    }
}


