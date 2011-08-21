package com.ca.etalon.result.motivaton

import com.ca.etalon.test.motivation.MotivationVector

class VectorResult {
    Long id
    MotivationVector motivationVector
    Integer score
    MotivationResult motivationResult
  
    static constraints = {
    }

    static mapping = {
      table "VectorResult"
      columns {
        id column:"VectorResultId"
        motivationVector column:"MotivationVector", enumType:"string"
        score column:"Score"
        motivationResult column:"MotivationResultId"
      }
      version:false
    }

    boolean equals(o) {
        if (this.is(o)) return true;
        if (getClass() != o.class) return false;

        VectorResult that = (VectorResult) o;

        if (id != that.id) return false;
        if (motivationResult != that.motivationResult) return false;
        if (motivationVector != that.motivationVector) return false;
        if (score != that.score) return false;

        return true;
    }

    int hashCode() {
        int result;
        result = (id != null ? id.hashCode() : 0);
        result = 31 * result + (motivationVector != null ? motivationVector.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (motivationResult != null ? motivationResult.hashCode() : 0);
        return result;
    }
}
