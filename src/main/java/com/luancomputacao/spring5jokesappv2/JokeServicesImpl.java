package com.luancomputacao.spring5jokesappv2;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServicesImpl implements JokeServices {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServicesImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override

    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
