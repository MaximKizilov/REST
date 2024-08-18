package ru.netology.repository;

import org.springframework.stereotype.Repository;
import ru.netology.Authorities;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {
    Map<AbstractMap.SimpleEntry<String, String>, List <Authorities>> userAuthorities= Map.of
            (
                    new AbstractMap.SimpleEntry<>("Petrov", "12345"), new ArrayList<>(List.of(Authorities.DELETE, Authorities.WRITE, Authorities.READ)),
                    new AbstractMap.SimpleEntry<>("Ivanov", "54321"),  new ArrayList<>(List.of(Authorities.READ)),
                    new AbstractMap.SimpleEntry<>("Sidorov", "56789"),  new ArrayList<>(List.of(Authorities.DELETE,  Authorities.READ))

            );

    public List<Authorities> getUserAuthorities(String user, String password) {
        return userAuthorities.get(new AbstractMap.SimpleEntry<>(user, password));
    }
}