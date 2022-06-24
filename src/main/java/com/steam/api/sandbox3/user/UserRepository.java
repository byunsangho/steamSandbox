package com.steam.api.sandbox3.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findBySteamId(String steamId);

    User findFirstBy();


}
