package com.ca.etalon.tests.interestmap

class JobName {
    Long id
    String name;

    static constraints = {
      name()
    }

    static mapping = {
      table 'JobName'
      columns {
        id column:'JobNameId'
        name column:'Name'
      }
      version false
    }


    boolean equals(o) {
        if (this.is(o)) return true;
        if (getClass() != o.class) return false;

        JobName jobName = (JobName) o;

        if (id != jobName.id) return false;
        if (name != jobName.name) return false;

        return true;
    }

    int hashCode() {
        int result;
        result = (id != null ? id.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
