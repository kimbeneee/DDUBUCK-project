package com.ddubuck.common.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor // 기본 생성자 자동 추가
@Entity
@Table( name = "tbl_ddubuck_poi")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( nullable = false)
    private Double latitude;

    @Column( nullable = false)
    private Double longtitude;

    @ManyToOne
    @JoinColumn( name = "user_id")
    private User user;

    @Column( name = "created_at", nullable = false)
    private String createdAt;

    @Column( name = "createdBy", nullable = false, length = 45)
    private String createdBy;

    @Column( name = "modified_at")
    private String modifiedAt;

    @Column( name = "modified_by", length = 45)
    private String modifiedBy;

    @Column( nullable = false)
    private String comment;

    @Builder
    public Position(Long id,Double latitude, Double longtitude, User user, String createdAt, String createdBy, String modifiedAt, String modifiedBy
    ,String comment){
        this.id = id;
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.user = user;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.modifiedAt = modifiedAt;
        this.modifiedBy = modifiedBy;
        this.comment = comment;
    }
}
