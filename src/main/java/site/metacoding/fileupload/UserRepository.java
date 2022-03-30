package site.metacoding.fileupload;

import org.springframework.data.jpa.repository.JpaRepository;

// 같은 패키지 내부에 있기 때문에 User를 import 하지 않아도됨 
public interface UserRepository extends JpaRepository<User, Integer> {

}
