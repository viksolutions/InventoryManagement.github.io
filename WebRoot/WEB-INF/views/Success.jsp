<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<%@ include file="/WEB-INF/views/header.jsp" %>
<style>
.pagetitle
{
    font-family: 'Lato', Calibri, Arial, sans-serif!important;  
    color:#99BD3E;
    font-size: 24px!important;
    font-weight:bolder;
    margin-bottom: 30px;
}
.bed-occupide
{
border:0px solid;
border-radius:4px;
min-height: 112px;
min-width:100%;
padding:4px;
margin:5px;
background-color:#fd4a38f2;
-webkit-box-shadow: 0px 25px 81px 1px rgba(194,194,194,1);
-moz-box-shadow: 0px 25px 81px 1px rgba(194,194,194,1);
box-shadow: 0px 25px 81px 1px rgba(194,194,194,1);
}
.bed-available
{
border:0px solid;
border-radius:4px;
min-height: 112px;
min-width:100%;
padding:4px;
margin:5px;
/* background-color:#89C161; */
<!-- 24b755 -->
-webkit-box-shadow: 0px 25px 81px 1px rgba(194,194,194,1);
-moz-box-shadow: 0px 25px 81px 1px rgba(194,194,194,1);
box-shadow: 0px 25px 81px 1px rgba(194,194,194,1);
}
.bed-available:hover
{

/* background-color:#89C161; */
-webkit-box-shadow: 0px -1px 48px -4px rgba(0,0,0,0.49);
-moz-box-shadow: 0px -1px 48px -4px rgba(0,0,0,0.49);
box-shadow: 0px -1px 48px -4px rgba(0,0,0,0.49);
<!-- background-color:#98FB98; -->
}

.glyp{
font-size:40px;
color:light-black;
text-shadow:2px 2px 4px #000000;
}
.clickableFont {
     cursor: pointer
}
</style>
<script>
$(document).ready(function(){
 $("#abouts").click(function () {
        document.location.href = "about.html";
    });
 
 
 $("#home").click(function () {
     document.location.href = "home.html";
 });
 
 $("#inden").click(function () {
     
	 document.location.href = "indhome.html";
     
 });
 
$("#foundr").click(function () {
     
	document.location.href = "founder.html";
     
 });
 
$("#recepton").click(function () {
    
	document.location.href = "recptionhm.html";
     
 });
 
$("#billhm").click(function () {
    
	document.location.href = "billinhm.html";
     
 });
$("#dochm").click(function () {
    
	document.location.href = "doctorhm.html";
     
 });
 
$("#apptments").click(function () {
    
	document.location.href = "apptmt.html";
     
 });
$("#phrmcy").click(function () {
    
	document.location.href = "pharmcy.html";
     
 });
 
$("#wareHouse").click(function () {
    
	document.location.href = "pharmcywh.html";
     
 });
$("#stckmgt").click(function () {
    
	document.location.href = "stckmgmt.html";
     
 });
$("#asstmgt").click(function () {
    
	document.location.href = "assetmgmt.html";
     
 });
$("#staffmgt").click(function () {
    
	document.location.href = "staffmgmt.html";
     
 });
 
$("#hskeep").click(function () {
    
	document.location.href = "housekeep.html";
     
 });
 
$("#linemgt").click(function () {
    
	document.location.href = "linenmgmt.html";
     
 });

$("#ott").click(function () {
    
	document.location.href = "ot.html";
     
 });
 
$("#wardd").click(function () {
    
	document.location.href = "ward.html";
     
 });
 $("#labb").click(function () {
	    
		document.location.href = "lab.html";
	     
	 });
 
 $("#safftyy").click(function () {
	    
		document.location.href = "saffty.html";
	     
	 });
 
 $("#contcts").click(function () {
	    
		document.location.href = "contct.html";
	     
	 });
 
 $("#helps").click(function () {
	    
		document.location.href = "helps.html";
	     
	 });
 
 $("#recepton").click(function () {
	    
		document.location.href = "recptnhome.html";
	     
	 });
 
});


    </script>
</head>
<body>
<div id="wrap">
<div class="container">
<form:form method="post" action="Success">
<div class="col-lg-2 col-md-2 col-sm-2 space-twenty"></div>
<div class="pagetitle h2 col-sm-12 text-center">Dash Board</div>

