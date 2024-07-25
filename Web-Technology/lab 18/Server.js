const http = require("http")
const Server = http.createServer((req,res)=>{
res.end("Server")
})
Server.listen(3000,()=>{
    console.log("hii mavii")
})