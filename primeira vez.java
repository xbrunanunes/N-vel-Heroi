const heroName = "Elf"
let tier = 3160
let life = 86
let heroDamage = 7824
let tierMinimum = 1
console.log ("Welcome " + heroName,"Ready for another adventure?")
console.log ("You chose the " + heroName,"to play. The character has " + life,"of health", "and is at the tier " + heroDamage,"damage in your attack!")



if (tier < 1000) tier = 'Iron';
else if (tier <= 2000) tier = 'Bronze';
else if (tier <= 5000) tier = 'Silver';
else if (tier <= 7000) tier = 'Gold';
else if (tier <= 8000) tier = 'Platinum';
else if (tier <= 9000) tier = 'Ascendant';
else if (tier <= 10000) tier = 'Immortal';
else tier = 'Radiant';

level = Math.round(heroDamage / 100);
console.log("The hero " + heroName, "is " + tier, "tier and level " + level);