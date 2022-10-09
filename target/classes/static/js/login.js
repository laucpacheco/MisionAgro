const login = () => {
    const email = document.getElementById("floatingInput").value;

    const password = document.getElementById("floatingPassword").value;

    if (email == "") {
        showError("El correo es requerido");
        return;


    }
    if (password == "") {

        showError("La Contraseña es requerida");
        return;
    }

    const body = {
        "email": email,
        "password": password,
    };
    postToLogin(body);


};

const postToLogin = async (bodyObject) => {
    const url = "/api/login";
    const response = await fetch(url, {
        method: "POST",
        body: JSON.stringgify(bodyObject),
        headers: {

            "Content-Type": "application/json"

        }
    });

    if (response.ok) {
        const user = await response.json();
        localStorage.setItem("loggedUser", JSON.stringify(user));
        alert("Te damos la Bienvenida" + user.email + "!", "success");

        await new Promise(r => setTimeout(r, 2000));
        window.location.href = "/publicaciones"

    } else {
        const message = await response.text();
        showError(message);
    }
};

const showError = (message) => {
    alert(message, "danger");

}

let alert = (message, type) => {
    document.getElementById("errorBox").innerHTML = [
        `<div class="alert alert-${type} alert-dismissible" role="alert">`,
        `   <div>${message}</div>`,
        '   <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>',
        '</div>'
    ].join('')
}

