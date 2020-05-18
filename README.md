# 지하철 경로 조회 - TDD

## 1단계 - 캐쉬적용

### 요구사항

### HTTP 캐시 적용하기

- [x] HTTP Cache의 종류를 학습
- [x] 지하철 노선도 조회 시 ETag를 통해 캐시를 적용
- [x] LineControllerTest의 ETag 테스트를 성공 시키기

## 2단계 - 지하철 경로 조회 1

### 요구사항

- [x] 출발역과 도착역의 최단 경로를 조회하는 기능 구현
- [x] 기본적인 기능 구현(Happy Case)을 목표로하고 예외 상황(Side Case)에 대한 처리는 다음 단계에서 고려
- [x] TDD 프로세스를 따라서 개발 진행
- [x] 인수 조건 & 인수 테스트 작성
- [x] 기능 구현시 필요한 단위 테스트 작성
- [x] 중복코드를 제거(테스트 코드도 마찬가지로 중복제거)
- [x] 객체지향 생활체조 준수

### 기능 목록

### 경로 조회 API

- [x] 출발역과 도착역을 입력
- [x] 최단 거리 기준으로 경로와 기타 정보를 응답
  - 총 소요시간, 총 거리 등
- [x] 최단 경로가 하나가 아닐 경우 어느 경로든 하나만 응답

## 3단계 - 지하철 경로 조회 2

### 요구사항
- [x] Happy 케이스 이외 예외 상황에 대한 기능 구현
- [x] 단위 테스트를 통해 Side 케이스 검증
- [x] Side 케이스 예시
    - 출발역과 도착역이 같은 경우
    - 출발역과 도착역이 연결이 되어 있지 않은 경우
    - 존재하지 않은 출발역이나 도착역을 조회 할 경우
    
## 4단계 - 지하철 경로 조회 3
### 요구사항
- [x] 최소 시간 경로 기능을 추가
- [x] 최단 경로 조회 기능과의 중복 제거를 수행(테스트 코드도 마찬가지로 중복제거)