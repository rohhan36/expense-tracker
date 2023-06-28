const p1Button = document.querySelector('#p1-button');
const p2Button = document.querySelector('#p2-button');
const reset = document.querySelector('#reset');
const scoreTarget = document.querySelector('#scoreTarget');
let maxScore = 0;

scoreTarget.addEventListener('change', () => {
    maxScore = scoreTarget.value;
})

p1Button.addEventListener('click' , () => {
    const p1Score = document.querySelector('#p1');
    const p2Score = document.querySelector('#p2');
    let score = parseInt(p1Score.innerText);
    p1Score.innerText = `${score + 1}`;

    score = parseInt(p1Score.innerText);
    if(score == maxScore) {
        setColor(p1Score, 'blue');
        setColor(p2Score, 'red');
        disableBtn(p1Button);
        disableBtn(p2Button);
    }
});

p2Button.addEventListener('click' , () => {
    const p1Score = document.querySelector('#p1');
    const p2Score = document.querySelector('#p2');
    let score = parseInt(p2Score.innerText);
    p2Score.innerText = `${score + 1}`;

    score = parseInt(p2Score.innerText);
    if(score == maxScore) {
        setColor(p2Score, 'blue');
        setColor(p1Score, 'red');
        disableBtn(p1Button);
        disableBtn(p2Button);
    }
});

reset.addEventListener('click', () => {
    location.reload();
});

function setColor(element, color) {
    element.style.color = `${color}`;
}

function disableBtn(button){
    button.disabled = true;
}



