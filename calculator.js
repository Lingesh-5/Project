const bodyEl = document.querySelector("body");

const h1El = document.createElement("h1");
h1El.id ="title";
h1El.innerText ="Calculator";
h1El.classList.add("text-center");

const pEl = document.createElement("p");
pEl.id = "description";
pEl.innerText = "A calculator to perform basic arithmetic operations.";
pEl.classList.add("text-center");


const divEl = document.createElement("div");
divEl.classList.add("container");
divEl.classList.add("border");
divEl.classList.add("border-dark-subtle");
divEl.classList.add("text-center");

const divRowEl = document.createElement("div");
divRowEl.classList.add("row");

const divColEl = document.createElement("div");
divColEl.classList.add("col");
divColEl.classList.add("m-3");

const inputEl = document.createElement("input");
inputEl.classList.add("form-control");
inputEl.type = "text";
inputEl.id = "result";
inputEl.style.backgroundColor = "darkgray";
inputEl.placeholder = "0";

divColEl.appendChild(inputEl);
divRowEl.appendChild(divColEl);
const divRow1El = document.createElement("div");
divRow1El.classList.add("row");
divRow1El.classList.add("m-3");

const values = ["C", "<-", ".", "x"];
const divCol1El = document.createElement("div");
divCol1El.classList.add("col");

const buttonEl = document.createElement("button");
buttonEl.classList.add("btn");
buttonEl.classList.add("btn-outline-danger");
buttonEl.style.borderColor = "white";
buttonEl.innerText = "C";
buttonEl.id = "clear";
buttonEl.addEventListener("click", () => {
  inputEl.value = "";
});

const divCol2El = document.createElement("div");
divCol2El.classList.add("col");

const button1El = document.createElement("button");
button1El.classList.add("btn");
button1El.classList.add("btn-outline-primary");
button1El.style.borderColor = "white";
button1El.innerText = "%";
button1El.addEventListener("click", (e) => {
  inputEl.value += e.target.innerText;
});

const divCol3El = document.createElement("div");
divCol3El.classList.add("col");

const button2El = document.createElement("button");
button2El.classList.add("btn");
button2El.classList.add("btn-outline-primary");
button2El.style.borderColor = "white";
button2El.innerText = ".";
button2El.addEventListener("click", (e) => {
  inputEl.value += e.target.innerText;
});

const divCol4El = document.createElement("div");
divCol4El.classList.add("col");

const button3El = document.createElement("button");
button3El.classList.add("btn");
button3El.classList.add("btn-outline-primary");
button3El.style.borderColor = "white";
button3El.innerText = "x";
button3El.addEventListener("click", (e) => {
  inputEl.value += e.target.innerText;
});

divCol1El.appendChild(buttonEl);
divCol2El.appendChild(button1El);
divCol3El.appendChild(button2El);
divCol4El.appendChild(button3El);

divRow1El.append(divCol1El, divCol2El, divCol3El, divCol4El);

const divRow2El = document.createElement("div");
divRow2El.classList.add("row");
divRow2El.classList.add("m-3");

const divCol5El = document.createElement("div");
divCol5El.classList.add("col");

const button4El = document.createElement("button");
button4El.classList.add("btn");
button4El.classList.add("btn-light");
button4El.innerText = "7";
button4El.addEventListener("click", (e) => {
  inputEl.value += e.target.innerText;
});

const divCol6El = document.createElement("div");
divCol6El.classList.add("col");

const button5El = document.createElement("button");
button5El.classList.add("btn");
button5El.classList.add("btn-light");
button5El.innerText = "8";
button5El.addEventListener("click", (e) => {
  inputEl.value += e.target.innerText;
});

const divCol7El = document.createElement("div");
divCol7El.classList.add("col");

const button6El = document.createElement("button");
button6El.classList.add("btn");
button6El.classList.add("btn-light");
button6El.innerText = "9";
button6El.addEventListener("click", (e) => {
  inputEl.value += e.target.innerText;
});

const divCol8El = document.createElement("div");
divCol8El.classList.add("col");

const button7El = document.createElement("button");
button7El.classList.add("btn");
button7El.classList.add("btn-outline-primary");
button7El.style.borderColor = "white";
button7El.innerText = "/";
button7El.addEventListener("click", (e) => {
  inputEl.value += e.target.innerText;
});

