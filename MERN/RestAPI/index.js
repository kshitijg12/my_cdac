const express = require("express");

const app = express();

const port = 8080;
const path = require("path");

app.set("view engine","ejs");

//for accessing dynamic view pages of ejs with html and js.
app.set("views",path.join(__dirname,"views"));

// required for parsing encoded requests
app.use(express.urlencoded({extended: true}));

//for parsing json data
app.use(express.json());


//for accessing static pages of css and js
app.use(express.static(path.join(__dirname,"public"))); //we have to do app.use

//dummy data
let posts = [
    {
        id: "1",
        username : "Apna College",
        content : " I love Nodejs"
    },
    {
        id :"2",
        username : "Mera College",
        content : " I love ExpressJs"
    },
    {  id: "3",
        username : "Tumhara College",
        content : " I love ReactJs"
    }

]

app.listen(port,()=>{
console.log("App is listening on port : 8080");
});

app.get("/posts",(req,res)=>{
res.render("index.ejs",{posts});
});

app.get("/posts/new",(req,res)=>{
    res.render("new.ejs")
})

app.post("/posts",(req,res)=>{
  let {username,content} = req.body;
  posts.push({username,content});
  res.redirect("/posts"); //by default redirected to get
})

//fetching data by id
app.get("/posts/:id",(req,res)=>{
let {id} = req.params;
let post = posts.find((p) =>id === p.id);
console.log(id);
console.log(post);
//res.send("Request working");
res.render("show.ejs",{post});

});