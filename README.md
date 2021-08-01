## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```
<br><br>

> 기능 리스트

프로그래밍 요구사항
- 상속과 추상 메소드 활용
- if/else 절 사용x
- 3개 이상의 인스턴스 변수 사용x
- 게터, 세터, 프로퍼티 사용x
- 클래스는 가능한 작게 생성
<br><br>

1. 연료 주입(상속)
   - 소나타 2대, 아반떼 1대, k5 2대 보유
   - 예약된 목적지의 거리에 따라 필요한 연료 주입
   - 연비 : 소나타(10km/l), 아반떼(15km/l), k5(13km/l)
<br><br>

2. 연료주입(인터페이스)
   - 기능은 동일
   - 그러나 인터페이스에 기존 4개의 메소드를 다 넣으면 주입해야 할 연료량의 경우 매번 오버라이딩을 해야해서 중간 다리 역할이 하나 필요할 것 같음

<br><br>
[공부]  
1. 디자인 패턴 - factory method(팩토리 메소드)
   - https://niceman.tistory.com/143 참고
   - 객체 생성을 대신 수행해주는 공장의 개념
- 장단점
   - 생성할 클래스를 미리 알지 못해도 팩토리 클래스가 객체 생성 담당
   - 객체의 자료형이 하위 클래스에 의해서 결정 -> 확장 용이성
   - 동일한 형태로 프로그래밍 가능
   - 확장성 있는 전체 프로젝트 구성 가능
   - 객체가 늘어날 때 마다 하위클래스 재정의로 인한 불필요한 많은 클래스 생성 가능성
