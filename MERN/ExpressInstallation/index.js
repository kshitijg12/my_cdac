
const express = require("express");

const app = express();

//console.dir(app);
let port = 3000;
//creates a server on 3000 port.
//used for receiving requests on port
app.listen(port,()=>{
    console.log(`App is listening on port`);
});

// app.use((req,res)=>{
// console.log(req);
// console.log("Request received");
// //process text based request into object
// //sending response using response object

// //sending response as html text 
// // same response is received for all request routes.

// let str ="<h1>Fruits</h1><ul><li>mangoP</li><li>Guava</li><li>Papaya</li></ul>"
// res.send(str);
// });// end of app.use

// app.get("/",(req,res)=>{
//     res.send("This is new response for root '/'");
// }
// );

app.get("/apple",(req,res)=>{
    res.send("This is response for apple ");
}
);

//custom exception for illegal path address
// app.get("*",(req,res)=>{
//     res.send("This page does not exist");
// }
// );

//getting data via url path parameters

// app.get("/:username",(req,res)=>{
//     console.log(req.params);
//     res.send("Hello,i am root");
// }
// );

//getting url request with query string

app.get("/search",(req,res)=>{
    console.log(req.query);
    res.send("No results");
})

