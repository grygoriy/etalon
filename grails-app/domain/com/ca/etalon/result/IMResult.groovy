package com.ca.etalon.result

import com.ca.etalon.tests.interestmap.JobName

class IMResult {
    Long id
    JobName category
    Integer result
    TestResults results  

    static mapping = {
      table 'IMResult'
      columns {
        id column:'IMResultId'
        category column:'JobNameId'
        result column:'Result'
        results column:'TestResultsId'
      }
      version false
    }

    boolean equals(o) {
        if (this.is(o)) return true;
        if (getClass() != o.class) return false;

        IMResult imResult = (IMResult) o;

        if (category != imResult.category) return false;
        if (id != imResult.id) return false;
        if (result != imResult.result) return false;
        if (results != imResult.results) return false;

        return true;
    }

    int hashCode() {
        int result1;
        result1 = (id != null ? id.hashCode() : 0);
        result1 = 31 * result1 + (category != null ? category.hashCode() : 0);
        result1 = 31 * result1 + (result != null ? result.hashCode() : 0);
        result1 = 31 * result1 + (results != null ? results.hashCode() : 0);
        return result1;
    }
}