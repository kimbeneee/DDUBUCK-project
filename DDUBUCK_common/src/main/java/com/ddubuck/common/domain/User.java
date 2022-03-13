package com.ddubuck.common.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor // 기본 생성자 자동 추가
@Entity
@Table( name = "tbl_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( name = "user_name", length = 45, nullable = false)
    private String userName;

    @Column ( name = "agree_marketing", nullable = false, length = 1)
    private String agreeMarketing;

    @Column( nullable = false)
    private String email;

    @Column( nullable = false)
    private String password;

    @Column( name = "phone_number", nullable = false, length = 45)
    private String phoneNumber;

    @Column( length = 45, nullable = false)
    private String nickname;

    @Column( name = "create_at", nullable = false )
    private String createAt;

    @Column( name = "created_by", length = 45, nullable = false)
    private String createdBy;

    @Column( name = "modified_at")
    private String modifiedAt;

    @Column( name = "modifiedBy", length = 45)
    private String modifiedBy;

    @Column(nullable = false,length = 1)
    private String withdraw;

    @Column( name = "withdraw_reason")
    private String withdrawReason;

    @Column( name = "withdraw_type",nullable = false)
    private int withdrawType;

    @Column( name = "last_login")
    private String lastLogin;

    @Column(nullable = false, length = 1)
    private String enabled;

    @Builder
    public User( Long id, String userName, String agreeMarketing, String email, String password, String phoneNumber, String nickname,
                 String createAt, String createdBy, String modifiedAt, String modifiedBy, String withdraw, String withdrawReason,
                 int withdrawType, String lastLogin, String enabled) {

        this.id = id;
        this.userName = userName;
        this.agreeMarketing = agreeMarketing;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.nickname = nickname;
        this.createAt = createAt;
        this.createdBy = createdBy;
        this.modifiedAt = modifiedAt;
        this.modifiedBy = modifiedBy;
        this.withdraw = withdraw;
        this.withdrawReason = withdrawReason;
        this.withdrawType = withdrawType;
        this.lastLogin = lastLogin;
        this.enabled = enabled;
    }
}


