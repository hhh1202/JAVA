package com.type01.cookies.models.attach;

import com.type01.cookies.models.cookie.CookieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttachRepository extends JpaRepository<AttachEntity, Long> {
	List<AttachEntity> findAllByCookie(CookieEntity cookie);
}
