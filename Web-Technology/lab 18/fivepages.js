const http = require('http');
const fs = new require('fs');
const Server = http.createServer((req,res) => {
    a = req.url;
    res.setHeader(
        'Content-Type', 'text/html'
    )
    if (a == '/home') {
        fs.writeFile('Ffile1.txt', "hiii hello", (err) => {
            console.log('hiii hello');
        })
        fs.readFile('Ffile1.txt', (err,data) => {
            a=data.toString();
            res.end(a);
        })

    }
    else if (a == '/about') {
        fs.writeFile('Ffile2.txt', "about", (err) => {
            console.log('about');
        })
        fs.readFile('Ffile2.txt', (err,data) => {
            a=data.toString();
            res.end(a);
        })
    }
    else if (a == '/contact') {
        fs.writeFile('Ffile3.txt', "contact", (err) => {
            console.log('contact');
        })
        fs.readFile('Ffile3.txt', (err,data) => {
            a=data.toString();
            res.end(a);
        })
    }
    else if (a == '/help') {
        fs.writeFile('Ffile4.txt', "HELP", (err) => {
            console.log('HELP');
        })
        fs.readFile('Ffile4.txt', (err,data) => {
            a=data.toString();
            res.end(a);
        })
    }
    else if (a == '/other') {
        fs.writeFile('Ffile5.txt', "OTHER", (err) => {
            console.log('OTHER');
        })
        fs.readFile('Ffile5.txt', (err,data) => {
            a=data.toString();
            res.end(a);
        })
    }
    else {
        res.end('invalid')
    }
}).listen(3009, () => {
    console.log("server")
})