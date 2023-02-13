package buri.spring.basic.repository;

import buri.spring.basic.domain.Member;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>,
	MemberRepository {

	Optional<Member> findByNickname(String name);
}
