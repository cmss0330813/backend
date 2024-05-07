package com.StoryPick.backend.service.util;

import com.StoryPick.backend.domain.entity.Member;

import jakarta.transaction.Transactional;

public class AuthServiceImpl implements AuthService {

    private final MemberRepository memberRepository;
    
    @Transactional
    public void signup(Member memebr) {
        String loginId = member.getLoginId();
        String loginPwd = member.getLoginPwd();
        String loginStuDept = member.getStuDept();
        String loginStuGrade = member.getStuGrade();
        String loginId = member.getLoginId();
        
        Member sacedMember = new Member(null, null)
    }
}
