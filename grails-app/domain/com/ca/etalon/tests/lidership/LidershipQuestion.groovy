package com.ca.etalon.tests.lidership

class LidershipQuestion {

    Long id
    String question
    Integer keyCase
    String caseA = "Так"
    String caseB = "Ні"

    static constraints = {
    }

    static mapping = {
      table "LidershipQuestion"
      columns {
        id column:"LidershipQuestionId"
        question column:"Question"
        keyCase column:"keyCase"
        caseA column:"CaseA"
        caseB column:"CaseB"
      }
      version false
    }


    boolean equals(o) {
        if (this.is(o)) return true;
        if (getClass() != o.class) return false;

        LidershipQuestion that = (LidershipQuestion) o;

        if (caseA != that.caseA) return false;
        if (caseB != that.caseB) return false;
        if (id != that.id) return false;
        if (keyCase != that.keyCase) return false;
        if (question != that.question) return false;

        return true;
    }

    int hashCode() {
        int result;
        result = (id != null ? id.hashCode() : 0);
        result = 31 * result + (question != null ? question.hashCode() : 0);
        result = 31 * result + (keyCase != null ? keyCase.hashCode() : 0);
        result = 31 * result + (caseA != null ? caseA.hashCode() : 0);
        result = 31 * result + (caseB != null ? caseB.hashCode() : 0);
        return result;
    }
}
