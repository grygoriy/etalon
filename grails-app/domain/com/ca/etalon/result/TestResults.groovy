package com.ca.etalon.result

import com.ca.etalon.School
import com.ca.etalon.result.motivaton.MotivationResult
import com.ca.etalon.result.Yovayshy.YovayshyResult

class TestResults {
    Long id
    String studentName
    School school
    static hasMany = [imResults:IMResult, hollandResults:HollandResult]
    Integer actualityResults
    YovayshyResult yovayshyResult
    Date dateCreated
    MotivationResult motivationResult
    LidershipResult lidershipResult

    static constraints = {
      lidershipResult(nullable:true, blank:true)
      actualityResults(nullable:true)
      yovayshyResult(nullable:true)
      motivationResult(nullable:true)
    }

   static mapping = {
      table 'TestResults'
      columns {
        id column:'TestResultsId'
        studentName column:'StudentName'
        school column:'SchoolId'
        actualityResults column:'ActualityResults'
        yovayshyResult column:'YovayshyResultId'
        dateCreated column:'DateCreated'
        lidershipResult column:'LidershipResultId'
        motivationResult column:'MotivationResultId'
      }
      version false
    }


    boolean equals(o) {
        if (this.is(o)) return true;
        if (getClass() != o.class) return false;

        TestResults that = (TestResults) o;

        if (actualityResults != that.actualityResults) return false;
        if (dateCreated != that.dateCreated) return false;
        if (id != that.id) return false;
        if (lidershipResult != that.lidershipResult) return false;
        if (motivationResult != that.motivationResult) return false;
        if (school != that.school) return false;
        if (studentName != that.studentName) return false;
        if (yovayshyResult != that.yovayshyResult) return false;

        return true;
    }

    int hashCode() {
        int result;
        result = (id != null ? id.hashCode() : 0);
        result = 31 * result + (studentName != null ? studentName.hashCode() : 0);
        result = 31 * result + (school != null ? school.hashCode() : 0);
        result = 31 * result + (actualityResults != null ? actualityResults.hashCode() : 0);
        result = 31 * result + (yovayshyResult != null ? yovayshyResult.hashCode() : 0);
        result = 31 * result + (dateCreated != null ? dateCreated.hashCode() : 0);
        result = 31 * result + (motivationResult != null ? motivationResult.hashCode() : 0);
        result = 31 * result + (lidershipResult != null ? lidershipResult.hashCode() : 0);
        return result;
    }
}
