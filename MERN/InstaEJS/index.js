const express = require("express");

const app = express();

const port = 8080;

const path = require("path");

//required for uding ejs
app.set("view engine","ejs");
//for enabling access of views even when accessing form outside from current directory
app.set("views",path.join(__dirname,"/views"));

//Enable access of static files such as css and JS.
app.use(express.static("public/js"));

//Enable access of static files such as css and JS.
app.use(express.static("public/css"));

app.listen(port,()=>{
    console.log(`Server live on port ${port}`);
})

app.get("/",(req,res)=>{
    res.render("home.ejs");
})

//Conditional statements
app.get("/rollDice",(req,res)=>{
    let diceVal = Math.floor(Math.random() * 6)+1 ;
    //passing value to view  as key 
    res.render("rollDice.ejs",{diceVal: diceVal});
}
);

//Displaying dynamic web page by printing username
//Displaying list of followers
app.get("/ig/:username",(req,res)=>{
    const  followers = ["Adam","Eve","Peter","Tom","Dick","Harry"];

    let {username} = req.params;
    console.log(username);
    
    res.render("insta.ejs",{username,followers}); //res.render is required !!
});

//using data from data.json file to display on web page

app.get("/data/:username",(req,res)=>{  //taking input from query string :username

    let {username} = req.params; //and storing input from query string

    const instaDB = require("./data.json");
    const data = instaDB[username];
    if(data){
        console.log(data);
        res.render("instaDB.ejs",{data});
    }
     else{
        //sending a error page if username does not exist
        res.render("noUserErr.ejs");
     } 

})

// To remove repeatative html tags can be done by making a folder under views , name it "includes" create a file "head.ejs" under it.
//paste repeatative html tags under it

// <!DOCTYPE html>
// <html lang="en">
// <head>
//     <meta charset="UTF-8">
//     <meta name="viewport" content="width=device-width, initial-scale=1.0">
//     <title>InstaDB</title>
//     <style>
//     img {
//         height: 100px;
//     width: 100px
//     } 
//     </style>
// </head>

//write ejs tag in place of this code
// <%- Provides unescaped value i.e html code 
// <%- include("includes/head.ejs")%> !!! no slash before includes...or error