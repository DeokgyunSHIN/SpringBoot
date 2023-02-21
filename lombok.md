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


### @toString

<img width="610" alt="스크린샷 2023-02-21 오후 10 55 08" src="https://user-images.githubusercontent.com/104719555/220364639-eb4c9376-7d9e-4f47-8638-9601935657e0.png">

toString 또한 메소드를 생성해서 만들어줘 주었다. 만약에 저기에 필드가 추가가 되면 지우고 다시 toString 자동추가 단축키를 써서 메소드를 생성해주거나 

직접 추가해줘야 하는 불편함이 있다. 이럴떄는 그냥 클래스 위에 @toString 을 적어주면 된다.

<img width="1332" alt="스크린샷 2023-02-21 오후 10 57 41" src="https://user-images.githubusercontent.com/104719555/220365239-6adb125f-07ce-4c4e-bf82-1b20e1739d08.png">

위의 사진처럼 어노테이션을 클래스 위에 걸어주고 쓰면 자동으로 만들어주기 떄문에 필드가 추가 되더라도 다시 설정할 필요없이 쓸수 있다.


