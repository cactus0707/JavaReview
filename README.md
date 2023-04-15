# JavaReview
# 자바 복습을 위한 Udemy 학습
- 노션 연재 "내가 자바를 완전히 까먹는다면?" 의 부록 코드 입니다.
#### Chapter 7 부터 브랜치 전략 적용(git-flow)
### As - Is
  - Overview git-flow
    - master : 제품으로 출시될 수 있는 branch
    - develope : 다음 출시 버전을 개발 하는 branch
    - feature : 기능을 개발하는 branch
    - release : 이번 출시 버전을 준비하는 branch
    - hotfix : 출시 버전에서 발생한 버그를 수정하는 브랜치
### To - Be
  - 학습에 브랜치 전략 적용 하기
    - master : 완료된 모든 release branch의 merge branch
    - develop : 현재 진행 중인 Chapter Branch
      - ex)develope/chapter1_[chapterName], develope/chapter2_[chapterName]
    - feature/concept : 현재 진행 중인 챕터에서, 개념 부분의 Branch
      - ex)feature/concept/conceptName]
    - feature/coding : 현재 진행 중인 챕터에서, Coding Exercise branch
      - ex)feature/coding/ProblemName]
    - release : 완료된 챕터의 branch 
      - ex) release/chapter1, release/chapter2 ...etc.
    - hotfix : 학습 완료된 버전에서 수정할 부분을 추가하는 branch
### Package Naming 규칙
   - [SectionName_Subtitle]_[Concept | CodingExerciseName]
   - ex) section5_ExpressionStatements
   - ex) section6_DigitSum