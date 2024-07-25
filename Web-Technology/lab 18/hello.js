var http = require("http");

var server=  http.createServer((req,res)=>{
    res.statusCode = 200;
    res.setHeader('Content-Type' , 'text/html')
    res.end("hello world");
})

server.listen(4000,
    () => {
        console.log("server");
    }
);