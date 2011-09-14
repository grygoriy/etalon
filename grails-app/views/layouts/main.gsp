<html>
    <head>
        <title><g:layoutTitle default="Grails" /></title>
        <jawr:style src="css/main.css" media="all"/>
        <jawr:style src="css/base.css" media="all"/>
        %{--<link rel="stylesheet" href="${resource(dir:'css',file:'main.css')}" />--}%
        %{--<link rel="stylesheet" href="${resource(dir:'css',file:'base.css')}" />--}%
        <link rel="shortcut icon" href="${resource(dir:'images',file:'favicon.ico')}" type="image/x-icon" />
        <g:layoutHead />
    </head>
    <body style="margin:20">
    <div id="wrap">
         <div id="header">
		<h1>Молодіжний громадський центр &laquo;Еталон&raquo;</h1>
	<sec:ifLoggedIn>
          <p class="floatRight"><g:link controller="logout">Вихід</g:link></p>
    </sec:ifLoggedIn>
	
		<p class="header">Профорієнтаційне тестування</p>
 	 	</div>
        <div id="spinner" class="spinner" style="display:none;">
            <img src="${resource(dir:'images',file:'spinner.gif')}" alt="Spinner" />
        </div>	
        %{--<div class="logo"><img src="${resource(dir:'images',file:'grails_logo.jpg')}" alt="Grails" /></div>--}%
        
<div id="main" class="clearfix">
	<div id="content">
        <g:layoutBody />		
	</div>
</div>
     </div>
	<div id="footer">
	<p class="copyright">&copy; 2009 Молодіжний громадський центр &laquo;Еталон&raquo;</p>
	</div>
    </body>	
</html>