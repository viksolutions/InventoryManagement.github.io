<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <%@ include file="/WEB-INF/views/header.jsp" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
</head>
<body>

<nav class="navbar navbar-default" role = "navigation">
  
   
    <ul class="nav navbar-nav">
      <li ><a href="succeshome.html">Home</a></li>
      <li class="active"><a href="#">IndentHome</a></li>
      <li><a href="indentview.html">Indent View</a></li>
      <li><a href="approve.html">Indent Approvals</a></li>
    </ul>
 
 </nav> 
   
<form:form id="Indentform" method="POST" action="/sdnext/indAdd.html" >
<div id="wrap">
<div class="container">
<div class="form-horizontal"  >

<div class="pagetitle  col-sm-12 text-center space-ten">Indent Home</div>
    
  <div class="form-group space-ten">
  <label class="control-label col-sm-2 col-lg-2 col-md-2" for="">Indent Date:</label>
				<div class="col-sm-2 col-lg-2 col-md-2">
				<div class="input-group date form_date" data-date="" data-date-format="yyyy/mm/dd" data-link-field="">
				<form:input class="form-control input-sm" type="text" name="IndDate" id="IndDate" path="ind_date" size="10" datepattern="yyyy/mm/dd" placeholder="" onchange="" />
				<span class="input-group-addon calander-blue"><span class="glyphicon glyphicon-th"></span></span>
				</div>
				</div>
  <label class="control-label col-sm-2 col-lg-2 col-md-2 " for="">Item Name</label> 
   <div class="col-sm-2 col-lg-2 col-md-2">
          <form:input class="form-control input-sm" id="item_name" path="item_name" /><!-- <p id="f1" style="display:none"><font color="red" >User Cannot Be Blank</font></p><br/><br/> -->
      
    <form:input type="hidden" id="itemId" name="itemId" path="ind_item_id" />
      </div> 
      
      <button class="btn btn-success" type="button" name="searchItem" id="searchItem" data-toggle="modal" data-target="#itemsearchmodal" onclick="loadItemList()" >Search</button> 
    
      </div> 
         
     <div class="form-group">     
  <label class="control-label col-sm-2 col-lg-2 col-md-2 " for="">From Dept</label>
  		<div class="col-sm-2 col-lg-2 col-md-2">
      
          <form:select class="form-control input-sm" id="ind_from_dept"  path="ind_from_dept" ><!-- <p id="f2" style="display:none"> <font  color="red" > Password Cannot Be Blank</font></p><br/><br/> -->   
         <option value="1">DepartmentOne</option>
         <option value="2">DepartmentTwo</option>
         <option value="3">DepartmentThree</option>
         </form:select>
         </div>
     <label class="control-label col-sm-2 col-lg-2 col-md-2 " for="">To Dept</label>
     <div class="col-sm-2 col-lg-2 col-md-2">
       <form:select class="form-control input-sm" id="ind_to_dept" path="ind_to_dept" ><!-- <p id="f2" style="display:none"> <font  color="red" > Password Cannot Be Blank</font></p><br/><br/> -->   
         <option value="1">DepartmentOne</option>
         <option value="2">DepartmentTwo</option>
         <option value="3">DepartmentThree</option>
         </form:select>   
         </div>
     
      </div>
 <div class="form-group"> 
 <label class="control-label col-sm-2 col-lg-2 col-md-2 " for="">Indent Quantity</label>
 <div class="col-sm-2 col-lg-2 col-md-2">
 <form:input class="form-control input-sm" id="ind_quantity" path="ind_quantity" /><!-- <p id="f1" style="display:none"><font color="red" >User Cannot Be Blank</font></p><br/><br/> -->
 </div>
 
 </div>
      
      <div class="form-group">
  
  <div class="col-sm-12 col-lg-12 col-md-12 space-ten text-center">  
         <button class="btn btn-success" type="submit" >Submit</button>
         
         </div>
        </div>
        
     </div>
        </div>
        </div>
        
     <div class="modal fade" id="itemsearchmodal" role="dialog">
    <div class="modal-dialog modal-large">
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header text-center">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Asset Search</h4>
        </div>
        <div class="modal-body">
            <div class="form-group">
                <label class="control-label col-sm-1 col-lg-1 col-md-1" for="">Item Name:</label>
                <div class="col-sm-3 col-lg-3 col-md-3">
                <input class="form-control input-sm itemsearch" type="text" id="itemSearchName" name="itemSearchName" />
                <span id="additemnameerror" class="asterror"></span>
                </div>
                
                <div class="col-sm-1 col-lg-1 col-md-1">
                <button type="button" class="btn btn-success" onclick="loadItemList()"><span class=""><i class="iconwhite fa fa-search" aria-hidden="true"></i></span> Search</button> 
                </div>
            </div>
<script>

$(document).ready(function() {
   $('#itemSearch').DataTable({
 responsive: true,
"paging":   false,  //paging 1 2 3
"ordering": true,  // sorting
"info":     false,  // showin data count
"searching": false, //search hide
   });
   $('#itemSearch').DataTable();
   });

function loadItemList(){
	
	
}
</script>	
        <div class="form-group">		
		<div class="fw-container">
		<div class="fw-body">
		<div class="content">
                <div id="example_wrapper" class="dataTables_wrapper">
                   
				<script>
$(document).ready(function() {
$('#IndentItems').DataTable({
"responsive": true,
"paging":   false,  //paging 1 2 3
"ordering": false,  // sorting
"info":     false,  // showin data count
"searching": false, //search hide
});
$('#IndentItems').DataTable();


});
function setname(namee,itmid){
	document.getElementById("itemId").value=itmid;
	document.getElementById("item_name").value=namee;
	
	$("#modclose").click();
}

				</script>

<c:if test="${!empty itemAjax}">
	 <table id="IndentItems" class="table display row-border hover order-column table-striped" cellspacing="0" width="100%">
		 <thead>
		<tr>
		<th>Item ID</th> 
			<th>Item Name</th> 
			<th>Item Status</th> 
						
		</tr>
</thead>
		<tbody>
		<c:forEach items="${itemAjax}" var="itemAjax">
			<tr>
			<td><c:out value="${itemAjax.item_id}"/></td> 
			<td><a href="#" onclick="setname('${itemAjax.item_name}','${itemAjax.item_id}')"><c:out value="${itemAjax.item_name}"/></a></td>
			<td><c:out value="${itemAjax.item_status}"/></td>
			
				
			</tr>
		</c:forEach>
		</tbody>
	</table>
</c:if>
                </div>				
                </div>
                </div>
                </div>            
        </div>
        <div class="form-group">		 
                <div class="col-sm-12 col-lg-12 col-md-12 text-center">			
                <button type="" class="btn btn-success " id="modclose" data-dismiss="modal"><i class="iconwhite fa fa-times"></i> Close</button>
                </div>
        </div>
        <div class="modal-footer text-center">
        </div>
        </div>
        </div>
      </div>      
    </div>
        
        
        
        
</form:form>
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
</body>
</html>