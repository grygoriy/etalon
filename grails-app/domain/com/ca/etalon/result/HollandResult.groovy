package com.ca.etalon.result

import com.ca.etalon.test.holland.HollandType

class HollandResult {
    Long id
    HollandType type
    Integer score
    TestResults testResults

    static constraints = {
    }

    static mapping = {
      table 'HollandResult'
      columns {
        id column:'HollandResultId'
        score column:'Score'
        type column:'Type', enumType:'string'
        testResults column:'TestResultsId'
      }
      version false
    }

    boolean equals(o) {
        if (this.is(o)) return true;
        if (getClass() != o.class) return false;

        HollandResult that = (HollandResult) o;

        if (id != that.id) return false;
        if (score != that.score) return false;
        if (testResults != that.testResults) return false;
        if (type != that.type) return false;

        return true;
    }

    int hashCode() {
        int result;
        result = (id != null ? id.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (testResults != null ? testResults.hashCode() : 0);
        return result;
    }
}
