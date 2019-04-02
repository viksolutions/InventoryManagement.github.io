<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>
</title>

<c:set var="ctx" value="${pageContext.request.contextPath}" />
<link href="fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="${ctx}/resources/css/custom.css">
<link rel="stylesheet" href="${ctx}/resources/css/sticky-footer.css">
<link rel="stylesheet" href="${ctx}/resources/css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="${ctx}/resources/css/font-awesome.min.css"  	type="text/css">
<link rel="stylesheet"	href="${ctx}/resources/calendar/css/bootstrap-datetimepicker.css"	type="text/css">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>


<link rel="stylesheet" type="text/css"	href="${ctx}/resources/table/media/css/jquery.dataTables.css">
<link rel="stylesheet" type="text/css"	href="${ctx}/resources/table/css/responsive.dataTables.css">
<link rel="stylesheet" type="text/css"	href="${ctx}/resources/table/resources/syntax/shCore.css">
<link rel="stylesheet" type="text/css"	href="${ctx}/resources/table/resources/demo.css">
<script type="text/javascript" language="javascript" src="${ctx}/resources/table/js/jquery-1.11.3.min.js"></script>
<script type="text/javascript" language="javascript" src="${ctx}/resources/table/media/js/jquery.dataTables.js"></script>
<script type="text/javascript" language="javascript" src="${ctx}/resources/table/js/dataTables.responsive.js"></script>
<script type="text/javascript" language="javascript" src="${ctx}/resources/table/resources/syntax/shCore.js"></script>
<script type="text/javascript" language="javascript" src="${ctx}/resources/table/resources/demo.js"></script>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
	<link rel="stylesheet" href="test.css">

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.form-group {
  margin-bottom: 15px!important;
}
</style>
<style>
.fourth-main { 
  background-color: #757575;
}
.whole {
  width: 100%;
  height: 40px;
  -ms-display: flexbox;
  display: flex;
  margin: 0px 0px 0px 240px;
}

.whole > span {
  -ms-flex: 1;
  flex: 1;
  height: 100%;
}
</style>
<link rel="stylesheet" href="${ctx}/resources/calendar/css/bootstrap-datetimepicker.css" type="text/css">
<script type="text/javascript" src="${ctx}/resources/calendar/js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
<script type="text/javascript" src="${ctx}/resources/calendar/js/locales/bootstrap-datetimepicker.fr.js" charset="UTF-8"></script>
<script type="text/javascript">
	
var d = new Date();
var month = d.getMonth()+1;
var day = d.getDate();
var year = d.getFullYear();
//var output = (month<10 ? '0' : '') + month + '/' + (day<10 ? '0' : '') + day + '/' + d.getFullYear();
//$("#paymentDate").val(output + "");
$('.form_date').datetimepicker({
  language: 'en',
  weekStart: 1,
  todayBtn:  1,
  autoclose: 1,
  todayHighlight: 1,
  startView: 2,
  minView: 2,
  forceParse: 0,
  format: "mm/dd/yyyy",
  
  //startDate: new Date(),	
  });

</script>
 <body>

 <span class=" Htitle space-twenty badge " >
  
 Hospital Management
  
 </span>

<a href="ShowLogin.html">Logout</a>
<div class="col-lg-10 col-md-10 col-sm-10 space-twenty" ></div>
</body>
</html>
