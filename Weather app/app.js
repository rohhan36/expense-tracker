const apiKey = "148d88271007c7eec693eee835e37bff";
const apiUrl = "https://api.openweathermap.org/data/2.5/weather?&units=metric&q=";

const searchBox = document.querySelector(".search input");
const searchBtn = document.querySelector("#main-button");


async function checkWeather(city){

    removeAutoCompleteDropdown();
    const weatherData = await fetch(apiUrl + city + `&appid=${apiKey}`);
    if(weatherData.status == 404) {
        document.querySelector(".error").style.display = "block";
        document.querySelector(".weather").style.display = "none";
        
    } else {
        
        document.querySelector(".error").style.display = "none";
        
        var data = await weatherData.json();
        console.log(data);

        const sunriseHour = new Date(data.sys.sunrise * 1000).getUTCHours("it-IT");
        const sunsetHour = new Date(data.sys.sunset * 1000).getUTCHours("it-IT");
        const currHour = new Date().getUTCHours();
        let folder = ""; 

        document.querySelector(".city").innerHTML = data.name;
        document.querySelector(".temp").innerHTML = Math.round(data.main.temp) +"°C";
        document.querySelector("#humidity").innerHTML = data.main.humidity + "%";
        document.querySelector("#wind-speed").innerHTML = Math.round(data.wind.speed) + " km/h";
        
        if(currHour <= sunsetHour + 0.5 && currHour >= sunriseHour) {
            folder = "sun";
        
        } else {
            folder = "moon";
        }

        let weatherSrc = "";
        if(data.weather[0].main == 'Clear')
            weatherSrc = `weather_icons/${folder}/clear.png`;  

        else if(data.weather[0].main == 'Clouds')
            weatherSrc = `weather_icons/${folder}/cloudy.png`;

        else if(data.weather[0].main == 'Mist' || data.weather[0].main == 'Haze' || data.weather[0].main == 'Smoke')
            weatherSrc = `weather_icons/${folder}/mist.png`;

        else if(data.weather[0].main == 'Rain')
            weatherSrc = `weather_icons/${folder}/rain.png`;

        else if(data.weather[0].main == 'Drizzle')
            weatherSrc = `weather_icons/${folder}/drizzle.png`;


        document.querySelector(".weather-icon").src = weatherSrc;
        document.querySelector(".weather").style.display = "block";
    }
}

function onInputChange() {

    removeAutoCompleteDropdown();
    
    const value = searchBox.value.toLowerCase();
    
    if(value.length == 0){
        removeAutoCompleteDropdown();
        return;
    }

    let filterdNames = [];
    cityNames.forEach(cityName => {
        if(cityName.toLowerCase().startsWith(value) && filterdNames.length <= 10)
            filterdNames.push(cityName);

        if(filterdNames.length == 10)
            return;
    });

    createAutoCompleteDropdown(filterdNames);
    console.log(filterdNames);
}

//for creating autocomplete list
function createAutoCompleteDropdown(list) {
    const listEl = document.createElement("ul");
    listEl.className = "auto-complete-list";

    list.forEach(city => {
        const listItem = document.createElement("li");

        const cityBtn = document.createElement("button");
        cityBtn.innerHTML = city;
        cityBtn.addEventListener("click" , onClickCityButton);
        listItem.appendChild(cityBtn);

        listEl.appendChild(listItem);
    });
    
    document.querySelector("#auto-complete-wrapper").appendChild(listEl);
}

//for removing the autocomplete list 
function removeAutoCompleteDropdown() {
    const listEl = document.querySelector(".auto-complete-list");
    if(listEl) listEl.remove();
}

//pushing all the cities available in an array 
let cityNames = [];
async function getCityData() {
    const data = await fetch("https://countriesnow.space/api/v0.1/countries");
    let cityData = await data.json();

    for(let i = 0; i < cityData.data.length; i++) {
        for(let j = 0; j < cityData.data[i].cities.length; j++) {
            cityNames.push(cityData.data[i].cities[j]);
        }
    }
    console.log(cityNames);
}

function onClickCityButton(e) {
    e.preventDefault();
    const buttonEl = e.target;
    searchBox.value = buttonEl.innerHTML;

    removeAutoCompleteDropdown();
    checkWeather(searchBox.value);
}

getCityData();

searchBox.addEventListener("input", onInputChange);
searchBtn.addEventListener("click", () => {checkWeather(searchBox.value);})

