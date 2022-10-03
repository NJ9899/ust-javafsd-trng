class demo{

    id:number
    name1:string

    constructor(id,name1){
        this.id=id
        this.name1=name1               
    }

    displayInformation(){
        console.log("ID: "+this.id+"\n"+"Name: "+this.name1+"\n")
    }

}

var obj = new Array(new demo(1,'Raj'),new demo(2,'Rahul'),new demo(3,'Heera'))
obj
for(var i=0;i<obj.length;i++){
    obj[i].displayInformation()
    console.log("-------------------------")
}
