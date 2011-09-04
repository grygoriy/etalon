package com.ca.etalon.tests.interestmap

class IMQuestion {
    Long id
    String question
    JobName category
                                                                
    static constraints = {
      question(blank:false, nullable:false)
      category(blank:false, nullable:false)
    }

    static mapping = {
      table 'IMQuestion'
      columns {
        id column:'IMQuestionId'
        question column:'Question'
        category lazy:false, column:'CategoryId', fetch:'join'
      }
        version false
        cache true
        cache usage:'read-only'
    }

    boolean equals(o) {
        if (this.is(o)) return true;
        if (getClass() != o.class) return false;

        IMQuestion that = (IMQuestion) o;

        if (category != that.category) return false;
        if (id != that.id) return false;
        if (question != that.question) return false;

        return true;
    }

    int hashCode() {
        int result;
        result = (id != null ? id.hashCode() : 0);
        result = 31 * result + (question != null ? question.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        return result;
    }
}
