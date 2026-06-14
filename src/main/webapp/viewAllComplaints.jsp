<td>
<%
if(c.getStatus().equals("Pending")){
%>
<span style="color:red;font-weight:bold;">
Pending
</span>
<%
}
else if(c.getStatus().equals("In Progress")){
%>
<span style="color:orange;font-weight:bold;">
In Progress
</span>
<%
}
else{
%>
<span style="color:green;font-weight:bold;">
Resolved
</span>
<%
}
%>
</td>