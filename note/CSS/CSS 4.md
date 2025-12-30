[[CSS]]
## position
	static : 기본값

	relative : 상대값
	- 원래 위치를 기준으로 이동
		- top, left, right, bottom
	- 원래 내 공간은 남아있다.

	absolute : 절대값
	- 조상 요소 중에서 포지션이 static이 아닌 것을 기준으로 (없으면 body) 좌상단을 0, 0
	- 새로운 층(layer) 에 그려진다
		- 브라우저가 표시할 계획 단계에서는 빠져서 원래 자리가 없게 됨
		- 브라우저 rendering에 새로운 layer에 그린다
	- 해당 태그는 inline-block으로 변경 됨
	- right나 bottom을 쓰는 경우 주의
		- 최상단 스크롤에서 viewport의 오른쪽과 아래를 기준으로 최초에 그려진다.
		- 그 이후 스크롤에 관계 없이 거기에 있게 된다.

	fixed : 고정값
	- viewport 의 해당 위치에 고정
	- 스크롤과 관계 없음
	- 맨 위로 가기 버튼

	sticky
	- 스크롤을 내려서 안 보이게 되었을 때 "fixed" 처럼 동작
	- 원래 보이는 상태에서는 기능 X
	- 예)  엑셀의 틀 고정

## Z-index
	기본값 : 0
	position을 쓰는 경우 늦게 나온 html tag가 위에 보이게 된다.
	position에서만 사용 가능
	높은 z-index가 최우선 상단으로 보이게 된다

## Calc
	간단한 계산식 사용할 때
	+, - 앖 뒤로 공백 필요
```
left: cala( (50%) - (100px/2) )
```

## 변수 사용법
	값에 이름을 붙여서 미리 정해놓고 가져다 사용하는 것
```
:root {  
    --menucolor: rgb(0, 0, 255);  
}  
  
.p1 {  
    background-color: var(--menucolor);  
}
```
