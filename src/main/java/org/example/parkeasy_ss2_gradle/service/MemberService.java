package org.example.parkeasy_ss2_gradle.service;

import lombok.RequiredArgsConstructor;
import org.example.parkeasy_ss2_gradle.dto.MemberDTO;
import org.example.parkeasy_ss2_gradle.entity.MemberEntity;
import org.example.parkeasy_ss2_gradle.repository.MemberRepository;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;



import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
//    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
    // registration
    public void save(MemberDTO memberDTO) {
        // 1. dto -> entity
        // 2. call save from repository

//        memberDTO.setMemberPassword(encoder.encode(memberDTO.getMemberPassword()));

        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
        memberRepository.save(memberEntity);
        // call save method from repository ( forwarding entity objects)
    }

    public MemberDTO login(MemberDTO memberDTO) {
        /*
            1. check email from DB query
            2. check the password match between input and DB
         */
        Optional<MemberEntity> byMemberEmail = memberRepository.findByMemberEmail(memberDTO.getMemberEmail());
        if(byMemberEmail.isPresent()){
            MemberEntity memberEntity = byMemberEmail.get();
            if (memberEntity.getMemberPassword().equals(memberDTO.getMemberPassword())){
                // entity -> dto
                MemberDTO dto = MemberDTO.toMemberDTO(memberEntity);
                return dto;
            } else {
                return null;
            }
        } else {
            return null;

        }
    }
}


