# IoC (Inversion of Control)

> 스프링에서는 일반적으로 java 객체를 new로 생성하여 개발자가 관리하는 것이 아닌 Spring Container에 모두 맡긴다.

> 즉, 개발자에서 -> 프레임 워크로 제어의 객체 관리의 권한이 넘어 갔음 으로 "제어의 역전" 이라고 한다.


### DI 

1. 의존성으로 부터 격리시켜 코드 테스트에 용이하다.
2. DI를 통하여, 불가능한 상황을 Mock와 같은 기술을 통하여, 안정적으로 테스트가 가능하다.
3. 코드를 확장하거나 변경 할 때 영향을 최소화한다.(추상화)
4. 순환참조를 막을 수 있다.



IoC와 DI는 레고와 같은 것이다.

스프링이 바닥판처럼 깔려있고, 우리는 그 위에서 멋진 조립을 하면 된다.

### Bean

> 자바에서의 javaBean
> 
> 데이터를 저장하기 위한 구조체로 자바 빈 규약이라는 것을 따르는 구조체
> 
> private 프로퍼티와 getter/setter로만 데이터를 접근한다.

예시)

``` java 
  public class JavaBean {
    private String id;
    private Integer count;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
 }
````

즉, 특정한 정보를 가지고 있는 클래스를 표현하는 하나의 규칙이고, 데이터를 표현하기 위한 목적을 지니고 있는 것을 

JavaBean이라고 한다.


<br>
<br>
<br>

> 스프링에서의 Bean 
> 
> 스프링 IoC 컨테이너에 의해 생성되고 관리되는 객체 
> 
> 자바에서처럼 new Object();로 생성하지 않는다.
> 
> 각각의 Bean들 끼리는 서로를 편리하게 의존할 수 있다.
