<!DOCTYPE HTML>
<%@page import="com.google.api.services.drive.Drive"%>
<html lang="zh-tw">
<% Drive drive = DriveQuickstart.getDriveService();
	drive.files().list();
%>
<body>
<h2>Hello World!</h2>
</body>
</html>
