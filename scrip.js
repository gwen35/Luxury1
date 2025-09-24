
let villes = {
    "Paris": [
        { auteur: "Alice", texte: "Super ville avec beaucoup de culture !" },
        { auteur: "Bob", texte: "J'adore la nourriture ici." }
    ],
    "Lyon": []
};

let villeActuelle = null;

function rechercherVille() {
    const input = document.getElementById("searchInput").value.trim();
    if (input === "") return alert("Entrez le nom d'une ville !");
    
    villeActuelle = input;

    if (!villes[villeActuelle]) {
        villes[villeActuelle] = [];
    }

    afficherCommentaires();
}

function afficherCommentaires() {
    document.getElementById("villeNom").innerText = villeActuelle;
    const commentairesList = document.getElementById("commentairesList");
    commentairesList.innerHTML = "";

    if (villes[villeActuelle].length === 0) {
        commentairesList.innerHTML = "<p>Aucun commentaire pour cette ville.</p>";
    } else {
        villes[villeActuelle].forEach(c => {
            const div = document.createElement("div");
            div.innerText = `${c.auteur} : ${c.texte}`;
            commentairesList.appendChild(div);
        });
    }
}

function ajouterCommentaire() {
    const auteur = document.getElementById("auteur").value.trim();
    const texte = document.getElementById("texteCommentaire").value.trim();

    if (auteur === "" || texte === "") {
        return alert("Remplissez votre nom et commentaire !");
    }

    villes[villeActuelle].push({ auteur, texte });
    document.getElementById("auteur").value = "";
    document.getElementById("texteCommentaire").value = "";
    afficherCommentaires();
}
