## JPQL : Java Persistence Query Language
    - 엔티티 기준의 쿼리, 조회 결과 -> 영속 상태

# Entity 설계하기
1) 엔티티 매핑 관련 애노테이션
   - @GeneratedValue
     - 자동 증감번호
     - DBMS : 자동 증감번호 생성 전략에 차이
       - mysql : PRIMARY KEY + AUTO_INCREMENT