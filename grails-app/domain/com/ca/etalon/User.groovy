package com.ca.etalon

class User {

    Long id
	String username
    String firstName
    String lastName
	String password
	boolean enabled
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired

	static constraints = {
		username blank: false, unique: true
		password blank: false
	}

  static mapping = {
          table "User"
          columns {
              id column: "UserId"
              username column: 'Username'
              password column: 'Password'
              enabled column: "Enabled"
              accountExpired column: "AccountExpired"
              accountLocked column: "AccountLocked"
              passwordExpired column: "PasswordExpired"
              firstName column : "FirstName"
              lastName column : "LastName"
          }
          version false
      }


	Set<Role> getAuthorities() {
		UserRole.findAllByUser(this).collect { it.role } as Set
	}


    boolean equals(o) {
        if (this.is(o)) return true;
        if (getClass() != o.class) return false;

        User user = (User) o;

        if (accountExpired != user.accountExpired) return false;
        if (accountLocked != user.accountLocked) return false;
        if (enabled != user.enabled) return false;
        if (passwordExpired != user.passwordExpired) return false;
        if (firstName != user.firstName) return false;
        if (id != user.id) return false;
        if (lastName != user.lastName) return false;
        if (password != user.password) return false;
        if (username != user.username) return false;

        return true;
    }

    int hashCode() {
        int result;
        result = (id != null ? id.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (enabled ? 1 : 0);
        result = 31 * result + (accountExpired ? 1 : 0);
        result = 31 * result + (accountLocked ? 1 : 0);
        result = 31 * result + (passwordExpired ? 1 : 0);
        return result;
    }
}
