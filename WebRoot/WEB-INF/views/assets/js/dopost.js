	function calljs(){
       
		//var datastring = $("#f1").serialize();
		var datastring = $("#f1").serializeArray();
		//datastring.push({name: 'arry', value: 'f'});
				$.ajax({
				    type: "POST",
				    url: "../Fsmd_servlet",
				    data: datastring,
				    dataType: "json",
				    success: function (datastring) {
				        OnSuccess(datastring.errormsg)
				        alert("vivek"+datastring.errormsg);
				      },
				      error: function (e) {
				    	  alert("error"+e.value());
				       
				      }
				      
				});
					
				}//});
			