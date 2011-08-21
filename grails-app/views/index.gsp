<html>
    <head>
<title>МГЦ &laquo;Еталон&raquo;: Профорієнтаційне тестування</title>
		<meta name="layout" content="main" />
    </head>
    <body>
      %{--<sec:ifNotLoggedIn >--}%
        %{--<li><g:link elementId="login" controller='login' action='auth'>Login</g:link></li>--}%
      %{--</sec:ifNotLoggedIn>--}%
      <sec:ifAnyGranted roles="ROLE_ADMINISTRATOR">
          <div class="nav">
            <span class="menuButton"><a class="home" href="${resource(dir:'')}">Home</a></span>
            <span class="menuButton"><g:link class="list" controller="user" action="list">Користувачі</g:link></span>
            <span class="menuButton"><g:link class="list" controller="testResults" action="list">Результати тестування</g:link></span>
            <span class="menuButton"><g:link class="list" controller="school" action="list">Школи</g:link></span>
          </div>
      </sec:ifAnyGranted>

        <g:link controller="test" action="start">Почати тестування</g:link>
    </body>
</html>