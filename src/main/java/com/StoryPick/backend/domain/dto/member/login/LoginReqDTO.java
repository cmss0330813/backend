package com.StoryPick.backend.domain.dto.member.login;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;


@Getter
@Builder
public class LoginReqDTO {
    private final String loginId;
    private final String loginPwd;

    @JsonCreator
    public LoginReqDTO(@JsonProperty("loginId")String loginId, @JsonProperty("loginPwd")String loginPwd) {
        this.loginId = loginId;
        this.loginPwd = loginPwd;
    }}
