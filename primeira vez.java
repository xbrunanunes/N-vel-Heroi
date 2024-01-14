
var readyToPlay = confirm("Boas vindas, pronta para jogar?");

if (readyToPlay) {
    var heroName = 'Elfa da Noite';
    var hp = 86;
    var tier = 3160;
    var tminDamage = 1;
    if (tier < 1000) tier = 'Iron';
    else if (tier <= 2000) tier = 'Bronze';
    else if (tier <= 5000) tier = 'Silver';
    else if (tier <= 7000) tier = 'Gold';
    else if (tier <= 8000) tier = 'Platinum';
    else if (tier <= 9000) tier = 'Ascendant';
    else if (tier <= 10000) tier = 'Immortal';
    else tier = 'Radiant';
    var level = Math.round(tminDamage / 100);

    console.log("O herói " + heroName + " está no tier " + tier + " e está no nível " + level + ".");
} else {
    console.log("Até a próxima!");
}