divCol5El.appendChild(button4El);
divCol6El.appendChild(button5El);
divCol7El.appendChild(button6El);
divCol8El.appendChild(button7El);

divRow2El.append(divCol5El, divCol6El, divCol7El, divCol8El);

const divRow3El = document.createElement("div");
divRow3El.classList.add("row");
divRow3El.classList.add("m-3");

const divCol9El = document.createElement("div");
divCol9El.classList.add("col");

const button8El = document.createElement("button");
button8El.classList.add("btn");
button8El.classList.add("btn-light");
button8El.innerText = "4";
button8El.addEventListener("click", (e) => {
  inputEl.value += e.target.innerText;
});

const divCol10El = document.createElement("div");
divCol10El.classList.add("col");

const button9El = document.createElement("button");
button9El.classList.add("btn");
button9El.classList.add("btn-light");
button9El.innerText = "5";
button9El.addEventListener("click", (e) => {
  inputEl.value += e.target.innerText;
});

const divCol11El = document.createElement("div");
divCol11El.classList.add("col");

const button10El = document.createElement("button");
button10El.classList.add("btn");
button10El.classList.add("btn-light");
button10El.innerText = "6";
button10El.addEventListener("click", (e) => {
  inputEl.value += e.target.innerText;
});

const divCol12El = document.createElement("div");
divCol12El.classList.add("col");

const button11El = document.createElement("button");
button11El.classList.add("btn");
button11El.classList.add("btn-outline-primary");
button11El.style.borderColor = "white";
button11El.id ="subtract";
button11El.innerText = "-";
button11El.addEventListener("click", (e) => {
  inputEl.value += e.target.innerText;
});

divCol9El.appendChild(button8El);
divCol10El.appendChild(button9El);
divCol11El.appendChild(button10El);
divCol12El.appendChild(button11El);

divRow3El.append(divCol9El, divCol10El, divCol11El, divCol12El);

const divRow4El = document.createElement("div");
divRow4El.classList.add("row");
divRow4El.classList.add("m-3");

const divCol13El = document.createElement("div");
divCol13El.classList.add("col");

const button12El = document.createElement("button");
button12El.classList.add("btn");
button12El.classList.add("btn-light");
button12El.id = "1";
button12El.innerText = "1";
button12El.addEventListener("click", (e) => {
  inputEl.value += e.target.innerText;
});

const divCol14El = document.createElement("div");
divCol14El.classList.add("col");

const button13El = document.createElement("button");
button13El.classList.add("btn");
button13El.classList.add("btn-light");
button13El.id = "2";
button13El.innerText = "2";
button13El.addEventListener("click", (e) => {
  inputEl.value += e.target.innerText;
});

const divCol15El = document.createElement("div");
divCol15El.classList.add("col");

const button14El = document.createElement("button");
button14El.classList.add("btn");
button14El.classList.add("btn-light");
button14El.id ="3";
button14El.innerText = "3";
button14El.addEventListener("click", (e) => {
  inputEl.value += e.target.innerText;
});

const divCol16El = document.createElement("div");
divCol16El.classList.add("col");

const button15El = document.createElement("button");
button15El.classList.add("btn");
button15El.classList.add("btn-outline-primary");
button15El.style.borderColor = "white";
button15El.id ="add";
button15El.innerText = "+";
button15El.addEventListener("click", (e) => {
  inputEl.value += e.target.innerText;
});

divCol13El.appendChild(button12El);
divCol14El.appendChild(button13El);
divCol15El.appendChild(button14El);
divCol16El.appendChild(button15El);

divRow4El.append(divCol13El, divCol14El, divCol15El, divCol16El);

const divRow5El = document.createElement("div");
divRow5El.classList.add("row");
divRow5El.classList.add("m-3");

const divCol17El = document.createElement("div");
divCol17El.classList.add("col-3");

const button16El = document.createElement("button");
button16El.classList.add("btn");
button16El.classList.add("btn-light");
button16El.innerText = "0";
button16El.addEventListener("click", (e) => {
  inputEl.value += e.target.innerText;
});

const divCol18El = document.createElement("div");
divCol18El.classList.add("col-3");

const button17El = document.createElement("button");
button17El.classList.add("btn");
button17El.classList.add("btn-light");
button17El.innerText = "00";
button17El.addEventListener("click", (e) => {
  inputEl.value += e.target.innerText;
});

const divCol19El = document.createElement("div");
divCol19El.classList.add("col-6");

