package com.mjc.machine;

import com.mjc_0203.machine.Calculator;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestCalculator {
    @Test
    public void TestAdd(){
//        assertEqual(왼쪽값, 오른쪽값); 옛날 Junit 방식
//        assertThat(실제값).isEqualTo(기대하는 값).메소드2().메소드3();
        Calculator cal = new Calculator();
        assertThat(cal.add(1,2,3,7,9)).isEqualTo(22L);
        assertThat(cal.add(-33, -77, -999)).isEqualTo(-1109L);
        assertThat(cal.add(-333, -666, -999)).isEqualTo(-1998L);
    }
}
