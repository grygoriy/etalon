package com.ca.etalon.profilerrule

import com.linkedin.grails.profiler.ProfilerCondition

/**
 * User: Grygoriy Mykhalyunyo
 * Date: 9/3/11
 * Time: 2:18 PM
 */
class EtalonProfilerCondition implements ProfilerCondition {

    boolean doProfiling() {
        return true
    }
}
