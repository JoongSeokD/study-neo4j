package me.ljseokd.studyneo4j;

import me.ljseokd.studyneo4j.account.Account;
import me.ljseokd.studyneo4j.account.AccountRepository;
import me.ljseokd.studyneo4j.account.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Neo4JRunner implements ApplicationRunner {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Account account = new Account();
        account.setEmail("ljseokd@gmail.com");
        account.setName("Lee Joong Seok");

        Roles roles = new Roles();
        roles.setName("admin");

        account.getRoles().add(roles);

        accountRepository.save(account);

    }
}
