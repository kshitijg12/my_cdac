const express = require("express");
const app = express();

//to enable views to be accessed from anywhere
const path = require("path");


//setting up ejs view engine...
app.set("view engine","ejs");

//setting up views address to  be always searched  for global access
// __dirname gives current directory of index.js
app.set("views",path.join(__dirname,"/views"));

const port = 8080;
app.listen(port,(req,res)=>{
    console.log(`Listening on port ${port}`);  });

    app.get("/",(req,res)=>{
     res.render("home.ejs");
    });

    app.get("/rollDice",(req,res)=>{
        let diceVal = Math.floor(Math.random() * 6)+1 ;
        //passing value to view  as key 
        res.render("rollDice.ejs",{diceVal: diceVal});
    }
    )