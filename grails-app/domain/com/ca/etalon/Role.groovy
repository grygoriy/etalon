package com.ca.etalon

class Role {

    Long id
    String name
	String authority

      static mapping = {
        table "Role"
        columns {
          id column: "RoleId"
          authority column: "Authority"
          name column: "Name"
        }
        cache true
        version false
      }

      static constraints = {
          authority blank: false, unique: true
      }

    @SuppressWarnings('IfStatementBraces')
    boolean equals(o) {
        if (this.is(o)) return true;
        if (getClass() != o.class) return false;

        Role role = (Role) o;

        if (authority != role.authority) return false;
        if (id != role.id) return false;
        if (name != role.name) return false;

        return true;
    }

    int hashCode() {
        int result;
        result = (id != null ? id.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (authority != null ? authority.hashCode() : 0);
        return result;
    }

}
