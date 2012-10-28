package com.buaa.soft.ll;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: STU
 * Date: 10/21/12
 * Time: 4:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class GuessNumberTest {

    private GuessNumber gs;

    @Before
    public void initGuessNumber(){
        this.gs = new GuessNumber();
    }

    @Test
    public void should_return_4A0B(){
        gs.setAnswer("1234");
        Assert.assertEquals("4A0B",gs.guess("1234"));
    }

    @Test
    public void should_return_1A2B(){
        gs.setAnswer("1234");
        Assert.assertEquals("1A2B",gs.guess("1348"));
    }

    @Test
    public void should_return_0A0B(){
        gs.setAnswer("1234");
        Assert.assertEquals("0A0B",gs.guess("5678"));
    }

    @Test
    public void should_return_wronginputanswer(){
        gs.setAnswer("1234");
        Assert.assertEquals("wrong input number",gs.guess("1231"));
    }
}
