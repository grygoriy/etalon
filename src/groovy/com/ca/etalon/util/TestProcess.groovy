package com.ca.etalon.util

import com.ca.etalon.School
import com.ca.etalon.test.interestmap.IMTest
import com.ca.etalon.test.actuality.ActualTest
import com.ca.etalon.test.yovayshy.YovayshyTest
import com.ca.etalon.test.lidership.LidershipTest
import com.ca.etalon.test.motivation.MotivationTest
import com.ca.etalon.tests.holland.HollandQuestion

class TestProcess {
    Long testResultId
    String userName;
    School school;
    IMTest imTest = new IMTest();
    ActualTest actualTest;
    YovayshyTest yovayshyTest;
    LidershipTest lidershipTest;
    MotivationTest motivationTest;
    List<HollandQuestion> hollandQuestions
}
