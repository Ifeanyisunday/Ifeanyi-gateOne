const prompt = require("prompt-sync")();
let lastPeriod = prompt("Enter last periood: ");
let periodStart = new Date(lastPeriod);
let cycleLength = prompt("Enter cycle length: ");
let periodEnd = new Date(periodStart);
periodEnd.setDate(periodStart.getDate() + 28);

let nextPeriod = new Date(periodEnd);
nextPeriod.setDate(periodEnd.getDate() + cycleLength);

let ovulationPeriod = new Date(nextPeriod);
ovulationPeriod.setDate(nextPeriod.getDate() - 14);

let fertilePeriod1 = new Date(ovulationPeriod);
fertilePeriod1.setDate(ovulationPeriod.getDate() - 5);

let fertilePeriod2 = new Date(ovulationPeriod);
fertilePeriod2.setDate(ovulationPeriod.getDate() + 2);

let safe1 = new Date(fertilePeriod1);
safe1.setDate(fertilePeriod1.getDate() - 1);

let safe2 = new Date(fertilePeriod2);
safe2.setDate(fertilePeriod2.getDate() + 1);

console.log("");
console.log("your last period was " + lastPeriod);
console.log("your next period is " + nextPeriod);
console.log("your ovulation day is " + ovulationPeriod);
console.log("your fertile period is between " + fertilePeriod1 + " and " + fertilePeriod2);
console.log("your safe period is between " + lastPeriod + "-" + safe1 + " and " + safe2 + "-" + nextPeriod);