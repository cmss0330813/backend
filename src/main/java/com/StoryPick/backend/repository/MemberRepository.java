package com.StoryPick.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.StoryPick.backend.domain.dto.member.signup.SignupReqDTO;

public interface MemberRepository extends JpaRepository<Member, Long>{
    void save(SignupReqDTO signupReqDTO);

    Member findByLoginId(String loginId);
    boolean findByLoginPw(String loginPw);
}
