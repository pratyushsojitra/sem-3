const http = require('http');
const Server = http.createServer((req,res) => {
    fs.writeFile('Ffile1.txt', "hiii hello", (err) => {
        console.log('hiii hello');
    })
    fs.readFile('Ffile1.txt', (err,data) => {
        a=data.toString();
        res.end(a);
    })
}).listen(3009, () => {
    console.log("server");
})