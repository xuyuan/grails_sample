<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main"/>
        <title>Welcome to Grails</title>
    </head>
    <body>
    
        <p>The quick brown fox jumps over the lazy dog.</p>
	    
	    <p>numberofRecodrds: ${numberofRecodrds}</p>

        <table>
           <tr>
               <td>Name</td>
               <td>Birth Date</td>
           </tr>
           <g:each in="${list}" var="person" status="i">
           <tr>
               <td>${i+1}. ${person.lastName}, ${person.firstName}</td>
               <td>${person.birthDate}</td>
           </tr>
           </g:each>        
       </table>

		<g:form action="save" >
		    <label for="lastName">Last Name</label>
		    <g:textField name="lastName" value="${person.lastName}"/>
		    <br/>
		    <label for="firstName">First Name</label>
		    <g:textField name="firstName" value="${person.firstName}"/>
		    <br/>
		    <label for="birthDate">Birth Date</label>
		    <g:textField name="birthDate" value="${person.birthDate}"/>
		    <br/>
		    <g:submitButton name="create" value="Save" />
		</g:form>

    </body>
</html>