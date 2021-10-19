package ru.testproject.shopwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.testproject.shopwarehouse.entity.Socks;

@Repository
public interface SocksRepository extends JpaRepository<Socks, Long> {
    Socks getSocksByCottonPartAndColor(int cottonPart, String color);
}
