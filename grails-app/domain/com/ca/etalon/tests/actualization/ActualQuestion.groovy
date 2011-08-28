package com.ca.etalon.tests.actualization

class ActualQuestion {
    Long id
    String question
    boolean isReverted 

    static constraints = {
      question(blank:false, nullable:false)
    }

    static mapping = {
      table 'ActualQuestion'
      columns {
        id column:'ActualQuestionId'
        question column:'Question'
        isReverted column:'isReverted'
      }
        version false
        cache true
        cache usage:'read-only'
    }


    boolean equals(o) {
        if (this.is(o)) return true;
        if (getClass() != o.class) return false;

        ActualQuestion that = (ActualQuestion) o;

        if (isReverted != that.isReverted) return false;
        if (id != that.id) return false;
        if (question != that.question) return false;

        return true;
    }

    int hashCode() {
        int result;
        result = (id != null ? id.hashCode() : 0);
        result = 31 * result + (question != null ? question.hashCode() : 0);
        result = 31 * result + (isReverted ? 1 : 0);
        return result;
    }
}
