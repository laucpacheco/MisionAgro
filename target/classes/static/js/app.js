
/* frutas */
document.addEventListener('DOMContentLoaded', (event) => {
    
    const frutasContainer = document.querySelector('#frutasContainer');
    const shuffle = (array) => {
        array.sort(() => Math.random() - 0.5);
      }
    
    fetch('../public/data/frutas.json')
    .then(response => response.json())
    .then(data =>{

        shuffle(data);
        data.forEach(frutas => {
            frutasContainer.innerHTML += `
            <article class="col-3">
                <h2>${frutas.fruta}</h2>
                <img src="../img/frutas/${frutas.id}.jpg" alt="" width="200">
                <p><strong>clase: </strong>${frutas.clase}</p>
            </article>
            `
        })
        
        console.log(data);
    })
});

/* verduras */
document.addEventListener('DOMContentLoaded', (event) => {
    
    const verdurasContainer = document.querySelector('#verdurasContainer');
    const shuffle = (array) => {
        array.sort(() => Math.random() - 0.5);
      }
    
    fetch('../public/data/verduras.json')
    .then(response => response.json())
    .then(data =>{

        shuffle(data);
        data.forEach(verduras => {
            verdurasContainer.innerHTML += `
            <article class="col-3">
                <h2>${verduras.verdura}</h2>
                <img src="../img/verduras/${verduras.id}.jpg" alt="" width="200">
                <p><strong>clase: </strong>${verduras.clase}</p>
            </article>
            `
        })
        
        console.log(data);
    })
});

/* granos */
document.addEventListener('DOMContentLoaded', (event) => {
    
    const granosContainer = document.querySelector('#granosContainer');
    const shuffle = (array) => {
        array.sort(() => Math.random() - 0.5);
      }
    
    fetch('../public/data/granos.json')
    .then(response => response.json())
    .then(data =>{

        shuffle(data);
        data.forEach(granos => {
            granosContainer.innerHTML += `
            <article class="col-3">
                <h2>${granos.grano}</h2>
                <img src="../img/granos/${granos.id}.jpg" alt="" width="200">
                <p><strong>clase: </strong>${granos.clase}</p>
            </article>
            `
        })
        
        console.log(data);
    })
});

/* lacteos */
    document.addEventListener('DOMContentLoaded', (event) => {
        
        const lacteosContainer = document.querySelector('#lacteosContainer');
        const shuffle = (array) => {
            array.sort(() => Math.random() - 0.5);
          }
        
        fetch('../public/data/lacteos.json')
        .then(response => response.json())
        .then(data =>{
    
            shuffle(data);
            data.forEach(lacteos => {
                lacteosContainer.innerHTML += `
                <article class="col-3">
                <h2>${lacteos.lacteo}</h2>
                <img src="../img/lacteos/${lacteos.id}.jpg" alt="" width="200">
                <p><strong>clase: </strong>${lacteos.clase}</p>
            </article>
                `
            })
            
            console.log(data);
        })
    });

/* proteinas */
document.addEventListener('DOMContentLoaded', (event) => {
    
    const proteinasContainer = document.querySelector('#proteinasContainer');
    const shuffle = (array) => {
        array.sort(() => Math.random() - 0.5);
      }
    
    fetch('../public/data/proteinas.json')
    .then(response => response.json())
    .then(data =>{

        shuffle(data);
        data.forEach(proteinas => {
            proteinasContainer.innerHTML += `
            <article class="col-3">
                <h2>${proteinas.proteina}</h2>
                <img src="../img/proteinas/${proteinas.id}.jpg" alt="" width="200">
                <p><strong>clase: </strong>${proteinas.clase}</p>
            </article>
            `
        })
        
        console.log(data);
    })
});

/* otros */
document.addEventListener('DOMContentLoaded', (event) => {
    
    const otrosContainer = document.querySelector('#otrosContainer');
    const shuffle = (array) => {
        array.sort(() => Math.random() - 0.5);
      }
    
    fetch('../public/data/otros.json')
    .then(response => response.json())
    .then(data =>{

        shuffle(data);
        data.forEach(otros => {
            otrosContainer.innerHTML += `
            <article class="col-3">
                <h2>${otros.otro}</h2>
                <img src="../img/otros/${otros.id}.jpg" alt="" width="200">
                <p><strong>clase: </strong>${otros.clase}</p>
            </article>
            `
        })
        
        console.log(data);
    })
});





/* Scroll login */
/* document.addEventListener('DOMContentLoaded',() =>{
    console.log('Login Funcionando');
})

window.addEventListener('scroll', function(){
    let animacion = this.document.getElementById('animado');
    let posicionObjeto1 = animacion.getBoundingClientRect().top;
    console.log(posicionObjeto1);
    Para que me digan el tamaño al momento del dispositivo móvil
    let tamañodePantalla = window.innerHeight/4;
}) */