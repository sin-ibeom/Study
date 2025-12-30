[[CSS]]
# 배경 관련

	background-color : 배경색 변경

	background-image : url('이미지 주소')
	- 두개 이상 사용 가능, 앞에서 부터 앞쪽에 보임
	- 좌우 상하로 반복 됨

	background-repeat
	- no-repeat : 반복하지 않음
	- repeat x, y : x 또는 y 축으로만 반복

	background-size
	- 이미지의 크기 변형
	- x축크기 y축크기 px, % 사용 가능
	- cover : 원본 비율을 유지하면서 모든 영역을 이미지로 덮는다 (그림의 일부가 잘릴 수 있다)
	- contain : 원본 비율을 유지하면서 모든 그림을 보여준다(영역의 이미지가 없을 수 있다)

	background-position
	 - 이미지의 위치를 조절할 수 있다
	 - x축위치 y축위치 : px, % 사용 가능
	 - left, right, top, bottom, center 사용 가능

	background-attachment : fixed
	 - 브라우저 전체 스크롤의 관계 없이 그 자리에 있는 이미지 처럼 보이는 기술

	background : 축약형
	- color || image || repeat || position/size || attachment
	- 순서에 관계없이, 그리고 종류에 관계없이 막 사용할 수 있다

## shadow
	text-shadow : offset-x offset-y blur color
	- 원본에서 x축으로 offset-x만큼 y 축으로 offset-y 만큼 떨어진 위치에
	- blur로 흐려지게 color로 표시, blur는 생략 가능

	box-shadow : offset-x offset-y blur spread color
	- spread : 번지는 효과
	- 보통 card 형태로 만들 때 사용한다

## display
	block
	- 좌우로 최대 너비를 가진다
		- 부모의 너비 만큼
	- 새로운 줄에 표시된다
	- 요소의 너비가 최대 크기보다 작은 경우 정렬이 가능하다
		- margin : 0 auto;
	inline
	- 컨텐츠 만큼의 너비를 가진다
	- 표시될 공간이 있으면 옆에 표시되고 없으면 다음줄에 표시된다 - 글씨와 같다
	- width, height를 가질 수 없다.
	- margin, padding은 좌우로만 적용된다.
		- padding의 경우 상하는 border에 영향은 주지만 영향 X
	inline-block
	- inline에 block의 볼륨감을 더한 것
	- width, height, maring, padding을 가질 수 있다.
	- inline처럼 옆에 빈 공간이 있다면 표시할 수 있다.
		- 옆에 표시되는 경우 baseline 즉 글씨 맨 아래 부분으로 정렬
		- vertical align:top으로 상단 정렬 가능
			- vertical align은 inline, inline-block만 적용된다
	none
	- 화면에서 감추기
	- 브라우저에서 표시할 내용을 배치할 때 빠짐