# Study_Scheduler
- - -

* Thread <br>
메인클래스에서 thread를 생성해서 구동하면 메인작업이 끝나도 thread는 진행작업을 계속 한다. <br>
메인작업이 끝나면 thread도 작업을 멈추게 하려면 thread의 setDaemon이라는 메소드에 true값을 넣어준다.<br>
<br>
<br>

* Scheduler <br>
를 사용하기 위해서는 root-context에 task태크를 이용해서 스케쥴러 사용 설정을 해야한다. <br>
해당 사용설정 세팅은 task:annotation-driven <br>
<br>
<br>

@Scheduled(initialDelay = 1000, fixedDelay = 1000) <br>
@Scheduled(cron = "* * * * * *") <br>

* cron 표현식 <br>
<pre>
* : 모든 값 <br>
? : 특정한 값이 없음 <br>
- : 범위 <br>
, : 특별한 값일 때 <br>
/ : 시작시간과 단위 사이에 사용 <br>
L : 일에서 사용하면 마지막 일, 요일에서사용하면 토요일 <br>
W : 가장 가까운 평일 <br>
# : 몇째주의 무슨 요일 인지를 표현함 <br>
</pre>
<br>
<br>

- - -
자바는 내부클래스에서 외부변수에 접근할 경우 외부변수에 대한 변경을 하지못하도록한다. <br>
7 버전 까지는 명시적으로 final을 붙여줘야했고, 8버전 부터는 명시적으로 final이 없어도 <br>
실질적으로 final로 만들어 final이 아니라도 람다나 내부클래스에서 참조하고있을때는 변경하지못하도록 컴파일러가 막는다. <br>

메소드 예악어위치에 synchronized 를 붙이면 메소드 동기화가 되서 동시에 해당메소드에 접근이 불가해진다. <br>
