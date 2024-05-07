package com.StoryPick.backend.domain.dto.member;

import lombok.Builder;
import lombok.Getter;

@Getter
public class MemberListResDTO {
    private final Long id;
    private final String loginId;
    private final String loginPwd;
    private final String stuDept;
    private final Integer stuGrade;

 @Builder
    public MemberListResDTO(Long id, String loginId, String loginPwd, String stuDept, int stuGrade, RoleType roleType) {
        this.id = id;
        this.loginId = loginId;
        this.loginPwd = loginPwd;
        this.stuDept = stuDept;
        this.stuGrade = stuGrade;
        this.roleType = roleType;
    }

    public MemberListResDTO(Member member) {
        this.id = member.getId();
        this.loginId = member.getLoginId();
        this.loginPwd = member.getLoginPwd();
        this.stuDept = member.getStuDept();
        this.stuGrade = member.getStuGrade();
        this.roleType = member.getRoleType();
    }


}

