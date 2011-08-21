package com.ca.etalon

class School {
    Long id
    String name;

    static constraints = {
      name(nullable:false, blank:false)
    }

    public String toString() {
      return name
    }

    static mapping = {
      table "School"
      columns {
        id column:"SchoolId"
        name column:"Name"
      }
      cache true
      version false
    }


    boolean equals(o) {
        if (this.is(o)) return true;
        if (getClass() != o.class) return false;

        School school = (School) o;

        if (id != school.id) return false;
        if (name != school.name) return false;

        return true;
    }

    int hashCode() {
        int result;
        result = (id != null ? id.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
