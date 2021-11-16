
//*------------------ BOTON AGREGAR ------------------ *//

var modaladd = document.querySelector('.addbtn');
var formcontainer = document.querySelector('.form-container');
var closemodal = document.querySelectorAll('.exitbtn');


modaladd.addEventListener('click',function(){
    formcontainer.classList.add('form-container_active');
    console.log(closemodal);
    
});



//*------------------ BOTON EDITAR ------------------ *//

const modalUpdate = document.querySelectorAll('.editarBtn');
const formcontainerUpdate = document.querySelector('.form-containerUpdate');
const table = document.querySelector('.table');

//datos del formulario
const id = document.getElementById("id");
const documento = document.getElementById("documento");
const nombre = document.getElementById("nombre");
const apellidos = document.getElementById("apellidos");
const direccion = document.getElementById("direccion");
const celular = document.getElementById("celular");
const telefono = document.getElementById("telefono");


modalUpdate.forEach( btn => {
    btn.addEventListener("click", function(e){
        formcontainerUpdate.classList.add('form-container_active');
        let tr = btn.parentElement.parentElement;
        let row = tr.rowIndex;
 
        id.value = table.rows[row].cells[0].innerText;  
        nombre.value = table.rows[row].cells[1].innerText;  
        apellidos.value = table.rows[row].cells[2].innerText;
        documento.value = table.rows[row].cells[3].innerText;
        direccion.value = table.rows[row].cells[4].innerText; 
        celular.value = table.rows[row].cells[5].innerText; 
        telefono.value = table.rows[row].cells[6].innerText; 
        
    });    
 });
 
 //*------------------ BOTON ELIMINAR ------------------ *//
 
 const btnEliminar = document.querySelectorAll('.btnEliminar');
 const formcontainerEliminar = document.querySelector('.form-containerEliminar');
 var idCliente = document.getElementById("id_cliente");

 btnEliminar.forEach(btn =>{
     btn.addEventListener("click", function(e){
         idCliente.value = e.target.accessKey;

         formcontainerEliminar.classList.add('form-container_active');
     });
     
 });
 
 

//-------------------// CERRAR MODALES //-------------------//
closemodal.forEach( close => {
    close.addEventListener('click',function(){
        formcontainer.classList.remove('form-container_active');
        formcontainerUpdate.classList.remove('form-container_active');
        formcontainerEliminar.classList.remove('form-container_active');
    });
  });

