<#import "/spring.ftl" as spring>
<html>
<h1>My products</h1>
<ul>
    <#list persons as person>
        <li>${person}</li>
    </#list>
</ul>
<p> <a href="/logout">Logout</a> </p>
</html>