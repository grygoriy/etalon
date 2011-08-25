package com.ca.etalon.result.motivaton

import com.ca.etalon.result.TestResults

class MotivationResult {
    Long id
    String speciality;
    static hasMany = [vectorResults:VectorResult]
    TestResults testResults
  
    static constraints = {
    }

    static mapping = {
      table 'MotivationResult'
      columns {
        id column:'MotivationResultId'
        speciality column:'Speciality'
        testResults column:'TestResultsId'
      }
      version false
    }


    boolean equals(o) {
        if (this.is(o)) return true;
        if (getClass() != o.class) return false;

        MotivationResult that = (MotivationResult) o;

        if (id != that.id) return false;
        if (speciality != that.speciality) return false;
        if (testResults != that.testResults) return false;

        return true;
    }

    int hashCode() {
        int result;
        result = (id != null ? id.hashCode() : 0);
        result = 31 * result + (speciality != null ? speciality.hashCode() : 0);
        result = 31 * result + (testResults != null ? testResults.hashCode() : 0);
        return result;
    }
}
