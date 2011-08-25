package com.ca.etalon.tests.yovayshy

import com.ca.etalon.test.yovayshy.YovayshySphere

class YovayshyQuestion {
    Long id
    String question
    String caseA
    String caseB

    YovayshySphere keyOnA
    YovayshySphere keyOnB

    static constraints = {
    }

   static mapping = {
     table 'YovayshyQuestion'
     columns {
       id column:'YovayshyQuestionId'
       question column:'Question'
       caseA column:'CaseA'
       caseB column:'CaseB'
       keyOnA column:'KeyOnA', enumType:'string'
       keyOnB column:'KeyOnB', enumType:'string'
     }

     version false
   }


    boolean equals(o) {
        if (this.is(o)) return true;
        if (getClass() != o.class) return false;

        YovayshyQuestion that = (YovayshyQuestion) o;

        if (caseA != that.caseA) return false;
        if (caseB != that.caseB) return false;
        if (id != that.id) return false;
        if (keyOnA != that.keyOnA) return false;
        if (keyOnB != that.keyOnB) return false;
        if (question != that.question) return false;

        return true;
    }

    int hashCode() {
        int result;
        result = (id != null ? id.hashCode() : 0);
        result = 31 * result + (question != null ? question.hashCode() : 0);
        result = 31 * result + (caseA != null ? caseA.hashCode() : 0);
        result = 31 * result + (caseB != null ? caseB.hashCode() : 0);
        result = 31 * result + (keyOnA != null ? keyOnA.hashCode() : 0);
        result = 31 * result + (keyOnB != null ? keyOnB.hashCode() : 0);
        return result;
    }
}
