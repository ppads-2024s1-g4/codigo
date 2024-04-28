var btnGerenciarFilmes = document.querySelector("#btnGerenciarFilmes");
var sectionFilmes = document.querySelector("#sectionFilmes");
var landingPage = document.querySelector("#landingPage");
var sectionRecFilmes = document.querySelector("#recomendacoesFilmes");
var sectionRecSeries = document.querySelector("#recomendacoesSeries");
var sectionRecLivros = document.querySelector("#recomendacoesLivros");

var btnLogin = document.querySelector("#btnLoginSignUp");
var sectionLogin = document.querySelector("#sectionLoginSignUp");

var btnSignin = document.querySelector("#signin");
var btnSignup = document.querySelector("#signup");


btnGerenciarFilmes.addEventListener("click", function(){
    landingPage.style.display = "none";
    sectionFilmes.style.display = "block";
    sectionRecFilmes.style.display = "none";
    sectionRecSeries.style.display = "none";
    sectionRecLivros.style.display = "none";
    sectionLogin.style.display = "none";
})

btnLogin.addEventListener("click", function(){
    landingPage.style.display = "none";
    sectionFilmes.style.display = "none";
    sectionRecFilmes.style.display = "none";
    sectionLogin.style.display = "block";
})

btnFilmes.addEventListener("click", function(){
    
    sectionLogin.style.display = "none";
    landingPage.style.display = "none";
    sectionFilmes.style.display = "none";
    sectionRecFilmes.style.display = "block";
    sectionRecSeries.style.display = "none";
    sectionRecLivros.style.display = "none";
})

btnSeries.addEventListener("click", function(){
    landingPage.style.display = "none";
    sectionFilmes.style.display = "none";
    sectionRecFilmes.style.display = "none";
    sectionRecSeries.style.display = "block";
    sectionRecLivros.style.display = "none";
    sectionLogin.style.display = "none";
})

btnLivros.addEventListener("click", function(){
    landingPage.style.display = "none";
    sectionFilmes.style.display = "none";
    sectionRecFilmes.style.display = "none";
    sectionRecSeries.style.display = "none";
    sectionRecLivros.style.display = "block";
    sectionLogin.style.display = "none";
})


const loginContainer = document.getElementById('login-container')

const moveOverlay = () => loginContainer.classList.toggle('move')

document.getElementById('open-register').addEventListener('click', moveOverlay)
document.getElementById('open-login').addEventListener('click', moveOverlay)

document.getElementById('open-register-mobile').addEventListener('click', moveOverlay)
document.getElementById('open-login-mobile').addEventListener('click', moveOverlay)