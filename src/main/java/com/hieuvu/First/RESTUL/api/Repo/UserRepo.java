package com.hieuvu.First.RESTUL.api.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hieuvu.First.RESTUL.api.Model.User;

public interface UserRepo extends JpaRepository< User, Long>{

}