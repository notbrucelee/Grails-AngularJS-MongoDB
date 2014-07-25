<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Welcome to Grails</title>
<r:require module="angular" />
<r:layoutResources />
</head>
<body ng-app="phonecatApp">
	<div class="view-container">
		<div ng-view class="view-frame"></div>
	</div>
	<r:layoutResources/>
</body>
</html>
