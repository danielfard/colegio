$(function() {
	listar(); 
	ActivarCampoOtroTema();
	
	
});

function agregarAlumnado() {
	/* Crear alumnado */
	// Seria crear esto mismo pero con los datos del formulario
	var newAlumnado = new Alumnado ("Nombre",
									"Apellido",
									"Apellido",
									123456,
									3124321243,
									"Email",
									2,
									new Date(2011,12,13),
									new Date(2011,11,11),
									"Observaciones")
	
	// Se envia a la api
	setAlumnado(newAlumnado, (data) => {
		console.log(data)
		addToList(data)
	})
}

function eliminarAlumnado(id) {
	
	// elimina al alumno con el id
	deleteAlumnado(id, (result) => {
		$('#alumn'+id).remove();
	})
}

function listar() {
	
	getAllAlumnados((data) => {
		console.log(data);
		$.each(data, function(i, e) {
	        $('#u-tabla').append(
	        	"<tr id='alumn"+e.id+"'>" +
	            "<td>" + e.nombre+ e.apellido_1 +" "+e.apellido_2 + "</td>" +
	            "<td>" + e.curso + "</td>" +
	            //"<td>" + e.acudiente.nombre + "</td>" +
	            "<td>" + e.fecha_alta + "</td>" +
	            "<td>" + e.fecha_baja + "</td>" +
	            "<td><button type='button' class='btn btn-primary'>Editar</button>"+"<button type='button' class='btn btn-light'>clases</button>" + "<button type='button' class='btn btn-danger' onclick='eliminarAlumnado("+e.id+")'>Eliminar</button></td>" +
	            "</tr>");
	    });
		
	})
	
	
   
}

// Para agregar al nuevo alumno a la lista
function addToList(e) {
	$('#u-tabla').append(
        	"<tr id='alumn"+e.id+"'>" +
            "<td>" + e.nombre+ e.apellido_1 +" "+e.apellido_2 + "</td>" +
            "<td>" + e.curso + "</td>" +
            //"<td>" + e.acudiente.nombre + "</td>" +
            "<td>" + e.fecha_alta + "</td>" +
            "<td>" + e.fecha_baja + "</td>" +
            "<td><button type='button' class='btn btn-primary'>Editar</button>"+"<button type='button' class='btn btn-light'>clases</button>" + "<button type='button' class='btn btn-danger' onclick='eliminarAlumnado("+e.id+")'>Eliminar</button></td>" +
            "</tr>");
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
