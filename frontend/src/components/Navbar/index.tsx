import React from 'react';
import logo from './logo.svg';
import {ReactComponent as GithubIcon} from 'assets/img/github.svg'; //pegando o caminho da imagem direto
import './styles.css';

function Navbar(){

    return(
        <header>
        <nav className="container"> 
            <div className="dsmovie-nav-content">
                <h1>DSMovie</h1>
                <a href="https://github.com/devsuperior" target="_blank" rel="noreferrer">
                    <div className="dsmovie-contact-container">
                        <GithubIcon />
                        <p className="dsmovie-contact-link">/devsuperior</p>
                    </div>
                </a>
            </div>
        </nav>
    </header>
    );
}

export default Navbar;