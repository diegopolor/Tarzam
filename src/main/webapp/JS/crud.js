
//*------------------ BOTON AGREGAR ------------------ *//

var modaladd = document.querySelector('.addbtn');
var formcontainer = document.querySelector('.form-container');
var closemodal= document.querySelector('.exitbtn');


modaladd.addEventListener('click',function(){
    formcontainer.classList.add('form-container_active');
    console.log("hola");
});
closemodal.addEventListener('click',function(){
    formcontainer.classList.remove('form-container_active');
    console.log("hola");
});


//*------------------ BOTON EDITAR ------------------ *//

var modalUpdate = document.querySelectorAll('.editarBtn');
var formcontainer = document.querySelector('.form-container');
var closemodal= document.querySelector('.exitbtn');

modalUpdate.forEach( btn => {
    btn.addEventListener("click", function(e){
        console.log(e.target.accessKey ); 
        
    });    
 });
   



