package com.ca.etalon.result

class LidershipResult {
    Long id
    Integer score
    String message

    static constraints = {
    }

    static mapping = {
      table 'LidershipResult'
      columns {
        id column:'LidershipResultId'
        score column:'Score'
        message column:'Message'
      }
      version false
    }


    boolean equals(o) {
        if (this.is(o)) return true;
        if (getClass() != o.class) return false;

        LidershipResult that = (LidershipResult) o;

        if (id != that.id) return false;
        if (message != that.message) return false;
        if (score != that.score) return false;

        return true;
    }

    int hashCode() {
        int result;
        result = (id != null ? id.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        return result;
    }
}
