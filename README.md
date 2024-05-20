# 이전 요구사항
- [x] gradle 의존성 추가
- [x] 엔티티 매핑
  - [x] Theme
  - [x] Time
  - [x] Member
  - [x] Reservation
- [x] 연관관계 매핑
- [x] JDBC JPA로 전환
  - [x] Theme
  - [x] Time
  - [x] Member
  - [x] Reservation
- [x] 내 예약 목록 조회 기능 API
  - GET /reservations-mine HTTP/1.1
    - {
      "reservationId": 1,
      "theme": "테마1",
      "date": "2024-03-01",
      "time": "10:00",
      "status": "예약"
      },

# 예약 대기 기능 요구사항
- [x] 예약 대기 요청 기능을 구현하세요.
- [x] 예약 대기 취소 기능도 함께 구현하세요.
- [x] 내 예약 목록 조회 시 예약 대기 목록도 함께 포함하세요.
- [x] 예약 번호 조회
  - [x] 같은 테마, 날짜, 시간의 예약 대기 중 내 예약 대기 보다 빨리 생성된 갯수를 함께 응답하세요.
  - [x] 기존 Waiting 클래스만으로는 순위 정보를 받기 어려우니 새로운 객체를 만들어 주세요.
- [x] 중복 예약이 불가능 하도록 구현하세요.
- [x] 화면 응답
  - 3단계 클라이언트 코드 커밋 을 참고하여 기존 파일을 수정합니다.
  - TODO: [3단계] 주석을 찾아 수정합니다.
- [x] 심화 요구사항 - 내 예약 목록의 예약 대기 상태에 몇 번째 대기인지도 함께 표시하세요.

# 예약 대기 관리
- [ ] 어드민에서 예약 대기 관리 기능을 구현하세요.
  - [x] 어드민은 예약 대기 목록을 조회할 수 있다
  - [ ] 어드민은 예약 대기를 취소시킬 수 있다
- [ ] 예약 대기 승인 기능을 구현하세요.
  - [ ] 예약 취소가 발생 시 예약 대기자가 있는 경우 예약 승인이 되는 기능을 구현하세요.
    - [ ] 자동 승인: 예약 취소가 발생하는 경우 예약 대기가 있을 때 우선순위에 따라 자동으로 예약이 되도록 할 수 있다.
- [ ] 화면 응답
  - [ ] 4단계 클라이언트 코드 커밋 을 참고하여 새로운 파일을 추가합니다.
  - [ ] TODO: [4단계] 주석을 찾아 수정합니다.

## 리팩토링 목록
- [ ] 테스트 추가
- [ ] 내 예약 조회 접근 권한 
- [ ] waiting service 분리 고려
- [ ] email, password에 대한 검증
- [ ] not null 적용
- [ ] 왜 @not null 엔티티에 적용하면 ddl 적용도 되고, 쿼리문 안날리고 null 잡는댔는데- 왜 not null이 안들어가지?
- [ ] WaitingResponse 경량화
