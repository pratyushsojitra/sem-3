const fs = require('fs');
// fs.exists('Server.js',(exists)=>{
//    console.log(exists?'Found':'Not Found');
// });
// fs.stat('Server.js',(err,data)=>{
//     console.log(data);
    
// })
// const data = fs.readFileSync('Sher.txt');
// console.log(data.toString());

// fs.unlink('Sher.txt',(err)=>{
//     console.log("file deleted")
// });
fs.rename('Sher.txt','Sheru.txt',(err,data)=>{
    console.log("rename Sucessfully")
});


