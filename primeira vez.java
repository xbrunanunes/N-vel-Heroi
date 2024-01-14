// Definindo os valores iniciais
var heroName = 'Elfa da Noite';
var hp = 86;
var tier = 3160;
var tminDamage = 3675;

// Verificando o tier com base nas condições fornecidas
if (tier < 1000) tier = 'Iron';
else if (tier <= 2000) tier = 'Bronze';
else if (tier <= 5000) tier = 'Silver';
else if (tier <= 7000) tier = 'Gold';
else if (tier <= 8000) tier = 'Platinum';
else if (tier <= 9000) tier = 'Ascendant';
else if (tier <= 10000) tier = 'Immortal';
else tier = 'Radiant';

// Calculando o nível com base no dano do herói
var level = Math.round(tminDamage / 100);

// Exibindo o resultado
console.log("O herói " + heroName + " faz parte da classe " + tier + " e está no nível " + level + ".");
