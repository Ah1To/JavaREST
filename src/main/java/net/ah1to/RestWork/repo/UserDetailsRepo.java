package net.ah1to.RestWork.repo;

import net.ah1to.RestWork.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
