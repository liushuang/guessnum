package com.buaa.soft.ll;

/**
 * Created with IntelliJ IDEA.
 * User: STU
 * Date: 10/21/12
 * Time: 4:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class GuessNumber {
    private String answer;

    public void setAnswer(String answer)
    {
        this.answer = answer;
    }

    public String guess(String testStr)
    {
        if(false == isCorrectInput(testStr))
            return "wrong input number";
        if (this.answer.equals(testStr))
            return "4A0B";
        else
            return notAllCorrect(testStr);
    }

    private String notAllCorrect(String testStr)
    {
        int answerA = 0 ;
        int answerB = 0 ;
        for(int i = 0 ; i < 4 ; i ++)
        {
            int pos = answer.indexOf(testStr.substring(i,i+1));
            if(pos < 0 )
                continue;
            else if(pos == i)
                answerA ++;
            else
                answerB ++;
        }
        return answerA + "A"+ answerB + "B";
    }

    private boolean isCorrectInput(String testStr)
    {
        if(testStr.length() != 4)
            return false;
        char[] list = testStr.toCharArray();
        for(int i =0 ; i < 4 ; i++){
            for(int j = i+1 ; j < 4 ; j ++)
            {
                if(list[i] == list[j] )
                    return false;
            }
        }
        return true;
    }
}
