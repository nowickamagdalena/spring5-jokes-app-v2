package guru.springframework.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService{
    private final ChuckNorrisQuotes quotes;

    public JokeServiceImpl() {
        this.quotes = new ChuckNorrisQuotes();
    }

    public String getJoke(){
        return quotes.getRandomQuote();
    }
}
