package org.koreait.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data @Builder
@AllArgsConstructor @NoArgsConstructor
public class Member {
    @Id
    private Long userNo;
    private String userId;
    private String userPw;
    private String userNm;
    private LocalDateTime regDt;
}
