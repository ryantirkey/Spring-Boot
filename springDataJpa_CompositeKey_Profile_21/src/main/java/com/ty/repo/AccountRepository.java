package com.ty.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.entity.Account;
import com.ty.entity.AccountPK;

public interface AccountRepository extends JpaRepository<Account, AccountPK> {

}
