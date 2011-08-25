package com.ca.etalon.result.Yovayshy

class YovayshyResult {
    Long id
    static hasMany = [sphereResults : SphereResult]
    String proffecionalSphere
    String proffecionalIntrests
  
    static constraints = {
      proffecionalSphere(nullable:true)
      proffecionalIntrests(nullable:true)
    }

    static mapping = {
      table 'YovayshyResult'
      columns {
        id column:'YovayshyResultId'
        proffecionalSphere column:'ProffecionalSphere'
        proffecionalIntrests column:'ProffecionalIntrests'
      }
      version false
    }


    boolean equals(o) {
        if (this.is(o)) return true;
        if (getClass() != o.class) return false;

        YovayshyResult that = (YovayshyResult) o;

        if (id != that.id) return false;
        if (proffecionalIntrests != that.proffecionalIntrests) return false;
        if (proffecionalSphere != that.proffecionalSphere) return false;

        return true;
    }

    int hashCode() {
        int result;
        result = (id != null ? id.hashCode() : 0);
        result = 31 * result + (proffecionalSphere != null ? proffecionalSphere.hashCode() : 0);
        result = 31 * result + (proffecionalIntrests != null ? proffecionalIntrests.hashCode() : 0);
        return result;
    }
}
