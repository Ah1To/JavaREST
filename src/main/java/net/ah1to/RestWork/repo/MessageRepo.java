package net.ah1to.RestWork.repo;

import net.ah1to.RestWork.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
