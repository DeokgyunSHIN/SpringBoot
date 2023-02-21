# lombok

> lombok은 java 기반으로 Getter, Setter, toString 등등 필요한 메소드들을 간편하게 사용 할수 있게 해주는 라이브러리이다.


<br>
<br>

### lombok 설정 

<img width="878" alt="스크린샷 2023-02-21 오후 10 44 27" src="https://user-images.githubusercontent.com/104719555/220362341-9e561762-4fe4-4e55-85ed-941cae4237ef.png">

gradle 파일안에  dependencies 곳에 적어주고 lombok을 쓰겠다고 설정을 해준다.

<br>
<br>
<br>
<br>


### @Setter , @Getter 

<img width="771" alt="스크린샷 2023-02-21 오후 10 47 50" src="https://user-images.githubusercontent.com/104719555/220363049-1eaedbda-b03c-4da4-8c2c-5b2ad2d3cc87.png">

우리가 기존에는 Setter 와 Getter를 쓰기 위해서는 일일히 메소드를 만들어줘야 하는 불편함이 생겼다.

그런데 롬복으로 (@ -> 어노테이션)을 붙여서 @Getter 와 @Setter를 붙여주면 내가 메소드를 만들어주지 않아도 자동으로 Getter , Setter의 메소드를 만들어줘서 

쓸수 있다는 것을 알수 있다.

<img width="1350" alt="스크린샷 2023-02-21 오후 10 51 54" src="https://user-images.githubusercontent.com/104719555/220363921-1a177c4a-6379-4c60-b1cb-23981ad36998.png">

<br>
<br>
<br>
<br>


### @ToString

<img width="610" alt="스크린샷 2023-02-21 오후 10 55 08" src="https://user-images.githubusercontent.com/104719555/220364639-eb4c9376-7d9e-4f47-8638-9601935657e0.png">

ToString 또한 메소드를 생성해서 만들어줘 주었다. 만약에 저기에 필드가 추가가 되면 지우고 다시 toString 자동추가 단축키를 써서 메소드를 생성해주거나 

직접 추가해줘야 하는 불편함이 있다. 이럴떄는 그냥 클래스 위에 @toString 을 적어주면 된다.

<img width="1332" alt="스크린샷 2023-02-21 오후 10 57 41" src="https://user-images.githubusercontent.com/104719555/220365239-6adb125f-07ce-4c4e-bf82-1b20e1739d08.png">

위의 사진처럼 어노테이션을 클래스 위에 걸어주고 쓰면 자동으로 만들어주기 떄문에 필드가 추가 되더라도 다시 설정할 필요없이 쓸수 있다.


<br>
<br>
<br>
<br>

### @NonNull

쉽게 말하면 Null이 들어갈수 없다느 것이다. 필드에....

만약에 설정후 null 일 경우는 NullPointException 이 발생한다.


<br>
<br>
<br>
<br>

### @NoArgsConstructor, @AllArgsConstructor, @RequiredArgsConstructor

 @NoArgsConstructor -> 뜻은 매개변수가 없는 생성자를 구현 한다.
 
 <img width="319" alt="스크린샷 2023-02-21 오후 11 17 25" src="https://user-images.githubusercontent.com/104719555/220369898-8aac213a-68aa-49fe-b0fc-aa166c5709fe.png">

순수 자바 코드를 보게 되면 매개변수가 없는 생성자이다. @NoArgsConstructor 붙여주면 굳이 생성자를 만들어줄 필요없이 쓸수 있다. 
 
 <img width="341" alt="스크린샷 2023-02-21 오후 11 19 24" src="https://user-images.githubusercontent.com/104719555/220370313-baa69da9-2830-4079-a50e-e70392f98709.png">

 
 @AllArgsConstructor -> 클래스 안에 있는 모든 필드를 매개변수로 갖는 생성자를 구현한다.
 
 처음 모든 필드를 매개변수로 같은 생성자를 만들 때는 
 
 <img width="668" alt="스크린샷 2023-02-21 오후 11 28 02" src="https://user-images.githubusercontent.com/104719555/220372472-149b2c44-324a-48b9-8942-8a43155d3eef.png">

위의 사진 처럼 만들어주었다. 

하지먄 여기서 @AllArgsConstructor를 붙여주면 

<img width="1293" alt="스크린샷 2023-02-21 오후 11 30 10" src="https://user-images.githubusercontent.com/104719555/220372821-8bbfb42a-1334-4cd7-aae7-d4def53c6839.png">

내가 생성자를 만들어줄 필요없이 쓸수 있다.

또한 내가 필드를 추가 하더라도 변경하거나 수정할 필요없이 편안하게 쓸수 있다. 
내

 @RequiredArgsConstructor -> final 또는 @NonNull가 있는 필드가 포함된 생성자를 구현한다.
 
 <br>
 <br>
 <br>
 <br>
 
 ### @Data
 
 @Data는 @Getter/@Setter/@ToString/@EqualsAndHashCode/@RequiredArgsConstructor를 한번에 쓸수 있는 기능이다.
 
 <img width="1325" alt="스크린샷 2023-02-21 오후 11 39 03" src="https://user-images.githubusercontent.com/104719555/220375028-ff490ca0-5001-4769-8f32-985d9b15a1ce.png">

 @Data를 하게 되면 어노테이션을 덕지덕지 안 붙여도 쓸수 있는것 을 알 수 있다.
 
 
  <br>
 <br>
 <br>
 <br>
 
 ###  @Builder
 
  빌더 패턴은 디자인 패턴 중 하나로 생성자에 매개별수가 많을 때 많이 쓴다 .
  
  <img width="1338" alt="스크린샷 2023-02-21 오후 11 43 40" src="https://user-images.githubusercontent.com/104719555/220376152-2ff19ca8-1cf4-45f5-aae3-55ed1c8c5fd6.png">

 위에 사진은 물론 필드의 갯수가 3개 밖에 안되지만  빌더 패턴을 구하는 코드를 만들고 하기에는 많은 번거러움이 있지만 
 
 @Builder를 사용하게 되면 간편하게 쓸수 있다.
