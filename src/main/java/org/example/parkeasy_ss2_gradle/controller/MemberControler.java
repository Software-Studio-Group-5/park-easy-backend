package org.example.parkeasy_ss2_gradle.controller;

import org.example.parkeasy_ss2_gradle.dto.MemberDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberControler {
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
        return "index";

    }
}