const divButtonLargeEl = document.createElement("div");
divButtonLargeEl.classList.add("d-grid");
divButtonLargeEl.classList.add("gap-2");

const button18El = document.createElement("button");
button18El.classList.add("btn");
button18El.classList.add("btn-primary");
button18El.id = "equal";
button18El.innerText = "=";
button18El.addEventListener("click", (e) => {
  if (
    inputEl.value.includes("%") &&
    !inputEl.value.includes("/") &&
    !inputEl.value.includes("x") &&
    !inputEl.value.includes("+") &&
    !inputEl.value.includes("-")
  ) {
    modulus();
  } else if (
    inputEl.value.includes("/") &&
    !inputEl.value.includes("x") &&
    !inputEl.value.includes("+") &&
    !inputEl.value.includes("-") &&
    !inputEl.value.includes("%")
  ) {
    division();
  } else if (
    inputEl.value.includes("x") &&
    !inputEl.value.includes("+") &&
    !inputEl.value.includes("-") &&
    !inputEl.value.includes("%") &&
    !inputEl.value.includes("/")
  ) {
    multiplication();
  } else if (
    inputEl.value.includes("+") &&
    !inputEl.value.includes("-") &&
    !inputEl.value.includes("%") &&
    !inputEl.value.includes("/") &&
    !inputEl.value.includes("x")
  ) {
    addition();
  } else if (
    inputEl.value.includes("-") &&
    !inputEl.value.includes("%") &&
    !inputEl.value.includes("/") &&
    !inputEl.value.includes("x") &&
    !inputEl.value.includes("+")
  ) {
    subtraction();
  } else {
    evaluate();
  }
});

divCol17El.appendChild(button16El);
divCol18El.appendChild(button17El);

divButtonLargeEl.appendChild(button18El);
divCol19El.appendChild(divButtonLargeEl);

divRow5El.append(divCol17El, divCol18El, divCol19El);

divEl.append(divRowEl, divRow1El, divRow2El, divRow3El, divRow4El, divRow5El);

bodyEl.append(h1El , pEl, divEl);

document.addEventListener("keydown", (e) => {
  const validKeys = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"];
  const value = e.key;

  if (!validKeys.includes(value)) {
    alert("Only numbers are allowed");
  } else {
    inputEl.value += value;
  }
});

function modulus() {
  let result = 0;
  let i = 0;
  const inputValue = inputEl.value;
  const numbers = inputValue.split("%");
  const numberConverted = numbers.map((num) => {
    return parseFloat(num);
  });
  const sub = numberConverted.map((num) => {
    if (i == 0) {
      result = num;
      i++;
      return result;
    }
    result = result % num;
    return result;
  });
  inputEl.value = result;
}

function division() {
  let result = 0;
  let i = 0;
  const inputValue = inputEl.value;
  const numbers = inputValue.split("/");
  const numberConverted = numbers.map((num) => {
    return parseFloat(num);
  });
  const sub = numberConverted.map((num) => {
    if (i == 0) {
      result = num;
      i++;
      return result;
    }
    result = result / num;
    return result;
  });
  inputEl.value = result;
}

function multiplication() {
  let result = 0;
  let i = 0;
  const inputValue = inputEl.value;
  const numbers = inputValue.split("x");
  const numberConverted = numbers.map((num) => {
    return parseFloat(num);
  });
  const sub = numberConverted.map((num) => {
    if (i == 0) {
      result = num;
      i++;
      return result;
    }
    result = result * num;
    return result;
  });
  inputEl.value = result;
}

function addition() {
  let result = 0;
  const inputValue = inputEl.value;
  const numbers = inputValue.split("+");
  const numberConverted = numbers.map((num) => {
    return parseFloat(num);
  });
  const add = numberConverted.map((num) => {
    result = result + num;
    return result;
  });
  inputEl.value = result;
}

function subtraction() {
  let result = 0;
  let i = 0;
  const inputValue = inputEl.value;
  const numbers = inputValue.split("-");
  const numberConverted = numbers.map((num) => {
    return parseFloat(num);
  });
  const sub = numberConverted.map((num) => {
    if (i == 0) {
      result = num;
      i++;
      return result;
    }
    result = result - num;
    return result;
  });
  inputEl.value = result;
}

function evaluate() {
  const inputValue = inputEl.value;
  const result = eval(inputValue);
  inputEl.value = result;
}
