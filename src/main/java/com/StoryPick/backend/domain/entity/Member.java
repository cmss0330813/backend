package com.StoryPick.backend.domain.entity;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



@Entity
@Getter
@Setter
@AllArgsConstructor


public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    private Long id;

    @Column(nullable = false, unique = true)
    private String loginId;

    @Column(nullable = false)
    private String loginPwd;

    @Column(nullable = false, unique = true)
    private String stuDept;

    private Integer stuGrade;




    public Member(String loginId, String loginPwd, String stuDept, int stuGrade) {
        this.loginId = loginId;
        this.loginPwd = loginPwd;
        this.stuDept = stuDept;
        this.stuGrade = stuGrade;
    }

    public Member(String loginId, String loginPwd) {
        this.loginId = loginId;
        this.loginPwd = loginPwd;
    }
}
