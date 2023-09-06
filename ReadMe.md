## JPQL : Java Persistence Query Language
    - 엔티티 기준의 쿼리, 조회 결과 -> 영속 상태

# Entity 설계하기
1) 엔티티 매핑 관련 애노테이션
   - @GeneratedValue
     - 자동 증감번호
     - DBMS : 자동 증감번호 생성 전략에 차이
       - mysql : PRIMARY KEY + AUTO_INCREMENT : 시스템에서 알아서 생성
       - oracle : 시퀀스 객체
     - 테이블

   - @Lob : Large Object :
     - : text
2) 공통속성화
   - 상속
   - @MappedSuperclass
3) 기본키(Primary Key) 여러개 조합해서 생성
   - @IdClass
   - 기본생성자, 맴버 변수를 초기화 하는 생성자
   - equals() and hashcode()
4) Repository 설계하기
   - JpaRepository 인터페이스를 상속 > 구현객체 자동 생성
   - S findById(...)
   - List\<S> findAll(...)
   - S save(S entity) : EntityManager::persist(..)
   - S saveAndFlush(S entity) : > save() + flush()
   - List\<S> saveAll(Collection\<S> entity)