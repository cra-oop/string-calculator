# 진행 방법
1. makkaba/oop-stringcalculator 브랜치를 본인의 레포지토리로 fork 한다.
2. 본인의 레포지토리에서 다운(clone)받은 후, step1 이라는 이름의 브랜치를 만든다.
3. step1 브랜치에서 요구사항을 구현한 후, 일단 본인의 step1 브랜치를 본인 레포지토리에 푸시한다
4. 
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 코드스쿼드의 온라인 코드 리뷰 과정](https://github.com/code-squad/codesquad-docs/blob/master/codereview/README.md)
* [동영상으로 살펴보는 코드스쿼드의 온라인 코드 리뷰 과정](https://youtu.be/a5c9ku-_fok)

# 실습 환경 구축
* 몸풀기 미션인 [문자열 계산기](https://github.com/makkaba/oop-stringcalculator) 저장소 브랜치에 자신의 github 아이디에 해당하는 브랜치가 있는지 확인한다. 없으면 생성 요청한다.
* [텍스트와 이미지로 살펴보는 코드스쿼드의 온라인 코드 리뷰 과정](https://github.com/code-squad/codesquad-docs/blob/master/codereview/README.md) 문서를 참고해 환경 구축한다.

----
# 문자열 사칙 연산 계산기 구현
----
## 요구사항
#### 기능 요구사항
* 사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.
* 문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다. 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
* 예를 들어 "2 + 3 \* 4 / 2"와 같은 문자열을 입력할 경우 2 + 3 \* 4 / 2 실행 결과인 10을 출력해야 한다.

----
#### 프로그래밍 요구사항
* 메소드가 너무 많은 일을 하지 않도록 분리하기 위해 노력해 본다.
* 규칙 1: 한 메서드에 오직 한 단계의 들여쓰기만 한다.
* 규칙 2: else 예약어를 쓰지 않는다.

----
#### 힌트
* 테스트할 수 있는 단위로 나누어 구현 목록을 만든다.
  * 덧셈
  * 뺄셈
  * 곱셈
  * 나눗셈
  * 입력 값이 null이거나 빈 공백 문자일 경우 에러 처리
  * 등등...
* 값을 입력 받는 API는 Scanner를 이용한다.
```
Scanner scanner = new Scanner(System.in);
String value = scanner.nextLine();
int number = scanner.nextInt();
```
* 공백 문자열을 빈 공백 문자로 분리하려면 String 클래스의 split(" ") 메소드를 활용한다.
* 반복적인 패턴을 찾아 반복문으로 구현한다.

----
## 추가 요구사항
* 사칙 연산을 구현하면서 4개의 if문을 사용하는 코드가 발생한다.
* 모든 if문을 제거해 본다.

#### 힌트
* 자바의 다형성을 활용한다. interace와 Map 활용

----
# 실습 마무리
* 실습을 끝내면 [텍스트와 이미지로 살펴보는 코드스쿼드의 온라인 코드 리뷰 과정](https://github.com/code-squad/codesquad-docs/blob/master/codereview/README.md) 문서의 6단계(자신의 저장소에 push), 7단계(pull request)를 진행한다.
* slack에 코드 리뷰 요청을 한다.
* 피드백 또는 merge 될 때까지 기다린다. merge가 되면 다음 단계의 실습을 진행한다.  [텍스트와 이미지로 살펴보는 코드스쿼드의 온라인 코드 리뷰 과정](https://github.com/code-squad/codesquad-docs/blob/master/codereview/README.md) 문서의 9단계부터 진행하면 된다.