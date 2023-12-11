<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	if (request.getAttribute("message") != null ) {
	%>
	<p style="color:DarkCyan;">user <%=request.getAttribute("message")%> was created</p>
	<%
	} else {
		%> <p>  <br /> </p> <%
	}
	%>
	
	<div><a href="controller?command=go_to_sign_in_page">signIn</a></div>
  	<div><a href="controller?command=go_to_registration_page">registration</a></div>

	<h1>Cause and effect: Are corporate profits fueling inflation
		globally</h1>
	<div>
		<em>The story so far:</em> The global economy encountered
		unprecedented challenges due to widespread inflation last year. The
		Federal Reserve has regularly raised interest rates at its last 10
		meetings since March 2022. In its last meeting this month, the Fed
		raised its benchmark rate to over 5 per cent. It is debatable whether
		these attempts to bring inflation under control in the US have been
		actually fanning and feeding corporate profits. The graph of corporate
		profit margins in the United States has seen a steep rise every
		quarter from $2001.5 bn in Q2 of 2020.
	</div>
	<br />
	<div>The highest-ever mark of $3001.3 billion was achieved in Q2
		of 2022 due to skyrocketing prices of services and commodities.
		Inflation rose to 9.1 per cent in June last year, and persists at 4.9
		per cent despite the hiking cycle of the Fed. Interestingly, inflation
		in the US was at 0.3 per cent in April 2020 and remained under 2 per
		cent until February 2021, when things were increasingly moving towards
		normalcy after lockdowns.</div>
	<div>
		<div class="row">
			<div style="min-height: 250px" id="between_article_content_2-0">
				<div class="advertisement-bg"></div>
			</div>
		</div>
	</div>
	<br />

</body>