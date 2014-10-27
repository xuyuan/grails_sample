<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main"/>
        <title>Welcome to Grails</title>
    </head>
    <body>
    
        <p>The quick brown fox jumps over the lazy dog.</p>

	    <table>
	        <tr>
	            <td>Name</td>
	            <td>Age</td>
	        </tr>
	        <g:each in="${list}" var="person" status="i">
	        <tr>
	            <td>${i+1}. ${person.lastName}, ${person.firstName}</td>
	            <td>${person.age}</td>
	        </tr>
	        </g:each>        
	    </table>
	    
	    <p>numberofRecodrds: ${numberofRecodrds}</p>


		<g:form action="save" >
		    <label for="lastName">Last Name</label>
		    <g:textField name="lastName" value="${person.lastName}"/>
		    <br/>
		    <label for="firstName">First Name</label>
		    <g:textField name="firstName" value="${person.firstName}"/>
		    <br/>
		    <label for="age">Age</label>
		    <g:textField name="age" value="${person.age}"/>
		    <br/>
		    <g:submitButton name="create" value="Save" />
		</g:form>

    </body>
</html>