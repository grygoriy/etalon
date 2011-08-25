package com.ca.etalon.tests.motivation

import com.ca.etalon.test.motivation.MotivationVector

class MotivationQuestion {
    Long id
    String question
    MotivationVector motivationVector
  
    static constraints = {
    }

    static mapping = {
      table 'MotivationQuestion'
      columns {
        id column:'MotivationQuestionId'
        question column:'Question'
        motivationVector column:'MotivationVector',  enumType:'string'
      }
      version false
    }


    boolean equals(o) {
        if (this.is(o)) return true;
        if (getClass() != o.class) return false;

        MotivationQuestion that = (MotivationQuestion) o;

        if (id != that.id) return false;
        if (motivationVector != that.motivationVector) return false;
        if (question != that.question) return false;

        return true;
    }

    int hashCode() {
        int result;
        result = (id != null ? id.hashCode() : 0);
        result = 31 * result + (question != null ? question.hashCode() : 0);
        result = 31 * result + (motivationVector != null ? motivationVector.hashCode() : 0);
        return result;
    }
}
