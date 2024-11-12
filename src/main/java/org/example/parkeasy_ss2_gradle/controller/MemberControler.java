package org.example.parkeasy_ss2_gradle.controller;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.example.parkeasy_ss2_gradle.dto.MemberDTO;
import org.example.parkeasy_ss2_gradle.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class MemberControler {
    // Insert constructor
    private final MemberService memberService;


    // call to registraion
    @GetMapping("/member/save")
    public String saveForm(){
        return "save";
    }

    @PostMapping("/member/save")
//    public String save(@RequestParam("memberEmail") String memberEmail,
//                       @RequestParam("memberPassword") String memberPassword,
//                       @RequestParam("memberName") String memberName
//                       ){
    public String save(@ModelAttribute MemberDTO memberDTO){
        System.out.println("MemberControler.save");
//        System.out.println("memberEmail = " + memberEmail + ", memberPassword = " + memberPassword + ", memberName = " + memberName);
        System.out.println("memberDTO = " + memberDTO);
//        System.out.println("memberEmail= " + memberEmail);

        memberService.save(memberDTO);
//        return "index";
        return "login";
    }

    @GetMapping("/member/login")
    public String loginForm(){
        return "login";
    }

    @PostMapping("/member/login")
    public String login(@ModelAttribute MemberDTO memberDTO, HttpSession session){
        MemberDTO loginResult = memberService.login(memberDTO);
        if(loginResult != null){
            // login success
            session.setAttribute("loginEmail", loginResult.getMemberEmail());
            return "main";
        } else {
            // login fail
            return "login";
        }
    }




}
