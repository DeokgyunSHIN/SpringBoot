# HTTP (Hyper Text Transfer Protocol)

> 그냥 문자가 아닌 Hyper 텍스트를 전송하는데 활용하는 프로토콜이다. (프로토콜 -> 약속)


### HTTP Request 메시지 스펙 

> 첫째줄 : 요청라인 (HTTP 메소드 :get, put,post 등등)
> 
> 두번째 줄부터 줄 바꿈 나오기 전까지 :Header 
> 
> 헤더에서 줄바꿈 이후 : Request Body


``` java
  POST / create-developer HTTP/1.1   // -> 요청 라인 
   Content-Type: application/json    // -> Header
   Accept : application/json
   
   {                                   // -> Request Body
     "developerLevel" : "JUNIOR",
     "memberId" : "User1",
     "name" : "신덕균",
     "age" : 25
    }
```
 
여기서 get 으로 받기 위해서는 쿼리 파라미터가 필요하다.

예시 ) GET / create-developer?name=신덕균&age=25 HTTP/1.1

근데 여기서는 GET은 쿼리 파라미터로만 보낼수 있고 POST는 Request Body로 통해서 

통신을 해야되는줄 아는데 그렇지는 않다. POST로도 쿼리 파라미터로 전송이 가능하고 

GET또한 Requset Body로 데이터를 통신을 할수 있다. 

하지만 그렇게 쓰지 말자고 POST는 바디로만 통신하고 

GET은 쿼리 파라미터로 통신하자고 약속을 했기 때문에 쓰지 않는것이지 사용을 못한다는 것은 아니다.

<br>
<br>
<br>

### HTTP Response 메시지 스펙 

> 첫째 줄 :  상태라인 ( 200,503 등등)
> 
> 두번째줄부터는 줄바꿈이 나오기전까지 :Header
> 
> 헤더에서 줄바꿈 이후 : Request Body

``` java 
   HTTP/1.1 200 OK    // -> 상태라인 
   Content-Type: application/json.  // ->Header
   Transfer-Encoding : chunked
   Data : Sat, 17 Jul 2021 16:40:43 GMT
   Keep-Alive: timeout=60
   Connection : keep-alive
   
   {                               // -> Request Body
       "developerLevel" : "JUNIOR",
     "memberId" : "User1",
     "name" : "신덕균",
     "age" : 25
    }
 ```
 
