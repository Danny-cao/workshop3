

// Voorbeeld POST
function sendArtikel(){
    document.querySelector("#submitVoorbeeld").addEventListener("click", function() {
        var formData = new FormData(document.querySelector("#voorbeeldPOST"));
        var encData = new URLSearchParams(formData.entries());
        fetch("restservices/artikel", { method: 'POST', body: encData })
            .then(response => response.json()).then( artikel => console.log(artikel));
    });
} sendArtikel();




//Opdracht1 
$("#submitOpdracht1").click(function() {
	$.ajax({
		url: '/path/to/file',	
		type: '',				
		dataType: "json",
		data: {
			param1: 'value1' 	//wat stuur je mee
		}
	})
	.done(function() {
		console.log("success");
	})
	.fail(function() {
		console.log("error");
	})
	.always(function() {
		console.log("complete");
	});
});

//Opdracht2
$("#submitOpdracht2").click(function() {
	$.ajax({
		url: '/path/to/file',
		type: '',
	})
	.done(function() {
		console.log("success");
	})
	.fail(function() {
		console.log("error");
	})
	.always(function() {
		console.log("complete");
	});
});

//Opdracht 3
$("#submitOpdracht3").click(function() {
	$.ajax({
		url: '/path/to/file',
		type: '',
		dataType: "json",
		data: {
			param1: 'value1'	//wat stuur je mee
		}
	})
	.done(function() {
		console.log("success"); 
	})
	.fail(function() {
		console.log("error");
	})
	.always(function() {
		console.log("complete");
	});
});









$("#locatie").click(function() {
	alert("geef gps coordinaten.");
	$( "#locatieDIV" ).append( "<p>Heidelberglaan 15, Utrecht</p>" );
});