<div class="row">
 <label class="control-label col-sm-1 col-lg-1 col-md-1" for=""></label>

 <div class="col-lg-2 col-md-2 col-sm-2 centerWrapper clickableFont" id="home" >
		<div class="col-lg-2 col-md-2 col-sm-2 bedd  bed-available text-center" style="background-color:#89c161; vertical-align: middle">
		<div class="space-ten" id=""></div> 
		<i class="glyphicon glyphicon-home glyp" style="padding-top:10px;padding-bottom:10px"></i>
	
		<div class="space-ten" id="">Home</div>
	
		</div>
		
		</div>
		
		
		<div class="col-lg-2 col-md-2 col-sm-2 text-center clickableFont" >
		<div class="bedd  bed-available " style="background-color:#ec9994" id="foundr">
		<div class="space-ten" id=""></div> 
		<i class="fa fa-user-md fa-2x" aria-hidden="true" style="padding-top:10px;padding-bottom:10px"></i>
		<div class="space-ten" id="">Founder</div>
		</div>
		
		</div>
		
		
		<div class="col-lg-2 col-md-2 col-sm-2 text-center clickableFont" >
		<div class="bedd  bed-available " style="background-color:#c19961" id="recepton"> 
		<div class="space-ten" id=""></div>
		<i class="fa fa-stethoscope fa-2x" aria-hidden="true" style="padding-top:10px;padding-bottom:10px"></i>
		<div class="space-ten" id="">Reception</div>
		</div>
		
		</div>
		<div class="col-lg-2 col-md-2 col-sm-2 text-center clickableFont" >
		<div class="bedd  bed-available " style="background-color:#c16189" id="billhm">
		<div class="space-ten" id=""></div> 
		<i class="fa fa-certificate fa-2x" aria-hidden="true" style="padding-top:10px;padding-bottom:10px"></i>
		<div class="space-ten" id="">Billing</div>
		</div>
		</div>
		
		<div class="col-lg-2 col-md-2 col-sm-2 text-center clickableFont" >
		<div class="bedd  bed-available " style="background-color:#b9c161" id="dochm"> 
		<div class="space-ten" id=""></div>
		<i class="fa fa-certificate fa-2x" aria-hidden="true" style="padding-top:10px;padding-bottom:10px"></i>
		<div class="space-ten" id="">Doctors</div>
		</div>
		</div>
		
		</div>
		<div class="row">
 <label class="control-label col-sm-1 col-lg-1 col-md-1" for=""></label>
 <div class="col-lg-2 col-md-2 col-sm-2 centerWrapper clickableFont">
		<div class="col-lg-2 col-md-2 col-sm-2 bedd  bed-available text-center" style="background-color:#cbec94; vertical-align: middle" id="apptments">
		<div class="space-ten" id=""></div> 
		<i class="fa fa-certificate fa-2x" aria-hidden="true" style="padding-top:10px;padding-bottom:10px"></i>
		<div class="space-ten" id="">Appointments</div>
		</div>
		
		</div>
		<div class="col-lg-2 col-md-2 col-sm-2 text-center clickableFont" >
		<div class="bedd  bed-available " style="background-color:#94d4ec" id="phrmcy"> 
		<div class="space-ten" id=""></div>
		<i class="fa fa-certificate fa-2x" aria-hidden="true" style="padding-top:10px;padding-bottom:10px"></i>
		<div class="space-ten" id="">pharmacy</div>
		</div>
		
		</div>
		<div class="col-lg-2 col-md-2 col-sm-2 text-center clickableFont" >
		<div class="bedd  bed-available " style="background-color:#af94ec" id="wareHouse"> 
		<div class="space-ten" id=""></div>
		<i class="fa fa-certificate fa-2x" aria-hidden="true" style="padding-top:10px;padding-bottom:10px"></i>
		<div class="space-ten" id="">Ware House</div>
		</div>
		
		</div>
		<div class="col-lg-2 col-md-2 col-sm-2 text-center clickableFont" >
		<div class="bedd  bed-available " style="background-color:#e794ec" id="inden"> 
		<div class="space-ten" id=""></div>
		<i class="fa fa-certificate fa-2x" aria-hidden="true" style="padding-top:10px;padding-bottom:10px"></i>
		<div class="space-ten" id="">Indent</div>
		</div>
		</div>
		
		<div class="col-lg-2 col-md-2 col-sm-2 text-center clickableFont" >
		<div class="bedd  bed-available " style="background-color:#94c7ec" id="stckmgt">
		<div class="space-ten" id=""></div> 
		<i class="fa fa-certificate fa-2x" aria-hidden="true" style="padding-top:10px;padding-bottom:10px"></i>
		<div class="space-ten" id="">Stock Management</div>
		</div>
		</div>
		
		</div>
		
		<div class="row">
 <label class="control-label col-sm-1 col-lg-1 col-md-1" for=""></label>
 <div class="col-lg-2 col-md-2 col-sm-2 centerWrapper clickableFont">
		<div class="col-lg-2 col-md-2 col-sm-2 bedd  bed-available text-center" style="background-color:#89c161; vertical-align: middle" id="asstmgt"> 
		<div class="space-ten" id=""></div>
		<i class="fa fa-certificate fa-2x" aria-hidden="true" style="padding-top:10px;padding-bottom:10px"></i>
		
		<div class="space-ten" id="">Assset Management</div>
		</div>
		
		</div>
		<div class="col-lg-2 col-md-2 col-sm-2 text-center clickableFont" >
		<div class="bedd  bed-available " style="background-color:#6189c1" id="staffmgt"> 
		<div class="space-ten" id=""></div>
		<i class="fa fa-user-md fa-2x" aria-hidden="true" style="padding-top:10px;padding-bottom:10px"></i>
		<div class="space-ten" id="">Staff Management</div>
		</div>
		
		</div>
		<div class="col-lg-2 col-md-2 col-sm-2 text-center clickableFont" >
		<div class="bedd  bed-available " style="background-color:#c19961" id="hskeep"> 
		<div class="space-ten" id=""></div>
		<i class="fa fa-money fa-2x" aria-hidden="true" style="padding-top:10px;padding-bottom:10px"></i>
		<div class="space-ten" id="">House Keeping</div>
		</div>
		
		</div>
		<div class="col-lg-2 col-md-2 col-sm-2 text-center clickableFont" >
		<div class="bedd  bed-available " style="background-color:#c16189" id="linemgt"> 
		<div class="space-ten" id=""></div>
		<i class="fa fa-certificate fa-2x" aria-hidden="true" style="padding-top:10px;padding-bottom:10px"></i>
		<div class="space-ten" id="">Linen Management</div>
		</div>
		</div>
		
		<div class="col-lg-2 col-md-2 col-sm-2 text-center clickableFont" >
		<div class="bedd  bed-available " style="background-color:#b9c161" id="ott">
		<div class="space-ten" id=""></div> 
		<i class="fa fa-certificate fa-2x" aria-hidden="true" style="padding-top:10px;padding-bottom:10px"></i>
		<div class="space-ten" id="">OT</div>
		</div>
		</div>
		
		</div>
		
		<div class="row">
 <label class="control-label col-sm-1 col-lg-1 col-md-1" for=""></label>
 <div class="col-lg-2 col-md-2 col-sm-2 centerWrapper clickableFont">
		<div class="col-lg-2 col-md-2 col-sm-2 bedd  bed-available text-center" style="background-color:#bf94ec; vertical-align: middle" id="wardd"> 
		<div class="space-ten" id=""></div>
		<i class="fa fa-certificate fa-2x" aria-hidden="true" style="padding-top:10px;padding-bottom:10px"></i>
		<div class="space-ten" id="">Ward Management</div>
		</div>
		
		</div>
		<div class="col-lg-2 col-md-2 col-sm-2 text-center clickableFont" >
		<div class="bedd  bed-available " style="background-color:#94e5ec" id="labb"> 
		<div class="space-ten" id=""></div>
		<i class="fa fa-certificate fa-2x" aria-hidden="true" style="padding-top:10px;padding-bottom:10px"></i>
		<div class="space-ten" id="">Lab Management</div>
		</div>
		
		</div>
		
		<div class="col-lg-2 col-md-2 col-sm-2 text-center clickableFont" >
		<div class="bedd  bed-available " style="background-color:#bf94ec" id="safftyy"> 
		<div class="space-ten" id=""></div>
		<i class="fa fa-certificate fa-2x" aria-hidden="true"  style="padding-top:10px;padding-bottom:10px"></i>
		<div class="space-ten" id="">Safety Management</div>
		</div>
		
		</div>
		<div class="col-lg-2 col-md-2 col-sm-2 text-center clickableFont" >
		<div class="bedd  bed-available " style="background-color:#ec94b7" id="abouts"> 
		<div class="space-ten" id=""></div>
		<i class="glyphicon glyphicon-user glyp" style="padding-top:10px;padding-bottom:10px"></i>
			<div class="space-ten" id="">about us</div>
		</div>
		
		</div>
		<div class="col-lg-2 col-md-2 col-sm-2 text-center clickableFont" >
		<div class="bedd  bed-available " style="background-color:#e5ec94" id="contcts"> 
		<div class="space-ten" id=""></div>
		<i class="glyphicon glyphicon-envelope glyp" style="padding-top:10px;padding-bottom:10px"></i>
		<div class="space-ten" id="">Contact us</div>
		</div>
		</div>
		
		
		
		</div>
		<div class="row">
		<label class="control-label col-sm-1 col-lg-1 col-md-1" for=""></label>
 		<div class="col-lg-2 col-md-2 col-sm-2 centerWrapper clickableFont" >
		<div class="col-lg-2 col-md-2 col-sm-2 bedd  bed-available text-center" style="background-color:#89c161; vertical-align: middle" id="helps">
		
		<div class="space-ten" id=""></div>
		<i class="glyphicon glyphicon-question-sign glyp" style="padding-top:10px;padding-bottom:10px"></i>
		<div class="space-ten" id="">Help</div>
		</div>
		</div>
		</div>
</form:form>

    </div>
</div>
</body>
</html>