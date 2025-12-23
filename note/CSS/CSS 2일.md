[[CSS]]
## 폰트
- color : 글씨 색 변경
- font-family : 폰트 적용
	- font-familly: 'GMarketSans', Arial;
	- 첫번째 폰트가 없을 때 두번째 폰트 적용
- font-style : italic <- 가울암 체
- font-weight : 글씨 두께
	- 100 ~ 1000까지 100 단위로 사용가능
	- 높을 수록 두꺼워 짐
	- 폰트가 지원하는 두께만 사용 가능
- font-size : 글씨 크기
	- 보통 px이나 em 단위를 사용한다
- text-align : 좌우 정렬
	- right, center, left, justify(양쪽 정렬)
- letter-spacing : 자간 (글씨간의 간격)
- line-height : 줄 간격
	- 박스의 높이와 동일한 값을 줘서 **세로 방향 중앙 정렬할 때**도 사용된다
- white-space : nowrap
	- 꽉 차도 다음 줄로 넘기지 않게 하는 것
- word-wrap : break-word
	- 한 단어가 길어도 너비를 벗어나지 않게 줄 바꿈 해줌
	- 원래 자동 줄 바꿈 되는 건 유지한다
- word-break : break-all
	- word-wrap과 비슷 함
	- 원래 줄 바꿈 되는 것 무시
- text-decoration
	- underline : 밑 줗
	- line-through : 취소선
	- none : 줄 없음 ( a 태그 줄 없앨 때 )

## 박스 모델

### margin
- 테두리 밖의 영역
- margin 축약 형식
	- 12시 방향부터 시계 방향
- 4개 일 때 : top, right, bottom, left
- 3개 일 때 : top , 좌우, bottom
- 2개 일 때 : 위아래, 좌우
- 1개 일 때 : 상하좌우 동시
```
auto : 좌우로 가운데 정렬
```
### padding
- 테두리 안 쪽 영역
- padding 축약 형식은 margin과 같다

### border
- border-top-width, style, color 이 3가지가 있어야 테두리 표현 가능
- 위 내용을 줄여서 border-top으로 사용
- border 축약
	- border : width style color
	- border : 1px solid red
- border-radius : 모서리를 둥글게 변환
	- 축약형의 경우 11시 방향부터 시계 방향


### width
- 컨텐츠 영역의 너비
- min-width : 최소로 보장하는 너비
- max-width : 최대로 보장하는 너비

### height
- 컨텐츠 영역의 높이
- min-height, max-height

### 마진 중첩
- 세로 방향으로 붙어 있을 때 또는 부모와 첫번째 자식 간에 margin이 더해 지지 않고 
- 큰 값 하나만 적용 되는 현상
- 해법
	- 부모에 overflow : hidden 적기
		- 주로 사용
		- 일부로 형제간의 마진 중첩을 해소하기 위해 부모를 설정하기도 함
	- border, padding 사용 하기
	- 컨텐츠 적기

### box-sizing
-border-box : 테두리 두께 + padding +  컨텐츠의 크기를 width나 height로 계산
기본은 컨텐츠의 크기만 width, height로 계산