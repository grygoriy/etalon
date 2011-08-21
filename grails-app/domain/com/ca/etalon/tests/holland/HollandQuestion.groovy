package com.ca.etalon.tests.holland

import com.ca.etalon.test.holland.HollandVector
import com.ca.etalon.test.holland.HollandType

class HollandQuestion {
    Long id
    String question
    HollandVector vector
    HollandType type
  
    static constraints = {
    }

    static mapping = {
      table "HollandQuestion"
      columns {
        id column:"HollandQuestionId"
        question column:"Question"
        vector column:"HollandVector", enumType:"string"
        type column:"HollandType", enumType:"string"
      }
      version false
    }


    boolean equals(o) {
        if (this.is(o)) return true;
        if (getClass() != o.class) return false;

        HollandQuestion that = (HollandQuestion) o;

        if (id != that.id) return false;
        if (question != that.question) return false;
        if (type != that.type) return false;
        if (vector != that.vector) return false;

        return true;
    }

    int hashCode() {
        int result;
        result = (id != null ? id.hashCode() : 0);
        result = 31 * result + (question != null ? question.hashCode() : 0);
        result = 31 * result + (vector != null ? vector.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
