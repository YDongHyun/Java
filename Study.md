##### JAVA

#### 자료형 종류
- int         정수 약 -21억 ~ 21억
- long        부호있는 정수 -9223372036854775808 ~ 9223372036854775807
- double      실수 -0x0.0000000000001P-1022 ~ 0x1.fffffffffffffP+1023 
- boolean     논리형 true, false
- char        문자형 -~2^15-1
- String      문자형 new라는 키워드로 객체를 생성
- StringBuffer
- List
- Map

#### 문자열 함수
```
a.equals(b); \\true,false 같은지 다른지 판별
a.indexOf(특정문자); \\특정문자가 시작되는 인덱스를 반환
a.replaceAll("Java", "World"); \\특정 문자를 다른 문자로 변환
a.substring(0, 4); \\범위의 인덱스의 문자열을 반환
a.toUpperCase();\\모두 대문자로 변경
a.toLowerCase(); \\모두 소문자로 변경
```

#### StringBuffer 

문자열을 추가하거나 변경할때 사용하는 자료형

 ```
StringBuffer sb = new StringBuffer();  \\객체생성
sb.append("hello"); \\sb에 hello를 집어넣음
\\또는
String temp="";
temp+="hello";
 ```
```
\\insert 특정 위치에 원하는 문자열 삽입
sb.insert(0, "hello "); \\0번 인덱스에 hello 삽입 ,원래있던 문자는 밀림
```
```
substring
```

#### 배열

```
\\ex)1부터 10까지 숫자중 홀수들의 집합 배열 만들기
int[] odds={1,3,5,7,9};
\\ex) 요일 배열 만들기
String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
\\또는
String[] weeks = new String[7]; \\new로 객체 생성
weeks[0] = "월";
weeks[1] = "화";
weeks[2] = "수";
weeks[3] = "목";
weeks[4] = "금";
weeks[5] = "토";
weeks[6] = "일";
```

```
\\배열의 길이만큼  for문으로 돌리기  "length"
String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
for (int i=0; i<weeks.length; i++) {
    System.out.println(weeks[i]);
}
```



#### List

배열과 비슷한 자료형, 배열은 크기가 정해져 있지만, 리스트는 자료형의 갯수가 변해도 상관없다.

리스트중의 간단한 ArrayList를 보자

```
\\add
ArrayList pitches = new ArrayList();  #리스트 생성
pitches.add("138");
pitches.add("129");
pitches.add("142");
\\만약 인덱스를 설정하고싶다면
pitches.add(0,"133"); \\이런식으로 작성할것


pitches.get(1);  \\get 1번 인덱스의 값을 반환
pitches.size();  \\size  ArrayList의 개수를 리턴
pitches.contains("142"); \\contains 항목안에 값이 있는지, 불린형으로 리턴
pitches.remove("129"); \\remove 해당하는 값 제거 print하면 성공하면 true 리턴.
pitches.remove(0);   \\remove 인덱스에 해당하는 값 제거, print하면 삭제된 항목을 리턴
```

####  맵(Map)

파이썬의 딕셔너리 역할을 함.

```
\\ ex)
HashMap<String, String> map = new HashMap<String, String>();
map.put("people", "사람");
map.put("baseball", "야구");

map.put("baseball", "야구");  \\put 추가
map.get("people"); \\get key에 해당하는 value값을 리턴
map.containsKey("people");  \\containskey  Map에 해당 key가 있는지 조사해 불린형으로 리턴
map.remove("people");   \\remove 해당하는 (key:value)값을 삭제하고 삭제된 value값을 리턴
map.size();  \\size  Map의 갯수 리턴
```
### 제어문

#### if문

```
\\기본구조 조건문 뒤에는 ;붙이지 않음
if (조건문) { 
    <수행할 문장1>
    <수행할 문장2>
    ...
} else {
    <수행할 문장A>
    <수행할 문장B>
    ...
}
```

비교연산자

```
x < y	x가 y보다 작다
x > y	x가 y보다 크다
x == y	x와 y가 같다
x != y	x와 y가 같지 않다
x >= y	x가 y보다 크거나 같다
x <= y	x가 y보다 작거나 같다  \\파이썬과 동일

and(&&), or(||), not(!)
```

else if # 파이썬의 elif

```
if (pocket.contains("money")) {
    System.out.println("택시를 타고 가라");
}else if(hasCard) {
    System.out.println("택시를 타고 가라");
}else {         
    System.out.println("걸어가라");
```



#### Switch/case 문

```
\\기본 구조  입력변수뒤에는 ;없음
switch(입력변수) {
    case 입력값1: ...
         break; //아니면 다음 case문 실행
    case 입력값2: ...
         break;
    ...
    default: ...
         break;
}
```



#### While 문

```
//기본구조
while (조건문) {
    <수행할 문장1>
    <수행할 문장2>
    <수행할 문장3>
    ...
}
```

```
//무한루프 할려면 조건문에 ture 넣기
//빠져나가기 break사용
while (money > 0) {
    System.out.println("돈을 받았으니 커피를 줍니다.");
    coffee--;
    System.out.println("남은 커피의 양은 " + coffee + "입니다.");
    if (coffee == 0) {
        System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
        break; // 브레이크로 빠져나오기
    }
}
```

```
//While 조건문으로 돌아가기 (countinue)
int a = 0;
while (a < 10) {
    a++;
    if (a % 2 == 0) {
        continue;
    }
    System.out.println(a);
}
//countinue는 while문의 처음으로 (a++;)로 돌아감
```

### for 문

```
String[] numbers = {"one", "two", "three"};  //전형인 for 문
for(int i=0; i<numbers.length; i++) {   \\.length는 리스트의 요소 개수
    System.out.println(numbers[i]);
}
```

```
for (초기치; 조건문; 증가치) //c언어와 동일
```

```
int[] marks = {90, 25, 67, 45, 80};
for(int i=0; i<marks.length; i++) {
    if (marks[i] < 60) {
        continue;   \\ 컨티뉴를 만나면 for문의 처음으로 돌아가게 된다.
    }
    System.out.println((i+1)+"번 학생 축하합니다. 합격입니다.");
}
```



#### for each 문

```\
String[] numbers = {"one", "two", "three"};
for(String number: numbers) {      \\ 더 직관적. 
    System.out.println(number);
}
```

```
for (type var: iterate) {   \\기본 구조  iterate는 루프를 돌릴 객체,한개씩 순차적으로 var에 대입. iterate에 배열및 ArrayList도 가능
    body-of-loop
}
```

 for each문은 따로 반복회수를 명시적으로 주는 것이 불가능, 1스탭씩 순차적으로 반복될때만 사용 가능하다.
