package com.paynet.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.paynet.project.wallet.Wallet;

@Repository
public interface WalletRepository extends CrudRepository<Wallet, String>{

}
