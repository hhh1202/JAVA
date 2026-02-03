package com.mjc_0202;

import com.google.gson.Gson;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.assertj.core.api.Assertions.*;

public class TestMyClass {
    @Test
    public void testMain1(){
//        assertEquals(4-2, 2);
//        assertEquals(5-2, 4);
        assertThat(2+1).isEqualTo(3);
        assertThat(3*10).isEqualTo(30);
    }

    @Test
    public void testGson(){
        Gson gs = new Gson();
        MyClass mc = new MyClass();
        String s = gs.toJson(mc);

        MyClass mc2 = gs.fromJson(s, MyClass.class);
        assertThat(mc2.getMyArray().length).isEqualTo(mc.getMyArray().length);
        assertThat(mc2.getMyArray()).isEqualTo(mc.getMyArray());
    }
}
