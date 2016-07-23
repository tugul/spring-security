$(document).ready(function(){
	
	$("#logout").click(function(e){
		e.preventDefault();		// prevents default link to be loaded
		$("#logout-form").submit();
	});
});