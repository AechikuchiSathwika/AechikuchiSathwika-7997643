console.log("Welcome to commuinty Portal");
window.onload = function() {
    alert("Page fully loaded");
};
const events = [
    {id: 1, name: "Live Music Night", seats:20, category: "Music"},
    {id: 2, name: "Skill Development Workshop", seats:15, category: "Workshop"},
    {id: 3, name: "Community Sports Event", seats:10, category: "Sports"},
    {id: 4, name: "Art and craft exhibition", seats:12, category: "Art"},
    {id: 5, name: "Food Festival", seats:25, category: "Food"},
    {id: 6, name: "Tree Plantation Drive", seats:30, category: "Environment"}
];
function registerEvent(id){
    try{
        let event = events.find(e => e.id == id);
        if(!event) throw "Event not found";
        if(event.seats > 0){
            event.seats--;
            alert(`Registered for ${event.name}. Seats lefr ${event.seats}`);
        } else{
            alert("No seats available");
        }

        displayEvents();
    } catch(error){
        console.log("Error: ", error);
    }
}

function showAvailableEvents(){
    events.forEach(e => {
        if(e.seats > 0){
            console.log("Available:",e.name);
        }
    });
}

function createCounter(){
    let total = 0;
    return function() {
        total++;
        console.log("Total registrations: ", total);
    };
}
const trackRegistration = createCounter();
function Event(name,seats){
    this.name = name;
    this.seats = seats;
}
Event.prototype.checkAvailability = function() {
    return this.seats > 0;
};
let sample = new Event("Demo Event",10);
console.log(Object.entries(sample));

let eventNames = events.map(e => e.name);
console.log(eventNames);
//Dom manipulation this connects to #events in index.html
function displayEvents(){
    let container = document.querySelector(#events);
    if(!container) return;
    container.innerHTML = "";
    events.forEach(event => {
        let div = document.createElement("div");
        div.className = "card p-3 m-2";
        div.innerHTML = `
            <h5>${event.category}</h5>
            <p>Category: ${event.seats}</p>
            <p>Seats: ${event.seats}</p>
            <button class = "btn btn-primary" onclick = "registerEvent(${event.id})">
                Register
            </button>
        `;
        container.appendChild(div);
    });
}
displayEvents();

document.addEventListener("keydown", function(){
    console.log("Key pressed");
});

async function fetchEvents(){
    try{
        let res = await fetch("https://jsonplaceholder.typicode.com/posts");
        let data = await res.json();
        console.log("Fetched data: ", data);
    } catch(error){
        console.log("Fetch error");
    }
}
fetchEvents();

const copyEvents = [...events];
const showEvent = (name = "Default Event") => {
    console.log(name);
};
showEvent("Community Event");

document.addEventListener("DOMContentLoaded",function() {
    let form = document.querySelector("form");
    if(form){
        form.addEventListener("submit", function(e) {
            e.preventDefault();
            let name= form.elements[0].value;
            alert("Registered: " + name);
        });
    }
});

fetch("https://jsonplaceholder.typicode.com/posts",{
    method: "POST",
    body: JSON.stringify({name: "User"}),
    headers: {
        "Content-Type": "application/json"
    }
})
.then(res => res.json())
.then(data => console.log("POST Success: ", data))
.catch(err => console.log("Error"));

let helplink = document.querySelector('a[href= help.html]');
if(helplink){
    helplink.addEventListener("click", function(){
        console.log("Help page opened");
    });
}