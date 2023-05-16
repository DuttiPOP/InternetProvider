package com.hyper_wave.internetprovider.objects;

import java.util.List;

public class Client extends User {

    private List<Request> requests;
    private List<Treaty> treaties;

    public List<Request> getRequests() {
        return requests;
    }

    public List<Treaty> getTreaties() {
        return treaties;
    }
}
