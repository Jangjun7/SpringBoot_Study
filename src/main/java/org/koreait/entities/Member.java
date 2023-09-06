package org.koreait.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.koreait.constants.Role;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name="es_member")
@Data @Builder
@AllArgsConstructor @NoArgsConstructor
public class Member extends BaseEntity {
    @Id @GeneratedValue
    private Long userNo;

    @Column(name="memId", length=40, unique = true, nullable = false)
    private String userId;

    @Column(length=65, nullable = false)
    private String userPw;

    @Column(length=40, nullable = false)
    private String userNm;

    @Transient
    private String introduction;

    @Enumerated(EnumType.STRING)
    private Role role;
}