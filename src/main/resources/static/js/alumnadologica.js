$(function() {
	listar(); 
	ActivarCampoOtroTema();
});

function listar() {
	$.ajax("./api/v1/alumnado",
    		{
    		contentType: "application/json",
    		dataType:'json',
    		type: "GET",
    		success:function(datos){
    			console.log(datos);
    			 $.each(datos, function(i, e) {
    			        $('#u-tabla').append(
    			        	"<tr>" +
    			            "<td>" + e.nombre+ e.apellido_1 +" "+e.apellido_2 + "</td>" +
    			            "<td>" + e.curso + "</td>" +
    			            "<td>" + e.acudiente.nombre + "</td>" +
    			            "<td>" + e.fecha_alta + "</td>" +
    			            "<td>" + e.fecha_baja + "</td>" +
    			            "<td><button type='button' class='btn btn-primary'>Editar</button>"+"<button type='button' class='btn btn-light'>clases</button>" + "<button type='button' class='btn btn-danger'>Eliminar</button></td>" +
    			            "</tr>");
    			    });
    			
    		}
    		
    });
   
}

var clic=1;
function ActivarCampoOtroTema(){
	var contenedor = document.getElementById("OtroTema");
	 if(clic==1){

		 contenedor.style.display = "none";

		   clic = clic + 1;

		   } else{

			   contenedor.style.display = "block";    

		    clic = 1;

		   }   
	
	return true;
	}
