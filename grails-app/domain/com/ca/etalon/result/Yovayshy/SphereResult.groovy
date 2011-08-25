package com.ca.etalon.result.Yovayshy

import com.ca.etalon.test.yovayshy.YovayshySphere

class SphereResult {
    Long id
    YovayshySphere sphere
    Integer score
    YovayshyResult yovayshyResult

    static constraints = {
    }

    static mapping = {
      table 'SphereResult'
      columns {
        id column:'SphereResultId'
        sphere column:'SphereId', enumType:'string'
        score column:'Score'
        yovayshyResult column:'YovayshyResultId'
      }
      version false
    }


    boolean equals(o) {
        if (this.is(o)) return true;
        if (getClass() != o.class) return false;

        SphereResult that = (SphereResult) o;

        if (id != that.id) return false;
        if (score != that.score) return false;
        if (sphere != that.sphere) return false;
        if (yovayshyResult != that.yovayshyResult) return false;

        return true;
    }

    int hashCode() {
        int result;
        result = (id != null ? id.hashCode() : 0);
        result = 31 * result + (sphere != null ? sphere.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (yovayshyResult != null ? yovayshyResult.hashCode() : 0);
        return result;
    }
}
