package com.project.codematchr.board.dto.request.auth;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SignUpRequestDto {
    @NotBlank @Email
    private String userEmail;
    @NotBlank @Length(min=8)
    private String userPassword;
    @NotBlank
    private String userNickname;
    @NotBlank @Pattern(regexp="^[0-9]{11,12}$")
    private String userTelnumber;
    @NotBlank
    private String userAddress;

    private String userAddressDetail;

    private String userProfileImageUrl;
}
