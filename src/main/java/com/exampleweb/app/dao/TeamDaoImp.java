package com.exampleweb.app.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.exampleweb.app.entity.Team;

public class TeamDaoImp implements TeamDao{

    private static List<Team> teams = new ArrayList<>();
    private static int newId = 1;

    @Override
    public Team createTeam(String name) {
        Team newTeam = new Team(newId, name);
        teams.add(newTeam);
        newId++;
        return newTeam;
    }

    @Override
    public Team selectTeam(String name) {
        for (Team t : teams){
            if (t.getTeamName().equals(name)){
                return t;
            }
        }
        return new Team();
    }

    @Override
    public boolean deleteTeam(String name) {
        for (Team t : teams){
            if (t.getTeamName().equals(name)){
                teams.remove(t);
                return true;
            }
        }
        return false;
    }
    
}
