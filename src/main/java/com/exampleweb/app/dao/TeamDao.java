package com.exampleweb.app.dao;

import java.util.Optional;

import com.exampleweb.app.entity.Team;

public interface TeamDao {
    Team createTeam(String name);
    Team selectTeam(String name);
    boolean deleteTeam(String name);
}
