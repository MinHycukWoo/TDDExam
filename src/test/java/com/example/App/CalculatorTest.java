package com.example.App;


import org.assertj.core.api.Assertions;
//import org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;


/**
 * //1+2 = 3
 * 	//Calculator
 * -plus(x,y) , 1, 2 =3
 * -minus(x,y)
 * -divide(x,y)
 * //lhs , rhs
 * lhs operator rhs
 * lhs = rhs
 *
 * fibonacci - > 1 1 2 3 5 8 13 21 34 55
 */
public class CalculatorTest {
    //일단 calculator에 대한 테스트를 만들어보자
    private Calculator calculrator;

    @BeforeEach
    public void setUp() throws Exception{
        calculrator = new Calculator();
    }

    @Test
    public void plus(){
        //Calculator calculrator = new Calculator();
        Assertions.assertThat(calculrator.plus(1,2)).isEqualTo(3);
    }

    @Test
    public void minus(){
        //Calculator calculrator = new Calculator();
        Assertions.assertThat(calculrator.minus(5,3)).isEqualTo(2);
    }
    //red = 테스트를 실패
    /*
    * expected: 2
    but was: 0
    * 2를원햇는데 0이나왔다
    * */
    //green = 테스트를 만들어서 통과시킴


    /*여기서 요점은 우리가 테스트를 하면서 발생하는 실수들을 테스트코드가 발견할수있게 도와준다
    *이 테스트 코드를 언제든지 실행할수 있어서 이를 확인할 수 있다.
    * */

    @Test
    public void multiply(){
        Assertions.assertThat(calculrator.multiply(5,3)).isEqualTo(15);
    }

    @Test
    public void fibonacci(){
        Assertions.assertThat(calculrator.fib(0)).isEqualTo(0);
        Assertions.assertThat(calculrator.fib(1)).isEqualTo(1);
        Assertions.assertThat(calculrator.fib(2)).isEqualTo(1);
        Assertions.assertThat(calculrator.fib(3)).isEqualTo(2);
        Assertions.assertThat(calculrator.fib(4)).isEqualTo(3);
        Assertions.assertThat(calculrator.fib(5)).isEqualTo(5);
    }
    //테스트 코드 리팩토링

    @Test
    public void fibonacciRefactoring(){
        int[] numbers = {0,1,1,2,3,5,8,13,21,34,55};
        /*
        for(int i = 0; i< numbers.length; i++){
            Assertions.assertThat(calculrator.fib(i)).isEqualTo(numbers[i]);
        }*/

        IntStream.range(0, numbers.length).forEach(i ->{
            Assertions.assertThat(calculrator.fib(i)).isEqualTo(numbers[i]);
        });
    }
}
