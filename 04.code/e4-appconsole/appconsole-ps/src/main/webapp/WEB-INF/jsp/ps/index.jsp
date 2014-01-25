<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="../common/inc/header.jsp" %>

<!DOCTYPE html>
<html lang="en" ng-app="PsApp">
<head>
    <meta charset="utf-8">
    <title>项目结构维护</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <link href="<%=contextPath%>/s/third/bootstrap/3.0.2/css/bootstrap.css" rel="stylesheet" type="text/css">
</head>

<body>
<div class="container">
    <div class="page-header">
        <h1>项目维护</h1>
    </div>

    <div>
        <h3>项目信息</h3>
    </div>

    <div>
        <h1>项目模块结构</h1>
    </div>

    <div>
        <h3>项目模块结构维护</h3>
    </div>
    
    <div ng-controller="projectCtrl">
    	<table class="table table-hover">
    		<thead>
    			<tr>
    				<th>项目编号</th>
    				<th>项目名称</th>
    				<th>项目标题</th>
    				<th>项目子标题</th>
    				<th>项目首页访问URI</th>
    				<th>操作</th>
    			</tr>
    		</thead>
    		
    		<tbody>
    			<tr ng-repeat="project in projects">
    				<td>{{project.id}}</td>
    				<td>{{project.name}}</td>
    				<td>{{project.title}}</td>
    				<td>{{project.subTitle}}</td>
    				<td>{{project.indexUri}}</td>
    				<td>
    					<button type="button" class="btn btn-primary" ng-click='showProject(project)'>修改</button>
    					<button type="button" class="btn btn-danger">删除</button>
    				</td>
    			</tr>
    		</tbody>
    	</table>
    </div>
	
	<div id="projectDetail">
		
	</div>
</div>


<script src="<%=contextPath%>/s/third/jquery/jquery-1.9.0.min.js" type="text/javascript"></script>
<script src="<%=contextPath%>/s/third/jquery/jquery.form.js" type="text/javascript"></script>
<script src="<%=contextPath%>/s/third/angular/1.2.6/angular.js" type="text/javascript"></script>

<script type="text/javascript">


    var app = angular.module('PsApp', [], function () {
        console.log('PsApp initial');
     
    });
    
    function projectCtrl($scope,$http){
    	var p = $http({
            method: 'GET',
            url: 'list'
        });

        p.success(function(response, status, headers, config){
            console.log(status);
            $scope.projects = response;
        });
        
        
        $scope.showProject = function(project){
        	console.log(project);
        }
        
    }
    
    

    /**
    app.controller('projectCtrl', function ($scope,$http) {
        var p = $http({
            method: 'GET',
            url: 'list'
        });

        p.success(function(response, status, headers, config){
            console.log(status);
            $scope.projects = response;
        });
        
        $scope.showProject = function(){
        	console.log('showProject');
        };
        
        

    });
    **/
    

</script>
</body>
</html>
