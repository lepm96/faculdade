var i, altura, sexo, maioralt = 0, menoralt = 0, H = 0,M = 0, mediaM = 0, quantidadeM = 0, quantidadeH = 0;

for(i = 1 ;i <= 15; i++) {
    altura = parseInt(prompt("Informe sua altura["+i+"]: "));
    sexo = prompt("Sexo: M ou F: ")
    if(i == 1){
        menoralt = altura;
    } if(altura > maioralt){
        maioralt = altura;
    } if(altura < menoralt){
        menoralt = altura;
    } if(sexo == 'F'){
        M += altura;
        quantidadeM++;
    } else if(sexo == 'M'){
        H += altura;
        quantidadeH++;
    }
}

mediaM = M/quantidadeM;
alert("A maior altura é: "+maioralt);
alert("A menor altura é: "+menoralt);
alert("A media das mulheres é: " +quantidadeM);
alert("O numero de homens é: "+quantidadeH);