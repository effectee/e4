<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<link href="<%=path%>/s/third/bootstrap/3.0.2/css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="<%=path%>/s/third/datetimepicker/css/bootstrap-datetimepicker.css" rel="stylesheet" type="text/css">

<script src="<%=path%>/s/third/jquery/jquery-1.11.1.js" type="text/javascript" charset="UTF-8" language="javascript"></script>
<script src="<%=path%>/s/third/datetimepicker/js/bootstrap-datetimepicker.js" charset="UTF-8" type="text/javascript" language="javascript"></script>
<script src="<%=path%>/s/third/datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8" type="text/javascript" language="javascript"></script>
<script src="<%=path%>/s/third/bootstrap/3.0.2/js/bootstrap.js" type="text/javascript" charset="UTF-8" language="javascript"></script>
<script src="<%=path%>/s/third/angular/1.2.6/angular.js" type="text/javascript" charset="UTF-8" language="javascript"></script>
<script src="<%=path%>/s/third/angular/1.2.6/angular-resource_1.2.9.js" charset="UTF-8" type="text/javascript"></script>
