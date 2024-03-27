package com.example.App;

import java.util.stream.IntStream;

public class Calculator {
    //~~
    public int plus(int x, int y){
        //return 3;
        //return 1 + 2;
        //return x + y;

        //처음에는 결과로 받고자하는 값 return 3을 적는다
        //테스트를 통과한다면 다음단계는 매개변수를 받았다 치고 더해보자
        //return 1 + 2;
        //그럼 이제 매개변수로 치환하자
        //return x + y;

        //return x + 1;
        //이번에는 제약이있다고 가정해보자 
        //무조건 x+1이어야 한다고 하자
        //그럼 3을 기대하던 테스트는 깨지게 된다,.
        //여기서 조건은 +1이 y의 값만큼 반복되기만 한다고 하자
        if(y == 0){
            return x;
        }
        return plus(x +1 , y-1);

        //이게 뭐냐면 이미 테스트코드가 존재하고
        //거기서 몇가지 제약조건이 주어졌을때 설계를 고쳐야 하거나 구현을 고쳐야하는경우
        //코드쪽을 수정해서 대응하게 된다.

        //이 과정을 리팩토링이라부르고
        //테스트 결과를 두고 코드를 계속 변화하는 리팩토링단계를 가져가는게 TDD에서의 흐름이다
        
        /*
        * TDD는 3단계를 거친다
        * 1. RED = 테스트를 실패한다
        * 2. Green = 테스트를 통과시킨다. return 3
        * 3. Refactoring = 제약조건에 따라 코드를 변경한다 1 + 2 -> x + y 등
        * */
    }

    public int minus(int x , int y){
        if(y == 0){
            return x;
        }
        //return plus(x -1 , y-1);
        return minus(x -1 , y-1);
    }

    public int multiply(int x , int y){
        /*
        int result = 0;
        for(int i = 0; i<y; i++){
            result += x;
        }
        return result;*/
        //기능개선
        //return IntStream.range(0,y).reduce(0,(a , e) -> a+x);
        //return IntStream.iterate(0, i -> i).limit(y).reduce(0, (a,e) -> a + x);
        return IntStream.generate(()->0).limit(y).reduce(0,(a,e)->plus(a,x));

    }

    public int fib(int x){
        /*if(x == 3){
            return 1+1;
        }*/
        //if(x < 3){
        if(x == 0){
            return 0;
        }
        if(x == 1 || x == 2){
            return 1;
        }
        if(x >= 3){
            return fib(x-2) + fib(x - 1);
        }
        if(x == 4){
            return fib(x-2) + fib(x - 1);
        }
        if(x == 3){
            return fib(x-2) + fib(x - 1);
        }

        return fib(x-2) + fib(x-1);
    }
}
