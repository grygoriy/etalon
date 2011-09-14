// Place your Spring DSL code here
beans = {
    profilerCondition(com.ca.etalon.profilerrule.EtalonProfilerCondition)

    imTestValidator(com.ca.etalon.validator.IMTestValidator){}

    actualTestValidator(com.ca.etalon.validator.ActualTestValidator){}

    yovayshyTestValidator(com.ca.etalon.validator.YovayshyTestValidator){}

    lidershipTestValidator(com.ca.etalon.validator.LidershipTestValidator){}

    motivationTestValidator(com.ca.etalon.validator.MotivationTestValidator){}
}
