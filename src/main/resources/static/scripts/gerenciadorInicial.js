var btnGerenciarFilmes = document.querySelector("#btnGerenciarFilmes");
var sectionFilmes = document.querySelector("#sectionFilmes");
var landingPage = document.querySelector("#landingPage");
var sectionCatalogo = document.querySelector("#services");

btnGerenciarFilmes.addEventListener("click", function(){
landingPage.style.display = "none";
sectionFilmes.style.display = "block";
sectionCatalogo.style.display = "none";

})
