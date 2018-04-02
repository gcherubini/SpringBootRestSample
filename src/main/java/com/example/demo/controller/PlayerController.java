package com.example.demo.controller;

import com.example.demo.dao.PlayerDao;
import com.example.demo.domain.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

    private static final String ENDPOINT = "/playersWithoutSpringRestData";

    @Autowired
    PlayerDao dao;

    @RequestMapping(ENDPOINT)
    public List<Player> getPlayers()  {
        return dao.findAll();
    }

    @RequestMapping(ENDPOINT + "/{name}")
    public Player getPlayerByName(@PathVariable String name)  {
        return dao.findByName(name);
    }
}
