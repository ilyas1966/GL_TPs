console.log('Hello Node');
function addition(a, b) {
  const x = Number(a), y = Number(b);
  if (Number.isNaN(x) || Number.isNaN(y)) return 0;
  return x + y;
}

module.exports = { addition };
function soustraction(a, b) {
    return a - b;
}
console.log("Résultat soustraction:", soustraction(5, 3));