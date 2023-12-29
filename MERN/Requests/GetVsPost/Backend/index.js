const express =require("express");

const app = express();

const port = 8080;

// required for parsing encoded requests
app.use(express.urlencoded({extended: true}));

//for parsing json data
app.use(express.json());


app.listen(port,()=>{
    console.log(`App is listening on port ${port}`);
})

app.get("/register",(req,res)=>{
   //parsing is not required as data is received as query string
    let {username,password} = req.query;
    res.send(`Get response. Welcome ${username}`)
    console.log("Get response. ");
});

app.post("/register",(req,res)=>{
    //parsing is required as data is received as json object, app.use needs to be declared.
    let {username,password} = req.body; //data is received in the request body
    res.send(`Post Response. Welcome ${username}`)
    console.log("Post response")
});



